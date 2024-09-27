import java.util.Scanner;

public class QuestaoSwitchCase {
    //o switch avalia o valor de uma variável e fornece fluxos de execuções para caso
    //o valor fornecido seja o equivalente ao valor tratado
    //instrução break para a execução do restante do programa MUITO IMPORTANTE LEMBRAR
    //instrução default será executada caso nenhum dos casos forem atendidos

    //Questão: Crie um programa que receba um número inteiro de 1 a 7 e imprima o dia da semana correspondente
    // (por exemplo, 1 = "Domingo", 2 = "Segunda-feira" etc.). Se o número estiver
    // fora dessa faixa, imprima "Número inválido".

    public static void diaSemana (Integer numero){
        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void main(String[] args) {
        diaSemana(9);
    }
}
