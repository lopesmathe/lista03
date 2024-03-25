public class Ex17 {
    public static void run(){
        Usuario usuario = new Usuario();
        Wutil util = new Wutil();
        float salarioMinimo = 1300;
        System.out.println("me infome o seu nome");
        util.pegarNomeSemNada();
        usuario.nome = util.voltarNome1();
        System.out.println("me infome o seu salario");
        util.PegarNumeroF();
        usuario.salario = util.VoltarNumero1();
        usuario.salario = (usuario.salario + salarioMinimo) / 0.10f;
        System.out.println("o salario atua é" + usuario.salario);

    }
}
