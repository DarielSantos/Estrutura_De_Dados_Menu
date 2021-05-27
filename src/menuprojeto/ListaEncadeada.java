package menuprojeto;
class Menu3{
     public void menuListaEncadeada(){
        System.out.println("-------------------------------------");
        System.out.println("        MENU LISTA ENCADEADA         ");
        System.out.println("-------------------------------------");
        System.out.println("+      1- Inserir elemento          +");
        System.out.println("|      2- excluir elemento          |");
        System.out.println("+      3- Localizar elemento        +");       
        System.out.println("-------------------------------------");       
    }
}
class No{
    String nome;
    No no;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public No getNo() {
        return no;
    }

    public void setNo(No no) {
        this.no = no;
    }
}

public class ListaEncadeada {
    No inicio;
    No fim;
    public ListaEncadeada() {
        Menu3 menu = new Menu3();
        this.inicio = null;
        this.fim = null;
        menu.menuListaEncadeada();
    }
    public void inserir(String nome){
        No p = new No();
        p.setNome(nome);
        p.setNo(null);
        if(inicio == null){
            inicio = p;
            fim = p;
        }
        else{
            fim.setNo(p);
            fim =p;
        }
    }
    public String excluir(){
        while(inicio != null){
        No aux = inicio;
        if(inicio == fim && inicio != null ){
            this.inicio = null;
            this.fim = null;
        }
        else{
            inicio = aux.getNo();
        }
        return aux.getNome()+" foi excluido";
    }
        return "Lista vazia";
    }
    public void localizar(String nome){
        No aux = inicio;
        int cont = 0;
        while(aux != null){
            cont++;
            if(nome.equalsIgnoreCase(aux.getNome())){
                System.out.println("Nome: "+aux.getNome()+" encontrado na posição["+cont+"] da lista");
            }
            aux = aux.getNo();
        }
    }
    public void print(){
        No aux = inicio;
        while(aux != null){
            System.out.print("["+aux.getNome()+"] ");
            aux = aux.getNo();
        }
        System.out.println("");
    }
}
