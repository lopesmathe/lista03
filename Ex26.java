public class Ex26 {
    public void run(Usuario usuario) {
        int idade = usuario.getIdade();
        String grupoRisco = obterGrupoRisco(usuario);

        if (idade < 17 || idade > 70) {
            System.out.println(usuario.getNome() + " não se enquadra em nenhuma das categorias ofertadas.");
            return;
        }

        String categoria = "";

        if (idade >= 17 && idade <= 30) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                categoria = "Categoria A";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                categoria = "Categoria B";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                categoria = "Categoria C";
            }
        } else if (idade >= 31 && idade <= 50) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                categoria = "Categoria D";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                categoria = "Categoria E";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                categoria = "Categoria F";
            }
        } else if (idade >= 51 && idade <= 70) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                categoria = "Categoria G";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                categoria = "Categoria H";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                categoria = "Categoria I";
            }
        }

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de Risco: " + grupoRisco);
        System.out.println("Categoria de Seguro: " + categoria);
    }

    private String obterGrupoRisco(Usuario usuario) {
        int saude = usuario.getSaude();
        float salario = usuario.getSalario();
        String sexo = usuario.getSexo();

        // Lógica para determinar o grupo de risco baseado na saúde, salário e sexo
        // Aqui você implementaria a lógica adequada para determinar o grupo de risco

        // Exemplo simplificado:
        if (saude >= 7 && salario >= 3000 && sexo.equalsIgnoreCase("masculino")) {
            return "baixo";
        } else if (saude >= 5 && salario >= 2000) {
            return "médio";
        } else {
            return "alto";
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setIdade(25);
        usuario.setSaude(8);
        usuario.setSalario(3500);
        usuario.setSexo("masculino");

    }
}

class Usuario {
    private int idade;
    private String nome;
    private String sexo;
    private int saude;
    private float salario;

    // Getters e Setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
