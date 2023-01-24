public class sumOfNodes {
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;

        }
        int leftNode =  sumOfNodes(root.left);
        int rightNode = sumOfNodes(root.right);
        return leftNode+rightNode+root.data;
    }
    
}
