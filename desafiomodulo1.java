package exercicios.desafiomodulo;

import java.util.Scanner;

public class desafiomodulo1 {

    public static void main(String[] args) {
        
        //RECEBE NUM1
        //RECEBE NUM2

        //RECEBE QUAL OPERAÇÃO FAZER
        //+ - / * %
        //NUM 1 PELO NUM2 E MOSTRAR NA TELA

        Scanner scan = new Scanner(System.in);

        //SCANNING THE USER NUMBERS AND OPTION OF OPERATION
        System.out.println("Digite o primeiro numero: ");
        String num1 = scan.next().replace(",", ".");
        System.out.println("Digite o segundo numero: ");
        String num2 = scan.next().replace(",", ".");
        System.out.println("Digite a operação que deseja fazer: ");
        String symb = scan.next();

        scan.close();

        //CONVERTING THE STRING NUMBERS TO DOUBLE NUMBERS
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        //OPERATIONS
        double soma = number1 + number2;
        double sub = number1 - number2;
        double mult = number1 * number2;
        double div = number1 / number2;
        double quo = number1 % number2;

        //LOGIC TO SHOW THE OPERATIONS
        if(symb.equals("+")){
            System.out.println("A soma de num1 + num2 é: " + soma);
        }else if(symb.equals("-")){
            System.out.println("A subtração de num1 - num2 é: " + sub);
        }else if(symb.equals("*")){
            System.out.println("A multiplicação de num1 * num2 é: " + mult);
        }else if(symb.equals("/")){
            System.out.println("A divisão de num1 / num2 é: " + div);
        }else if(symb.equals("%")){
            System.out.println("O quociente de num1 % num2 é: " + quo);
        }
        
    }
}