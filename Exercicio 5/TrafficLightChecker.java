package Exercicio5;

import java.util.Scanner;
public class TrafficLightChecker {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o código da cor");
            int corAtual = input.nextInt();

            String proximaCor;
            if (corAtual == 0) {
                proximaCor = "Cor inválida";
            } else if (corAtual == 1) {
                proximaCor = "Próximo sinal de trânsito é verde";
            } else if (corAtual == 2) {
                proximaCor = "Próximo sinal de trânsito é amarelo";
            } else if (corAtual == 3) {
                proximaCor = "Próximo sinal de trânsito é vermelho";
            } else {
                proximaCor = "Cor inválida";
            }

            System.out.println(proximaCor);
        }
    }
}
