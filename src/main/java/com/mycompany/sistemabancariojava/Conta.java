/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancariojava;
import java.util.Scanner;

/**
 *
 * @author mailton
 */
public class Conta {
    
    private int agencia;
    private int conta;
    private int senha;
    private double saldo;
    private boolean contaAberta;
    private float saque;
    private float deposito;
    private float transferencia;
    private static int contAgencia = 1001; // Contador para agência, começa em 1001
    private static int contConta = 101;   // Contador para conta, começa em 101
    Scanner teclado = new Scanner (System.in);
    
    public void Conta  (int senha) { //o construtor deve instanciar os atributos da classe
        //e retornar algum valor, podendo ser uma variável local que possa ser ou náo instanciada
        //no ato do instanciamento do método construtor. No exemplo apenas senha é instanciada na 
        //construçãoã
        
        this.contaAberta = true;
        this.agencia = contAgencia++;
        this.senha = senha;
        this.conta = contConta++;
        this.saldo = 0;
              
    }

    public int getAgencia() {
        
        return agencia;
        
    }

    public void setAgencia(int agencia) {
        
        this.agencia = agencia;
        
    }

    public int getConta() {
        
        return conta;
        
    }

    public void setConta(int conta) {
        
        this.conta = conta;
        
    }

    public int getSenha() {
        
        return senha;
        
    }

    public void setSenha(int senha) {
        
        this.senha = senha;
        
    }

    public double getSaldo() {
        
        return saldo;
        
    }

    public void setSaldo(double saldo) {
        
        this.saldo = saldo; //o saldo deve ser atualizado antes

        if (getSaldo() < 0){
            
            System.out.println("Vocá está devendo. Saldo: R$" + saldo);

        }
        
        else {
            
            System.out.println("Saldo: R$" + saldo);

        }
        
    }

    public boolean getContaAberta() {
        
        return contaAberta;
        
    }

    public void setContaAberta(boolean contaAberta) {
        
        this.contaAberta = contaAberta;
        
    }

    public float getSaque() {
        
        return saque;
        
    }

    public void setSaque(float saque) {
        
        if (saque < 1){
            
            System.out.println("Valor mínimo de R$ para saques.");
            
        }
        
        else {
            
            this.saque = saque;
            setSaldo(getSaldo() - saque);
            System.out.println("Seu saldo é " + getSaldo());
            
        }
      
    }

    public float getDeposito() {
        
        return deposito;
        
    }

    public void setDeposito(float deposito) {

        this.deposito = deposito;  // Armazena o valor do depósito
        this.saldo += deposito;     // Atualiza o saldo
    
    }

    public float getTransferencia() {
        
        return transferencia;
        
    }

    public void setTransferencia(float transferencia) {
        
        this.transferencia = transferencia;
        
    }
    
    public void criarConta() {
        
        if (this.contaAberta == false){
            
            this.contaAberta = true;

        }
        
        else {
            
            System.out.println("Erro: conta já aberta.");
            
        }
        
    }

    public void encerrarConta() {

        String validacao;
        
        if (this.contaAberta == true){
            
            if (getSaldo() == 0){
                
                System.out.println("Você deseja mesmo encerrar a conta? 'S' ou 'N'");
                    
                    validacao = teclado.nextLine();
                    
                    if (validacao.equalsIgnoreCase("S")){
                        
                        this.contaAberta = false;
                        System.out.println("Conta encerrada.");
                           
                    }
                    
                    else if (validacao.equalsIgnoreCase("N")){
                        
                        System.out.println("Suspendendo encerramento...");
                        
                    }
             
                    else {
                        
                        System.out.println("Digito inválido. Tente novamente.");
                        
                    }

            }
            
            else if (getSaldo() > 0) {
                
                System.out.println("Erro: ainda há saldo na conta. Saque ou transfira primeiro.");
            }
            
            else {
                
                System.out.println("Erro: ainda há débitos na conta. Realize o pagamento primeiro");
                
            }
            
        }
        
        else  {
            
            System.out.println("Erro: contá já encerrada.");
            
        }
        
    }   

    public void transferir(Conta destino, float transferencia) {
        
        
        if (getSaldo() > 0){
            
            if (getSaldo() >= transferencia){
                
                setSaldo(getSaldo() - transferencia);
                destino.setSaldo(destino.getSaldo() + transferencia);
                System.out.println("Transferência de " + transferencia + " realizada com sucesso.");
                
            }
            
            else {
            
            System.out.println("Saldo insuficiente!");
            
            }
        }

    }
    

    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", conta=" + conta + ", senha=" + senha + ", saldo=" + saldo + ", contaAberta=" + contaAberta + ", saque=" + saque + ", deposito=" + deposito + ", transferencia=" + transferencia + '}';
    }

}
