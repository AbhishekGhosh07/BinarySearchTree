import java.util.*;

public class BinaryTreeYT{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right = null;
        }
    }
    public static class BinaryTree{
        static int idex = -1;
        public static Node buildTree(int nodes[]){
            idex++;
            if(nodes[idex]==-1){
                return null;
            }
            Node newN = new Node(nodes[idex]);
            newN.left = buildTree(nodes);
            newN.right = buildTree(nodes);

                
            return newN;

        }
    }
    public static void preorder(Node root){
        if(root == null)
        return;

        System.out.print(root.data+" -> ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null)
        return;

        inorder(root.left);
        System.out.println(root.data+"->");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);    
    }
    public static void levelorder(Node root){
        if(root==null){
            return;

        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node x = q.remove();
            if(x==null){
                System.out.println();
                if(!q.isEmpty()){
                    
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                System.out.print(x.data+" ");
                if(x.left!=null)
                  q.add(x.left);
                if(x.right!=null)    
                  q.add(x.right);
            }
        }
    }
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes+rightNodes+1;

    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;

        }
        int leftNode =  sumOfNodes(root.left);
        int rightNode = sumOfNodes(root.right);
        return leftNode+rightNode+root.data;
    }
    public static int height(Node root){
        if(root ==null){
            return 0;

        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(height(root));
    

    }

}