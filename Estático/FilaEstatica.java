package Estático;

public class FilaEstatica {

    private int posicaoFila;
    private int filaArray[];

    public FilaEstatica(int tamanho) {
        filaArray = new int[tamanho];
        posicaoFila = 0;
    }
    public void inserir(int conteudo){
        filaArray[posicaoFila] = conteudo;
        posicaoFila ++;
    }
    public void remove(){
        filaArray[0] = 0;
    }
    
}
