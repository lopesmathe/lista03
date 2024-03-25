public class Ex18 {
    public static void run(){
        Wutil util = new Wutil();
        Usuario usuario = new Usuario();
        System.out.println("ola para saber qual vai ser oseu abono me informe se vc é homem ou mulher");
            util.pegarNomeSemNada();
            usuario.sexo = util.voltarNome1();
        if (usuario.sexo.equals("f") || usuario.sexo.equals("F") || usuario.sexo.equals("Feminino") || usuario.sexo.equals("feminino")) {
            System.out.println("me infome sua idade");
            util.PegarNumero();
            usuario.idade = util.VoltarNumero1();
            if (usuario.idade >= 30) {
                System.out.println("abono de 100");
            }
            else
            System.out.println("abono de 50");                
            }
            if (usuario.sexo.equals("m") || usuario.sexo.equals("M") || usuario.sexo.equals("Masculino") || usuario.sexo.equals("masculino")) {
                System.out.println("me infome sua idade");
                util.PegarNumero();
                usuario.idade = util.VoltarNumero1();
                if (usuario.idade >= 30) {
                    System.out.println("abono de 200");
                }
                else
                System.out.println("abono de 80");                
                }
    }
}
