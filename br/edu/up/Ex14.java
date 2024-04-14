package br.edu.up;

public class Ex14 {
    public static void run() {
        Wutil util = new Wutil();
        Produtos produtos = new Produtos();
        for(int i = 0; i < 40; i++){
            System.out.println("item" + (i + 1) + " = " + produtos.getItem(i));        }
    }
}
