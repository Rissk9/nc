class Solution {
    public static int findDuplicate(int[] a) {
        breakapart(a, 0, a.length-1);
        for(int i:a){
            System.out.println(i);
        }
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1])
                return a[i];
        }
        return -1;
    }
    static void breakapart(int[] a,int l,int r){
        if (l<r) {
            int mid=(l+r)/2;
            breakapart(a, l, mid);
            breakapart(a, mid+1, r);
            merge(a, l, r, mid);
        }
    }
    static void merge(int[] a,int l,int r,int mid){
        int n1=mid-l+1;
        int n2=r-(mid+1)+1;
        
        int[] a1=new int[n1];
        int a2[]=new int[n2];

        for(int i=0;i<n1;i++){
            a1[i]=a[l+i];
        }
        for(int i=0;i<n2;i++){
            a2[i]=a[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;
        while (i<a1.length && j<a2.length) {
            if (a1[i]<=a2[j]) {
                a[k]=a1[i];
                i++;
                k++;
            }
            else
            {
                a[k]=a2[j];
                j++;
                k++;
            }
        }
        while (i<a1.length) {
            a[k]=a1[i];
            i++;
            k++;
        }
        while(j<a2.length){
            a[k]=a2[j];
            j++;
            k++;
        }
    }
}
