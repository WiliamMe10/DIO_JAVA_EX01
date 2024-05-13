package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaTerminal {

    public static void main(String args[]){
        int conta = 0;
        int agencia = 0;
        String nome = "";
        float saldo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de sua conta: ");

        conta = sc.nextInt();

        System.out.println("Digite o numero de sua agencia: ");

        agencia = sc.nextInt();

        System.out.println("Digite o seu nome completo: ");

        nome = sc.next();

        System.out.println("Digite o saldo de sua conta: ");

        saldo = sc.nextFloat();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia + ", conta " +conta+ " e seu saldo "+ saldo +" já está disponível para saque.");
    }

}
