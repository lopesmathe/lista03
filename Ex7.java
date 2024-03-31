public class Ex7 {
    public static void run(){
        Concessionaria concessionaria = new Concessionaria();
        Consumidor consumidor = new Consumidor();
        Wutil util = new Wutil();
        System.out.println("os produtos sao");
        System.out.println("1 ferrari = " + concessionaria.ferrari);
        System.out.println("2 fiat2014 = " + concessionaria.fiat2014);
        System.out.println("3 lamborghini = " + concessionaria.lamborghini);
        System.out.println("4 uno = " + concessionaria.uno);
        util.PegarNumero();
        consumidor.escolha = util.VoltarNumero1();
        float total = 0;
        float imposto = 0;
        float distribuidor = 0;
        
        switch (consumidor.escolha) {
            case 1:
            imposto = concessionaria.ferrari * 0.45f;
            distribuidor = concessionaria.ferrari * 0.28f;
            total = concessionaria.ferrari + imposto + distribuidor;
                break;
            case 2:
            imposto = concessionaria.fiat2014 * 0.45f;
            distribuidor = concessionaria.fiat2014 * 0.28f;
            total = concessionaria.fiat2014 + imposto + distribuidor;
                break;
            case 3:
            imposto = concessionaria.lamborghini * 0.45f;
            distribuidor = concessionaria.lamborghini * 0.28f;
            total = concessionaria.lamborghini + imposto + distribuidor;
                break;

            case 4:
            imposto = concessionaria.uno * 0.45f;
            distribuidor = concessionaria.uno * 0.28f;
            total = concessionaria.uno + imposto + distribuidor;
                break;
            default:
                break;
        }

        System.out.println(total);
    }
}

