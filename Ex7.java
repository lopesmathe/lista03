public class Ex7 {
    public static void run(){
        Concessionaria concessionaria = new Concessionaria();
        Usuario usuario = new Usuario();
        Wutil util = new Wutil();
        System.out.println("os produtos sao");
        System.out.println("1 = " + concessionaria.ferrari);
        System.out.println("2 = " + concessionaria.fiat2014);
        System.out.println("3 = " + concessionaria.lamborghini);
        System.out.println("4 = " + concessionaria.uno);
        util.PegarNumero();
        usuario.escolha = util.VoltarNumero1();
        float total = 0;
        float imposto = 0;
        float distribuidor = 0;
        
        switch (usuario.escolha) {
            case 1:
            imposto = concessionaria.uno * 0.45f;
            distribuidor = concessionaria.uno * 0.28f;
            total = concessionaria.uno + imposto + distribuidor;
            System.out.println(total);
                break;
            case 2:
            imposto = concessionaria.uno * 0.45f;
            distribuidor = concessionaria.uno * 0.28f;
            total = concessionaria.uno + imposto + distribuidor;
            System.out.println(total);
                break;
            case 3:
            imposto = concessionaria.uno * 0.45f;
            distribuidor = concessionaria.uno * 0.28f;
            total = concessionaria.uno + imposto + distribuidor;
            System.out.println(total);
                break;

            case 4:
            imposto = concessionaria.uno * 0.45f;
            distribuidor = concessionaria.uno * 0.28f;
            total = concessionaria.uno + imposto + distribuidor;
            System.out.println(total);
                break;
            default:
                break;
        }


    }
}

