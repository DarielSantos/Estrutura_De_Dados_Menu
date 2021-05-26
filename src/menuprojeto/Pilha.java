package menuprojeto;

import java.util.Arrays;
class Menu{
     public void menuPilha(){
        System.out.println("--------------------------");
        System.out.println("        MENU PILHA         ");
        System.out.println("--------------------------");
        System.out.println("+ 1- Inserir elemento    +");
        System.out.println("| 2- excluir elemento    |");
        System.out.println("+ 3- Localizar elemento  +");       
        System.out.println("--------------------------");       
    }
}

public class Pilha {
    int    posicao = 0;
    String vetor[];
    
    public Pilha(int numero){
        Menu menu = new Menu();
        vetor = new String[numero];
        Arrays.fill(vetor, "");
        menu.menuPilha();
    }
    
    public void inserir(String nome){
        while(posicao < vetor.length){
            vetor[posicao] = nome;
            posicao++;
            return;
        }
        System.out.println("+=AVISO=+ Pilha Cheia");
    }
    
    public String excluir(){
        String nome = "";              
        if(posicao > 0){
        this.posicao--;
        nome = vetor[posicao];
        vetor[posicao] = "";
        }
        else{
            return "+=AVISO=+ Pilha vazia";
        }
        return nome+" foi excluido";
    }
    
    public void localizar(String nome){
        boolean achou = false;
        for(int i = vetor.length -1; i >= 0; i--){
            if(vetor[i] == nome){
                System.out.println("Nome "+ nome +" localizado na posição ["+i+"] do vetor");
                achou = true;
            }
        }
        if(!achou){
            System.out.println("Nome "+ nome + " não localizado no vetor");
        }
    }
    
    public void print(){
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.println("["+vetor[i]+"] ");
        }
    }
}
