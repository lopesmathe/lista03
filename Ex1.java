public class Ex1 {
    public static void run(){
        Aluno aluno1 = new Aluno();
        Wutil util = new Wutil();
        util.pegarNome();
        aluno1.nome = util.voltarNome1();
        util.PegarNumeroF();
        aluno1.nota1 = util.VoltarNumero1F();
        util.PegarNumeroF();
        aluno1.nota2 = util.VoltarNumero1F();
        util.PegarNumeroF();
        aluno1.nota3 = util.VoltarNumero1F();
        float media = aluno1.nota1 + aluno1.nota2 +aluno1.nota3 / 3;
        System.out.printf("%s a sua nota do semestre 1 é %.2f a do semestre 2 é %.2f e do semestre 3 é %.2f totalizando a media é %.2f", aluno1.nome, aluno1.nota1, aluno1.nota2, aluno1.nota3, media);
        }
}
