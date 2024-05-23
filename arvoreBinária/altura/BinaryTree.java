package arvoreBinária.altura;

public class BinaryTree {
    Node root;

    // Método para calcular a altura da árvore binária
    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            // Calcula a altura das subárvores esquerda e direita
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            // Retorna a maior altura entre as duas subárvores mais 1 (para a raiz atual)
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
