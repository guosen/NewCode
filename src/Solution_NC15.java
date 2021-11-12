import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 树的层序遍历
 * 一层一层打印
 */
public class Solution_NC15 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        q.add(root);//第一节点
        while(!q.isEmpty()){
            int size = q.size();//1
            ArrayList<Integer>rec = new ArrayList<>();
            while(size!=0){
                TreeNode node = q.peek();
                q.poll();
                rec.add(node.val);
                if (node.left!=null) {
                    q.add(node.left);
                }
                if (node.right!=null) {
                    q.add(node.right);
                }
                size--;
            }
            if(rec.size()>0)result.add(rec);

        }
        return result;
    }


    public static void main(String[]args){
        Solution_NC15 solution_nc15 = new Solution_NC15();
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        root.left = left;
        solution_nc15.levelOrder(null);
    }

    public static class TreeNode{
        int val = 0;
        public TreeNode(int val){
            this.val = val;
        }
        TreeNode left = null;
        TreeNode right = null;
    }
    /*
     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     * }
     */
}
