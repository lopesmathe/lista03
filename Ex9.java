public class Ex9 {
    public static void run(){
        Wutil util = new Wutil();
        Usuario pessoa = new Usuario();
        System.out.println("me fale quantas pessoas vao ter");
        util.PegarNumero();
        int quantidade = util.VoltarNumero1();
        for(int i = 0; i < quantidade; i++){
            System.out.println("me diga a idade da pessoa\n");
            util.PegarNumero();
            int idade = util.VoltarNumero1();
            if (idade < 18) {
                System.out.print(" menor de idade\n");
            }
            else
            System.out.print(" maior de idade\n");
                
        }
    }
}
