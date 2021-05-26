package menuprojeto;

import java.util.Arrays;

class Menu{
    public void menuFila(){
        System.out.println("--------------------------");
        System.out.println("        MENU FILA         ");
        System.out.println("--------------------------");
        System.out.println("+ 1- Inserir elemento    +");
        System.out.println("| 2- excluir elemento    |");
        System.out.println("+ 3- Localizar elemento  +");       
        System.out.println("--------------------------");       
    }
}

public class Fila {

    String vetor[];
    int posicao = 0;

    public Fila(int numero) {
        vetor = new String[numero];
        Arrays.fill(vetor, "");
        Menu menu = new Menu();
        menu.menuFila();
    }

    public void inserir(String nome) {
        while (this.posicao < this.vetor.length) {
            vetor[this.posicao] = nome;
            this.posicao++;
            return;
        }
        System.out.println("Não pode inserir mais, vetor já está cheio");
    }

    public String excluir() {
        String nome = this.vetor[0];

        if (this.posicao == 0) {
            return "Sem elementos pata excluir";
        }
        for (int i = 0; i < (this.vetor.length - 1); i++) {
            this.vetor[i] = this.vetor[i + 1];
        }
        this.vetor[this.vetor.length - 1] = "";
        this.posicao--;
        return "Foi excluido o nome: " + nome;
    }

    public void localizar(String nome) {
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(nome)) {
                System.out.println("Nome ["+vetor[i]+"] encontrado na posição [" + i + "] do vetor");
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nome " + nome + " não encontrado");
        }
    }

    public void print() {
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("[" + this.vetor[i] + "]  ");
        }
        System.out.println("Posi:" + this.posicao);
        System.out.println("");
    }

}
