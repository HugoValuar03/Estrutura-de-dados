package arvoreBinária.altura;

public class Principal {
    public static void main(String[] args) {
        // Cria um exemplo de árvore binária
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Calcula e exibe a altura da árvore
        System.out.println("A altura da árvore binária é: " + tree.height(tree.root));
    }
}
