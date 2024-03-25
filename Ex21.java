public class Ex21 {
    public static void run() {
        Wutil util = new Wutil();
        Usuario usuario = new Usuario();
        System.out.println("me informe a idade do nadador");
        util.PegarNumeroSemNada();
        int idade = util.VoltarNumero1();
        if (usuario.idade >= 5 || usuario.idade <= 7 ) {
            System.out.println("infantil A");
        }
        else if (usuario.idade >= 8 || usuario.idade <= 10 ) {
            System.out.println("infantil B");
        }
        else if (usuario.idade >= 11 || usuario.idade <= 13 ) {
            System.out.println("juvenil A");
        }
        else if (usuario.idade >= 14 || usuario.idade <= 17 ) {
            System.out.println("juvenil B");
        }
        else if (usuario.idade >= 18 || usuario.idade <= 25 ) {
            System.out.println("senior");
        }
        else
        System.out.println("idade fora da faixa etária");

    }
}  
