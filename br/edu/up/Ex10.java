package br.edu.up;

public class Ex10 {
    public static void run(){
        Wutil util = new Wutil();
        Humanos pessoa = new Humanos();
        String Maior = "\033[94mMaior de idade\033[0m";
        String Menor = "\033[31mMenor de idade\033[0m";
        System.out.println("me fale quantas pessoas vao ter");
        util.PegarNumero();
        pessoa.setQuantidade(util.VoltarNumero1());
        for(int i = 0; i < pessoa.getQuantidade(); i++){
            System.out.println("\nme diga a idade da pessoa");
            util.PegarNumeroSemNada();
            pessoa.setIdade(util.VoltarNumero1());
            if (pessoa.getIdade() < 18) {
                System.out.print(Menor);
            }
            else
            System.out.print(Maior);
                
        }
    }
}

