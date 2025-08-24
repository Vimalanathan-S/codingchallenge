class Solution {
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> c=new ArrayList<>();
        if (a.length==1){
            List<Integer>l=new ArrayList<>();
            l.add(a[0]);
            c.add(l);
            return c;
        }
        for (int i=0;i<a.length;i++){
            int x= a[i];
            int[] b=new int[a.length - 1];
            int k =0;
            for (int j=0;j<a.length;j++) {
                if (j != i){
                    b[k]=a[j];
                    k++;
                }
            }
            List<List<Integer>> p =permute(b);
            for (List<Integer> y:p) {
                y.add(0, x);
            }
            c.addAll(p);
        }
        return c;
    }
}
