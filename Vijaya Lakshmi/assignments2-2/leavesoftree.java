import java.util.*;


class Node {
    
    int val;
    Node right;
    Node left; 
   
   public Node(int item)
    {
        val=item;
        right=null;
        left=null;
    }

}





 class tree {


    Node root;

    tree()
    {
           root=null;
    }
    
    


    tree(int item)
    {
         root=new Node(item);
    }



public
     Node insert(Node root,int item)
    {


      if(root==null)
      {
         root=new Node(item);
         return root;
      }


      else if(root.val>item)
      {
         root.left= insert(root.left,item);
      }


      else if(root.val<item)
      {
        root.right= insert(root.right,item);
      }

     
     
        return root;
     
    
    }





    void leaves(Node root)
    {
       
        if(root==null)
        {
           return;    
        }

        if(root.left==null &&  root.right==null)
        {
             System.out.println(root.val); 
             return;  
        }

        if(root.left!=null)
            leaves(root.left);

         if(root.right!=null)
           leaves(root.right);   

    }


    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }
    }

}






public class leavesoftree {

    public static void main(String[] args)
    {
        System.out.println("enter the number of nodes of the tree:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        tree t=new tree();
         Node root=null ;
         for(int i=0;i<n;i++)
            {
                int node=in.nextInt();
                t.insert(root,node);

            }  
            
            System.out.println("The leaves nodes are:");
        
            t.leaves(root);
         // t.inorderRec(root);
    }
}
