package arvoreBinária.ordem_preOrdem_posOrdem;

public class No {
    int chave; // Valor do nó
    No esquerda, direita; // Referências para os nós filhos

    // Construtor para inicializar o nó com uma chave
    public No(int item) {
        chave = item;
        esquerda = direita = null;
    }
}