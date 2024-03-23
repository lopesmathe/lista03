public class Ex2 {
    public static void run(){
        Wutil util = new Wutil();
        AutoMovel automovel = new AutoMovel();
        System.out.println("me diga a distancia");
        util.PegarNumeroF();
        automovel.distanciaPercorrida = util.VoltarNumero1F();
        System.out.println("me diga o combustivel gasto medio ");
        util.PegarNumeroF();
        automovel.combustivelGasto = util.VoltarNumero1F();
        float consumoMedio = automovel.combustivelGasto / automovel.distanciaPercorrida;
        System.out.println(consumoMedio);        

    }
}
