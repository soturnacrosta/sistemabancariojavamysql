/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancariojava;

/**
 *
 * @author mailton
 */
public class Usuario extends Conta {
    
    private String nome;
    private int idade;
    private String cpf;
    
    public String getNome() {
        
        return nome;
        
    }

    public void setNome(String nome) {
        
         if (nome.matches("[a-zA-ZÀ-ÿ\\s]+")) { // Aceita letras acentuadas e espaços
             
            System.out.println("Nome cadastrado.");
            
                this.nome = nome;

        } else {
             
            System.out.println("Erro: O nome não pode conter números ou símbolos.");
            
        }
        
    }

    public int getIdade() {
        
        return idade;
        
    }

    public void setIdade(int idade) {
        
        
        if (idade < 16){
            
            System.out.println("Apenas maiores de 16 anos podem abrir uma conta!");
            
        }
        
        else {
            
            this.idade = idade;

        }
        
    }

    public String getCpf() {
        
        return cpf;
        
    }

    public void setCpf(String cpf) {
        
        if (cpf.matches("\\d+")) { // Verifica se só contém dígitos númericos mas preserva tipo string
            
            System.out.println("CPF cadastrado.");
            this.cpf = cpf;

        } else {
            
            System.out.println("Erro: Digite apenas números.");
            
        }
        
    }
    
}
