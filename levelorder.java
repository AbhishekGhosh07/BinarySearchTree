public class levelorder {
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
   
}
