public class Ex23 {
    public static void run() {
        Wutil util = new Wutil();
        Usuario usuario = new Usuario();
        System.out.println("Informe o nome:");
        util.pegarNomeSemNada();
        usuario.nome = util.voltarNome1();
        System.out.println("Informe o sexo (M/F):");
        util.pegarNomeSemNada();
        usuario.sexo = util.voltarNome1();
        System.out.println("Informe a altura:");
        util.PegarNumeroSemNadaF();
        usuario.altura = util.VoltarNumero1F();
        System.out.println("Informe a idade:");
        util.PegarNumeroSemNada();
        usuario.idade = util.VoltarNumero1();

        if (usuario.sexo.equalsIgnoreCase("m") || usuario.sexo.equalsIgnoreCase("masculino")) {
            if (usuario.altura > 1.70f) {
                if (usuario.idade <= 20) {
                    float resu = (72.7f * usuario.altura) - 58;
                    System.out.println("O peso ideal para um homem de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                } else if (usuario.idade >= 21 && usuario.idade <= 39) {
                    float resu = (72.7f * usuario.altura) - 53;
                    System.out.println("O peso ideal para um homem de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                } else if (usuario.idade > 40) {
                    float resu = (72.7f * usuario.altura) - 45;
                    System.out.println("O peso ideal para um homem de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                }
            } else {
                if (usuario.idade <= 40) {
                    float resu = (72.7f * usuario.altura) - 50;
                    System.out.println("O peso ideal para um homem de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                } else if (usuario.idade > 40) {
                    float resu = (72.7f * usuario.altura) - 58;
                    System.out.println("O peso ideal para um homem de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                }
            }
        } else if (usuario.sexo.equalsIgnoreCase("f") || usuario.sexo.equalsIgnoreCase("feminino")) {
            if (usuario.altura > 1.70f) {
                if (usuario.idade <= 20) {
                    float resu = (72.7f * usuario.altura) - 58;
                    System.out.println("O peso ideal para uma mulher de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                } else if (usuario.idade >= 21 && usuario.idade <= 39) {
                    float resu = (72.7f * usuario.altura) - 53;
                    System.out.println("O peso ideal para uma mulher de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                } else if (usuario.idade > 40) {
                    float resu = (72.7f * usuario.altura) - 45;
                    System.out.println("O peso ideal para uma mulher de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                }
            } else {
                if (usuario.idade <= 40) {
                    float resu = (72.7f * usuario.altura) - 50;
                    System.out.println("O peso ideal para uma mulher de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                } else if (usuario.idade > 40) {
                    float resu = (72.7f * usuario.altura) - 58;
                    System.out.println("O peso ideal para uma mulher de " + usuario.altura + " metros e " + usuario.idade + " anos é: " + resu);
                }
            }
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
