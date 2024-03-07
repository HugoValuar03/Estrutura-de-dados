package Estático;

public class PilhaEstatica {
    private int topo;
    private int pilhaArray[];

    public PilhaEstatica(int tamanho) {
        topo = -1;
        pilhaArray = new int[tamanho];
    }
    public void push(int conteudo){
        topo ++;
        pilhaArray[topo] = conteudo;
    }
    public void pop(){
        pilhaArray[topo] = 0;
        topo --;
    }
    public void imprimir(){
        for(int i=0;i<pilhaArray.length; i++){
            System.out.println(pilhaArray[i]);
        }
    }
}
