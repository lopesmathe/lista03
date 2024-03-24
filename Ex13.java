public class Ex13 {
    public static void run(){
        Wutil util = new Wutil();
        Usuario usuario = new Usuario();
        util.pegarNome();
        usuario.nome = util.voltarNome1();
        System.out.println("me informe seu sexo (1 = F,2 = M)");
        util.pegarNomeSemNada();
        usuario.sexo = util.voltarNome1();
        System.out.println("me informe sua idade");
        util.PegarNumeroSemNada();
        usuario.idade = util.VoltarNumero1();
        System.out.println("me informe sua saude de 0 a 10");
        util.PegarNumeroSemNada();
        usuario.saude = util.VoltarNumero1();
        if (usuario.sexo.equals("F") && usuario.idade >= 18) {
            if (usuario.saude >= 7) {
                System.out.println("esta apto");
            }
            else
            System.out.println("nao esta apto");
        }
        else if (usuario.sexo.equals("M") && usuario.idade >= 18){
            if (usuario.saude >= 5) {
                System.out.println("esta apto");
            }
            else
            System.out.println("nao esta apto");
        }
        else
            System.out.println("nao esta apto");
        


       // System.out.printf("nome = %s sexo = %s idade = %d saude = %d", usuario.nome, usuario.sexo, usuario.idade, usuario.saude);

    }
}