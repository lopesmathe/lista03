public class Ex8 {
    public static void run(){
        Aluno aluno = new Aluno();
        Wutil util = new Wutil();
        util.pegarNome();
        aluno.nome = util.voltarNome1();
        util.PegarNumeroF();
        aluno.nota1 = util.VoltarNumero1F();
        util.PegarNumeroF();
        aluno.nota2 = util.VoltarNumero1F();
        util.PegarNumeroF();
        aluno.nota3 = util.VoltarNumero1F();
        float media = aluno.nota1 + aluno.nota2 + aluno.nota3 / 3;
        System.out.println("nome = " + aluno.nome + "a media é " + media);
        if (media < 5.0) {
            System.out.println("reprovado");
        }
        else if (media > 7.0) {
            System.out.println("aprovado");
        }
         else 
            System.out.println("recuperaçao");
        


    }
}
