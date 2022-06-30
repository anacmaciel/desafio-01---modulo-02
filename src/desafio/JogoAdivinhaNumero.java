package desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhaNumero {
    public static void main(String[] args) {
        Random gerarNumerosAleatorios = new Random();


        int sortearNumeroAleatorio = gerarNumerosAleatorios.nextInt(25) + 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número e tecle enter");

        int respostaUsuario = input.nextInt();
        input.close();


        int numeroAnterior = sortearNumeroAleatorio - 1;
        int numeroPosterior = sortearNumeroAleatorio + 1;


        if (respostaUsuario == numeroAnterior || respostaUsuario == numeroPosterior) {

            int pontosAcertoAproximado = 5;
            System.out.println("sua resposta foi aproximada em uma unidade, você recebeu" + pontosAcertoAproximado + " pontos");
        } else if (respostaUsuario != sortearNumeroAleatorio) {
            System.out.println("você errou.");


        } else {
            int pontoAcerto = 10;
            System.out.println("Parabéns! Você acertou, sua resposta foi a mesma do computador. Você recebeu " + pontoAcerto + " pontos");
        }
    }

}

