public class Ex10 {
    public static void run(){
        Wutil util = new Wutil();
        Humanos pessoa = new Humanos();
        System.out.println("me fale quantas pessoas vao ter");
        util.PegarNumero();
        pessoa.quantidade = util.VoltarNumero1();
        for(int i = 0; i < pessoa.quantidade; i++){
            System.out.println("me diga a idade da pessoa\n");
            util.PegarNumero();
            pessoa.idade = util.VoltarNumero1();
            if (pessoa.idade < 18) {
                System.out.print(" menor de idade\n");
            }
            else
            System.out.print(" maior de idade\n");
                
        }
    }
}

