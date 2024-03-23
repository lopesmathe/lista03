public class Ex5 {
    public static void run(){
        Wutil util = new Wutil();
        MamaoComAcucar loja1 = new MamaoComAcucar();
        System.out.println("qual o valor ?");
        util.PegarNumeroF();
        loja1.prestacao = util.VoltarNumero1F (); 
        loja1.prestacao =  loja1.prestacao / 5; 
        System.out.println("o valor em 5 vezes é " + loja1.prestacao);        
    }
}
