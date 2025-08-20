class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums);
    }
    public TreeNode build(int[] nums) {
        if (nums.length==0){
            return null;
        }
        int mid =nums.length/2;
        TreeNode root=new TreeNode(nums[mid]);
        int[] left=new int[mid];
        for (int i=0; i<mid;i++) {
            left[i]=nums[i];
        }
        int[] right=new int[nums.length - mid - 1];
        for (int i=mid+1;i<nums.length; i++) {
            right[i-mid-1]=nums[i];
        }
        root.left = build(left);
        root.right = build(right);
        return root;
    }
}
