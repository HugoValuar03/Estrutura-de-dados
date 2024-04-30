package arvoreBinária.buscaItem;

public class Principal {
    public static void main(String[] args) {
        PesquisaArvore tree = new PesquisaArvore();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree:");
        tree.inorder();

        System.out.println("\n\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();

        System.out.println("\n\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();

        System.out.println("\n\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
    }
}
