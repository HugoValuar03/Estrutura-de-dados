package PilhaDinamica;
public class Principal {
    public static void main(String[] args) {
        // Pilha Dinâmica

        PilhaDinamica pilhaD = new PilhaDinamica();

        pilhaD.push(30);
        pilhaD.push(20);
        pilhaD.push(15);
        pilhaD.push(25);

        pilhaD.imprimirTodos();

        System.out.println("Tamanho da pilha: " + pilhaD.tamanho());

        pilhaD.pop();

        pilhaD.imprimirTodos();

        pilhaD.isEmpty();

        pilhaD.tamanho();

        System.out.println("Tamanho da pilha: " + pilhaD.tamanho());

    }
}
