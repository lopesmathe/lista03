public class Ex4 {
    public static void run(){
        Wutil util = new Wutil();
        Usuario usuario = new Usuario();
        System.out.println("me informe a cotaçao atual do dolar");
        util.PegarNumeroF();
        usuario.cotacao = util.VoltarNumero1F();
        System.out.println("me informe q quantidade de dinheiro em dolar");
        util.PegarNumeroF();
        usuario.quantidade = util.VoltarNumero1F();
        float comversao = usuario.quantidade * usuario.cotacao; 
        System.out.println(comversao);

    }
}
