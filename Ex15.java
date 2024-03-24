public class Ex15 {
    public static void run(){
        Wutil util = new Wutil();
        Concessionaria concessionaria = new Concessionaria();
        System.out.println("escolha o carro para ver a promoçao");
        System.out.println("opçao 1: " + concessionaria.ferrari);
        System.out.println("opçao 2: " + concessionaria.fiat2014);
        System.out.println("opçao 3: " + concessionaria.lamborghini);
        System.out.println("opçao 4: " + concessionaria.uno);
        util.PegarNumero();
        int opcao = util.VoltarNumero1();
        switch (opcao) {
            case 1:
                System.out.println("Qual o combustivel ? (1)álcool = 25%, (2)gasolina =  21% ou (3)diesel = 14%");
                util.PegarNumero();
                int opcaoCombustivel = util.VoltarNumero1();
                if (opcaoCombustivel == 1) {
                    float imposto = concessionaria.ferrari * 0.25f;
                    concessionaria.ferrari += imposto;
                    System.out.println(concessionaria.ferrari);
                }
                else if(opcaoCombustivel == 2){
                    float imposto = concessionaria.ferrari * 0.21f;
                    concessionaria.ferrari += imposto;
                    System.out.println(concessionaria.ferrari);
                }
                else if(opcaoCombustivel == 3){
                    float imposto = concessionaria.ferrari * 0.14f;
                    concessionaria.ferrari += imposto;
                    System.out.println(concessionaria.ferrari);
                }
                else
                    System.out.println("error");
                break;
        
            default:
                break;
        }

    }
}
