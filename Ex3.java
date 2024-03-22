public class Ex3 {

    public static void run() {
        /*
         * colocar o nome
         */
        System.out.println("me dia o seu nome");
        Wutil util = new Wutil();
        util.PegarNumeroF();
        float salario = util.VoltarNumero1F();
        System.out.println("agr me fale o total de vendas q vc teve");
        util.PegarNumeroF();
        float totalDeVendas = util.VoltarNumero1F();
        float salarioFinal = totalDeVendas * 1.15f;
        System.out.println(salarioFinal);

    }
}