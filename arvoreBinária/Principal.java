package arvoreBinária;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserção de alguns valores na árvore
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        // Imprime a travessia em ordem
        System.out.println("Travessia em ordem:");
        arvore.emOrdem();
        System.out.println("\nTravessia pré-ordem:");
        arvore.preOrdem();
        System.out.println("\nTravessia pós-ordem:");
        arvore.posOrdem();
    }
}
