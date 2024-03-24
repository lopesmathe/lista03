public class Ex12 {
    public static void run(){
        Wutil util = new Wutil();
        Concessionaria concessionaria = new Concessionaria();
        System.out.println("escolha o carro para ver a promoçao");
        System.out.println("opçao 1: " + concessionaria.ferrari);
        System.out.println("opçao 2: " + concessionaria.fiat2014);
        System.out.println("opçao 3: " + concessionaria.lamborghini);
        System.out.println("opçao 4: " + concessionaria.uno);
        util.PegarNumero();
        int escolha = util.VoltarNumero1();
        switch (escolha) {
            case 1:
                if (concessionaria.ferrariAno <= 2000) {
                    float desconto = concessionaria.ferrari * 0.12f;
                    concessionaria.ferrari += desconto;
                    System.out.println(concessionaria.ferrari);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                }
                else if (concessionaria.ferrariAno > 2000) {
                    float desconto = concessionaria.ferrari * 0.07f;
                    concessionaria.ferrari += desconto;
                    System.out.println(concessionaria.ferrari);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                    else 
                        System.out.println("NAN");
                }
                break;
            case 2:
                if (concessionaria.fiat2014Ano <= 2000) {
                    float desconto = concessionaria.fiat2014 * 0.12f;
                    concessionaria.fiat2014 += desconto;
                    System.out.println(concessionaria.fiat2014);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                }
                else if (concessionaria.fiat2014Ano > 2000) {
                    float desconto = concessionaria.fiat2014 * 0.07f;
                    concessionaria.fiat2014 += desconto;
                    System.out.println(concessionaria.fiat2014);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                    else 
                        System.out.println("NAN");
                }
                break;
            case 3:
                if (concessionaria.lamborghiniAno <= 2000) {
                    float desconto = concessionaria.lamborghini * 0.12f;
                    concessionaria.lamborghini += desconto;
                    System.out.println(concessionaria.lamborghini);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                }
                else if (concessionaria.lamborghiniAno > 2000) {
                    float desconto = concessionaria.lamborghini * 0.07f;
                    concessionaria.lamborghini += desconto;
                    System.out.println(concessionaria.lamborghini);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                    else 
                        System.out.println("NAN");
                }
                break;
            case 4:
                if (concessionaria.unoAno <= 2000) {
                    float desconto = concessionaria.uno * 0.12f;
                    concessionaria.uno += desconto;
                    System.out.println(concessionaria.uno);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                }
                else if (concessionaria.unoAno > 2000) {
                    float desconto = concessionaria.uno * 0.07f;
                    concessionaria.uno += desconto;
                    System.out.println(concessionaria.uno);
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                    else 
                        System.out.println("NAN");
                }
                break;
            default:
                break;
        }


    }
}
