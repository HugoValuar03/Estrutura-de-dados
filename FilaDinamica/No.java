package FilaDinamica;

public class No<T> {

    private T elemento;
    private No<T> proximo;

    public No(T elemento2) {
        //TODO Auto-generated constructor stub
    }
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    
    

    
}
