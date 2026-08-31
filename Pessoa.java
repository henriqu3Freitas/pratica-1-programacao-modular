/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;

/**
 *
 * @author 1640295
 */
public class Pessoa {
    //atributos encapsulados
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    
    //construtor
    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso, double imc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = 0;
        
    }
    //get set nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
     //get set sobrenome
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
     //get set idade
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
      this.idade = idade;   
    }
     //get set altura
    public double getAltura(){
        return altura   ;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
     //get set peso
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
     //get set imc
    public double getImc(){
        return imc;
    }
    public void setImc(double imc){
        this.imc = imc; 
    }
    
    public String InformaObesidade(){
        if (imc < 18.5){
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidade grau I";
        } else if (imc < 40.0) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }

        }
   }

