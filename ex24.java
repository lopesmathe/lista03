public class ex24 {
    public static void run() {
        Wutil util = new Wutil();
        NotasAlunos notas = new NotasAlunos();
        System.out.println("me informe qual a nota Laboratório peso 2");
        util.PegarNumeroSemNadaF();
        notas.nota1 = util.VoltarNumero1F();
        System.out.println("me informe qual a nota Laboratório peso 3");
        util.PegarNumeroSemNadaF();
        notas.nota2 = util.VoltarNumero1F();
        System.out.println("me informe qual a nota Laboratório peso 5");
        util.PegarNumeroSemNadaF();
        notas.nota3 = util.VoltarNumero1F();
        float media = (notas.nota1 + notas.nota2 + notas.nota3) / 3;
        System.out.println(media);

    }
}
