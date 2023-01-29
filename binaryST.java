public class binaryST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right = null;
        }
    }
    public static Node insert(Node root , int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(val>root.data){
            root.right = insert(root.right,val);

        }
        else{
            root.left = insert(root.left,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null)
        return;

        inorder(root.left);
        System.out.println(root.data+"->");
        inorder(root.right);
    }
    public static void main(String[] args){
            int values[] ={5,1,3,4,2};
            Node root = null;
            for(int i=0 ; i<values.length;i++){
                insert(root, values[i]);
            }
            inorder(root);
            System.out.println();
    }
}
