/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancariojava;
import java.util.Scanner;

/**
 *
 * @author mailton
 */
public class SistemaBancarioJava {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int escolha = 0;
        Usuario u = new Usuario ();
        
        System.out.println("#################BEM VINDO###################");
        System.out.println("'1' Login.");
        System.out.println("'2' Abrir conta.");
        System.out.println("'3' Depósito rápido.");        
        System.out.println("'4' Encerrar.");  
        System.out.println("#############################################");
            
            escolha = teclado.nextInt();
            teclado.nextLine();
            
        switch (escolha){
            
            case 1: //login
                
                System.out.println("#################BEM VINDO###################");
                System.out.println("Digite sua agencia:");
                    u.setAgencia(teclado.nextInt());
                    teclado.nextLine();
                System.out.println("Digite sua conta:");
                    u.setConta(teclado.nextInt());
                    teclado.nextLine();
                System.out.println("Digite sua senha de 4 digitos:");
                    u.setSenha(teclado.nextInt());
                    teclado.nextLine();
                    
                    if (u.getAgencia().equals(getAgencia()) && u.getConta().equals(getConta()) && u.getSenha.equals(getSenha())){
                        
                        
                        
                    }

                break;
                
            case 2: //criar conta
                
                System.out.println("#################BEM VINDO###################");
                System.out.println("Para abrir sua conta, precisamos de alguns dados:");
                System.out.println("Digite seu nome completo:");
                    u.setNome(teclado.nextLine());
                System.out.println("Agora digite sua data de nascimento:");
                    u.setIdade(teclado.nextInt());
                    teclado.nextLine();
                System.out.println("Por último, digite seu CPF:");
                    u.setCpf(teclado.nextLine());
                System.out.println("Escolha uma senha de quatro digitos. Apenas números:");
                    u.setSenha(teclado.nextInt());
                    teclado.nextLine();
                System.out.println("Conta aberta, obrigado.");
                
                    Conta c = new Conta ();
                    u.Conta(u.getSenha());
                
                System.out.println("#############Dados da conta:#################");
                System.out.println("Agencia: " + u.getAgencia());
                System.out.println("Conta " + u.getConta());
                System.out.println("Senha: " + u.getSenha());
                System.out.println("Saldo R$:" + u.getSaldo());
                System.out.println("Encerrando...");
                 
                break;
                
            case 3: //depósito rápido
                
                System.out.println("#################BEM VINDO###################");
                System.out.println("Digite o número da agencia destino:");
                    u.setAgencia(teclado.nextInt());
                    teclado.nextLine();
                System.out.println("Digite o número da conta destino:");
                    u.setConta(teclado.nextInt());
                    teclado.nextLine();
                System.out.println("Digite o valor em espécie:");
                    u.setDeposito(teclado.nextFloat());
                    teclado.nextLine();
                System.out.println("Depósito de R$" + u.getDeposito() + " realizado com sucesso.");

                break;
                
            case 4: //transferência
                
                System.out.println("Encerrando...");
                
                break;
                
        }
    }
}

