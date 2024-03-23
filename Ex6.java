public class Ex6 {
    public static void run(){
        Produto produto = new Produto();
        Usuario usuario = new Usuario();
        Wutil util = new Wutil();
        System.out.println("os produtos sao");
        System.out.println("1 = " + produto.celular);
        System.out.println("2 = " + produto.tablet);
        System.out.println("3 = " + produto.pc);
        System.out.println("4 = " + produto.notbook);
        System.out.println("5 = " + produto.mac);
        util.PegarNumero();
        usuario.escolha = util.VoltarNumero1();
        System.out.println("me informe o acrecimo");
        util.PegarNumeroF();
        usuario.acrecimo = util.VoltarNumero1F();
        switch (usuario.escolha) {
            case 1:
            float resuCelular = produto.celular + usuario.acrecimo;
            System.out.println(resuCelular);
                break;
            case 2:
            float resuTablet = produto.tablet + usuario.acrecimo;
            System.out.println(resuTablet);

                break;
            case 3:
            float resuPc = produto.pc + usuario.acrecimo;
            System.out.println(resuPc);
                break;
            case 4:
            float resuNotbook = produto.notbook + usuario.acrecimo;
            System.out.println(resuNotbook);
                break;
            case 5:
            float resuMac = produto.mac + usuario.acrecimo;
            System.out.println(resuMac);

                break;
            default:
                break;
        }


    }
}
