package menuprojeto;

public class MenuProjeto {
    public static void main(String[] args) { 
        ListaEncadeada lise = new ListaEncadeada();
        lise.inserir("Daniel");
        lise.inserir("Marcos");
        lise.inserir("João");
        lise.inserir("Mateus");
        lise.inserir("Paulo");
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        System.out.println(lise.excluir());
        lise.print();
        lise.inserir("Daniel");
        lise.inserir("Matheus");
        lise.inserir("João");
        lise.print();
        lise.localizar("Daniel");
        lise.localizar("João");
        lise.localizar("matheus");
    }    
}
