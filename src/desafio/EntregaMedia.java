package desafio;


import java.util.Random;
import java.util.Scanner;


public class EntregaMedia {
    public static void main(String[] args) {
        Random gerarNumerosAleatorios = new Random();


        int sortearNumeroAleatorio = gerarNumerosAleatorios.nextInt(9) + 1;

        Scanner input = new Scanner(System.in);
        System.out.println(sortearNumeroAleatorio);

        int somaPontos = 0;

        System.out.println("Bora jogar! \n Qual número você chuta?");

        boolean continuar = true;
        while (continuar) {



            System.out.println("Digite um número e tecle enter");

            int respostaUsuario = input.nextInt();
            System.out.println("Você digitou o número " + respostaUsuario);
            if (respostaUsuario == sortearNumeroAleatorio) {
                somaPontos = somaPontos + 10;
                System.out.println("Você acertou, sua pontuação é de: " + somaPontos + " pontos");
            }
            int numeroAnterior = sortearNumeroAleatorio - 1;
            int numeroPosterior = sortearNumeroAleatorio + 1;
            if (respostaUsuario == numeroAnterior || respostaUsuario == numeroPosterior) {

                somaPontos = somaPontos + 5;
                System.out.println("sua resposta foi aproximada em uma unidade, você recebeu" + somaPontos + " pontos");
            } else {
                somaPontos += 0;
                System.out.println("Seu chute foi muito longe do número sorteado, você não recebeu pontos.");

            }

            System.out.println("Você quer continuar jogando? |n Digite s para sim ou n para não");
            input.nextLine();
            String quer = input.nextLine();
            if (quer.equals("n" || quer.equals(nao)))
                continuar = false;
        }
    }

}