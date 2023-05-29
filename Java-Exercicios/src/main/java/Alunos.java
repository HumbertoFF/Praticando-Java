package main.java;

public class Alunos {
     private String name;
     private Double notas;

     public Alunos(){
     };

     public String getName(){
         return name;
     }
     public Double getNotas() {
        return notas;
     }

    public void setName(String name) {
        this.name = name;
    }
    public void setNotas(Double nota){
        this.notas = nota;
    }
}
