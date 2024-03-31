public class Ex11 {
    public static void run() {
        Wutil util = new Wutil();
        Humanidade pessoa = new Humanidade();
        String[] vetNome = new String[56];
        String[] vetSexo = new String[56];
        for(int i = 0; i < 6; i++){
            System.out.println("me diga o nome");
            util.pegarNomeSemNada();
            pessoa.nome = util.voltarNome1();
            vetNome[i] = pessoa.nome;
            System.out.println("me diga o sexo");
            util.pegarNomeSemNada();
            pessoa.sexo = util.voltarNome1();
            vetSexo[i] = pessoa.sexo;
        }

        for(int i = 0; i < 6; i++){
            System.out.println("NOME: " + vetNome[i] + "   SEXO: " + vetSexo[i]);
        }
    }
}
