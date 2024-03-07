package FilaDinamica;

public class Principal{

    public static void main(String[] args) {
        FilaDinamica<Integer> filaD = new FilaDinamica<>();

        filaD.adicionar(30);
        filaD.adicionar(20);
        filaD.adicionar(13);
        filaD.adicionar(17);
        filaD.adicionar(14);
        filaD.adicionar(13);

        filaD.imprimirTodos();
        
        filaD.retirar();

        filaD.imprimirTodos();

        System.out.println(filaD.isEmpty());
    }
}