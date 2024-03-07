package PilhaDinamica;

public class No {

    private int elemento;
    private No proximo;

    public No(int valor){
        this.elemento = valor;
        this.proximo = null;        
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}