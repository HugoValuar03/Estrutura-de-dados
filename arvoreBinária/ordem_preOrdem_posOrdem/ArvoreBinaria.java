package arvoreBinária.ordem_preOrdem_posOrdem;

public class ArvoreBinaria {
    No raiz; // Referência para o nó raiz da árvore

    // Construtor para inicializar a árvore com a raiz nula

    public ArvoreBinaria(No raiz) {
        this.raiz = raiz;
    }

    public ArvoreBinaria(){

    }

    // Método para inserir um novo nó na árvore
    void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    // Método auxiliar recursivo para inserção
    No inserirRec(No raiz, int chave) {
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }

        // Se a chave for menor que a chave do nó atual, insere à esquerda
        if (chave < raiz.chave)
            raiz.esquerda = inserirRec(raiz.esquerda, chave);
        // Se a chave for maior que a chave do nó atual, insere à direita
        else if (chave > raiz.chave)
            raiz.direita = inserirRec(raiz.direita, chave);

        return raiz;
    }

    // Método para realizar a travessia em ordem na árvore
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    // Método auxiliar recursivo para travessia em ordem
    void emOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerda);
            System.out.print(raiz.chave + " ");
            emOrdemRec(raiz.direita);
        }
    }

    // Método para realizar a travessia pré-ordem na árvore
    void preOrdem() {
        preOrdemRec(raiz);
    }

    // Método auxiliar recursivo para travessia pré-ordem
    void preOrdemRec(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.chave + " ");
            preOrdemRec(raiz.esquerda);
            preOrdemRec(raiz.direita);
        }
    }

    // Método para realizar a travessia pós-ordem na árvore
    void posOrdem() {
        posOrdemRec(raiz);
    }

    // Método auxiliar recursivo para travessia pós-ordem
    void posOrdemRec(No raiz) {
        if (raiz != null) {
            posOrdemRec(raiz.esquerda);
            posOrdemRec(raiz.direita);
            System.out.print(raiz.chave + " ");
        }
    }
}