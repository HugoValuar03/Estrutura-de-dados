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

/*
1 - Implementar uma Pilha Dinâmica, com os seguintes Métodos:

Inserir dado na Pilha --
Remove dado na Pilha --
Retorna o Tamanho da Pilha --
Retorna se a Pilha está vazia -- 
Imprimir os dados da Pilha

2 - Implementar uma Fila Dinâmica, com os seguintes Métodos:

Inserir dado na Fila
Remove dado na Fila
Retorna o Tamanho da Fila
Retorna se a Fila está vazia
Imprimir os dados da Fila
 */