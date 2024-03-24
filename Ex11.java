public class Ex11 {
    public static void run() {
        Wutil util = new Wutil();
        Usuario pessoa = new Usuario();
        String[] vetNome = new String[56];
        String[] vetSexo = new String[56];
        for(int i = 0; i < 56; i++){
            System.out.println("me diga o nome");
            util.pegarNomeSemNada();
            pessoa.nome = util.voltarNome1();
            vetNome[i] = pessoa.nome;
            System.out.println("me diga o sexo");
            util.pegarNomeSemNada();
            pessoa.sexo = util.voltarNome1();
            vetSexo[i] = pessoa.sexo;
        }

        for(int i = 0; i < 56; i++){
            System.out.println("sexo: " + vetSexo[i] + "   nome: " + vetNome[i]);
        }
    }
}
