package br.edu.up;

public class Ex2 {
    public static void run(){
        Wutil util = new Wutil();
        AutoMovel automovel = new AutoMovel();
        System.out.println("me diga a distancia");
        util.PegarNumeroF();
        automovel.setDistancia(util.VoltarNumero1F());
        System.out.println("me diga o combustivel gasto medio ");
        util.PegarNumeroF();
        automovel.setDistancia(util.VoltarNumero1F());
        float consumoMedio = automovel.getDistanciaPercorrida() / automovel.getCombustivelGasto();
        System.out.println(consumoMedio);        

    }
}
