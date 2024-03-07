package PilhaDinamica;

public class PilhaDinamica {

    private No topo;
    public PilhaDinamica(){
        this.topo = null;
    }

    public void push(int elemento){
        No noAux = new No(elemento);
        noAux.setProximo(this.topo);
        this.topo = noAux;
    }

    public void pop(){
        No noAux = this.topo;
        this.topo = noAux.getProximo();
        noAux.setProximo(null);
    }

    public int tamanho(){
        int tamanho = 0;
        No atual = this.topo;
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }

    public void isEmpty(){
        if(this.topo == null){
           System.out.println("Pilha vazia");
        } else {
           System.out.println("Pilha não está vazia");
        }
    }

    public void imprimirTodos(){
        No atual = this.topo;
        System.out.println("Impressão dos elementos da pilha:");
        while(atual != null){
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }
}
