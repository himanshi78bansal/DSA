public class create{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{    // O(n)
        static int idx = -1; 
        public static Node build(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = build(nodes);
            newnode.right = build(nodes);
            return newnode;
        }

        public static void preorder(Node root){ // O(n)
            if(root == null){
                // System.out.print("-1"+" ");
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.build(nodes);
        System.out.println(root.data);

        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
    }
}