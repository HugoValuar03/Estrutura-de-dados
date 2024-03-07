package FilaDinamica;

public class FilaDinamica<T> {
 
    private No<T> inicio;
    private No<T> fim;

    public FilaDinamica(){
        this.inicio = null;
        this.fim = null;
    }

    public void adicionar(T elemento){
        No<T> noAux = new No<T>(elemento);
        if(isEmpty()){
            inicio = noAux;
            fim = noAux;
        } else {
            fim.setProximo(noAux);
            fim = noAux;
        }

    }

    public T retirar(){
        if(!isEmpty()){
            T elementoRemovido = inicio.getElemento();
            inicio = inicio.getProximo();

            if(inicio == null){
                fim = null;
            }

            return elementoRemovido;
        } else {
            throw new IllegalStateException("Sua fila está vazia");
        }
    }

    public int tamanho(){
        int tamanho = 0;
        No<T> atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }

    public boolean isEmpty(){
        if(this.inicio == null){
            return true;
        } else {
            return false;
        }
    }

    public void imprimirTodos(){
        No<T> atual = inicio;
        System.out.println("Impressão dos elementos da pilha:");
        while(atual != null){
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
        System.out.println();
    }

}
