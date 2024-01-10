package calculadoras;

import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Quanto você pesa? ");
        float peso = t.nextFloat();
        System.out.println("Qual sua altura? ");
        float altura = t.nextFloat();
        System.out.println("Qual seu sexo? (Digite 1 para Masculino e 2 para Feminino) ");
        float sexo = t.nextFloat();


        if (sexo == 1) {

            float imcM = peso / (altura * altura);
            System.out.println("Seu IMC é: " + imcM);

            if (imcM < 20) {
                System.out.println("Sua situação: Abaixo do peso");
            } else if (imcM >= 20 && imcM < 25) {
                System.out.println("Sua situação: Peso Normal");
            } else if (imcM >= 25 && imcM < 30) {
                System.out.println("Sua situação: Sobrepeso");
            } else if (imcM >= 30 && imcM < 40) {
                System.out.println("Sua situação: Obesidade Grau II");
            } else {
                System.out.println("Sua situação: Obesidade Grau III ou Mórbida");
            }
        } else if (sexo == 2) {

            float imcF = peso / (altura * altura);
            System.out.println("Seu IMC é: " + imcF);

            if (imcF < 19) {
                System.out.println("Sua situação: Abaixo do peso");
            } else if (imcF >= 19 && imcF < 24) {
                System.out.println("Sua situação: Peso Normal");
            } else if (imcF >= 24 && imcF < 29) {
                System.out.println("Sua situação: Sobrepeso");
            } else if (imcF >= 29 && imcF < 39) {
                System.out.println("Sua situação: Obesidade Grau II");
            } else {
                System.out.println("Sua situação: Obesidade Grau III ou Mórbida");
            }
        } else {
            System.err.println("ERROR! SEXO NÃO IDENTIFICADO");
        }
    }
}