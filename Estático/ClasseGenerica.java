package Estático;


public class ClasseGenerica<T> {

    private int vetor[] = new int[5];

    private T valor;
    public ClasseGenerica() {
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        ClasseGenerica<Integer> obj = new ClasseGenerica<>();
        obj.setValor(25);
        System.out.println(obj.getValor());
    }
}