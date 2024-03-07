package Estático;

public record Principal() {
    public static void main(String[] args) {

        PilhaEstatica p = new PilhaEstatica(3);
        p.push(20);
        p.push(30);
        p.push(40);

        p.imprimir();
        System.out.println();
        p.pop();
        p.imprimir();

        FilaEstatica  f = new FilaEstatica(3);
        
        f.inserir(20);
        f.inserir(30);
        f.inserir(40);

    }

}
