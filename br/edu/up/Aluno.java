package br.edu.up;
public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;

    public Aluno() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(float nota1){
        this.nota1 = nota1;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2(){
        return nota2;
    }
    
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }

    public float getNota3(){
        return nota3;
    }

    public void setNota3(float nota3){
        this.nota3 = nota3;
    }
}
