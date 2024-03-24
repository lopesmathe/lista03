public class Ex14 {
    public static void run() {
        Wutil util = new Wutil();
        float[] vetCusto = new float[2]; 
        float[] vetLucro = new float[2]; 
        float lucroTotal = 0;
        float custoTotal = 0;
        for(int i = 0; i < 2; i++){
            System.out.println("custo");
            util.PegarNumero();
            vetCusto[i] = util.VoltarNumero1();
            System.out.println("venda");
            util.PegarNumero();
            vetLucro[i] = util.VoltarNumero1();
        }

        for(int i = 0; i < 2; i++){
            custoTotal += vetCusto[i];
            lucroTotal += vetLucro[i];
        }
        if(custoTotal > lucroTotal){
            System.out.println("se ferrou");
        }
        else if(lucroTotal > custoTotal){
            System.out.println("ai sim meu patrao");

        }



    }
}
