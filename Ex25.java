public class Ex25 {
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
        if(media > 8){
            System.out.println("A");
        }
        else if(media > 7 || media <8){
            System.out.println("B");
        }
        else if(media > 6 || media <7){
            System.out.println("C");
        }
        else if(media > 5 || media <6){
            System.out.println("D");
        }
        else if(media > 0 || media <5){
            System.out.println("R");
        }
    }
}
