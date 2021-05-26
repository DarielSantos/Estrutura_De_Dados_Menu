package menuprojeto;

public class MenuProjeto {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.inserir("Daniel");
        pilha.inserir("Pedro");
        pilha.inserir("João");
        pilha.inserir("Tiago");
        System.out.println("-------------------------------");
        pilha.print();
        System.out.println("-------------------------------");
        pilha.inserir("Marcos");
        System.out.println("-------------------------------");
        pilha.print();
        System.out.println("-------------------------------");
        pilha.inserir("Judas");
        System.out.println("-------------------------------");
        pilha.print();
        System.out.println("-------------------------------");
        pilha.localizar("Papa");
        pilha.localizar("Daniel");
        pilha.localizar("Tiago");
        
       
        
        
    }    
}
