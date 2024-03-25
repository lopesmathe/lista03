public class Ex16 {
    public static void run(){
        Wutil util = new Wutil();
        Usuario pessoa = new Usuario();
        System.out.println("me diga seu laraio");
        util.PegarNumeroSemNadaF();
        pessoa.salario = util.VoltarNumero1F();
        if(pessoa.salario < 3 * 1400){
            float porcentagem = pessoa.salario * 0.5f;
            pessoa.salario += porcentagem;
            System.out.println("salario novo " + pessoa.salario);
        }
        else if(pessoa.salario < 10 * 1400){
            float porcentagem = pessoa.salario * 0.2f;
            pessoa.salario += porcentagem;
            System.out.println("salario novo " + pessoa.salario);
        }
        else if(pessoa.salario < 20 * 1400){
            float porcentagem = pessoa.salario * 0.15f;
            pessoa.salario += porcentagem;
            System.out.println("salario novo " + pessoa.salario);
        }
        else
        { 
            float porcentagem = pessoa.salario * 0.10f;
            pessoa.salario += porcentagem;
            System.out.println("salario novo " + pessoa.salario);

        }
    }
}
