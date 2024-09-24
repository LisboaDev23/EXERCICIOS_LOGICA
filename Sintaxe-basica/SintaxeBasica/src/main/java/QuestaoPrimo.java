import java.util.ArrayList;
import java.util.List;

public class QuestaoPrimo {
    //Implemente um método que receba um número inteiro como argumento e retorne true se
    // o número for primo e false caso contrário. Um número primo é aquele que só é divisível
    // por 1 e por ele mesmo.
    // regras: 
    // O número deve ser maior que 1 para ser considerado primo.
    //Utilize estruturas básicas como loops e controle de fluxo (if, else).
    public static boolean isPrime (Integer number){
        if (number <= 1) {
            System.out.println("Número inválido");
            return false;
        }
        //preciso saber a quantidade de divisores do número que vier no parâmetro
        //se o número tiver +2 divisores, ele não é primo
        //vou percorrer todos os números até o número do parâmetro,se o resto da divisão
        //do número pelo [i] adicione no array
        List<Integer> listaDivisiveis = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 ) {
                listaDivisiveis.add(i);
            }
        }
        if (listaDivisiveis.size() > 2) {
            //se a quantidade de divisíveis for maior que 2, não é primo
            System.out.println("O número " + number + " não é primo!");
            return false;
        } else {
            System.out.println("O número " + number + " é primo!");
            return true;
        }
    }
    public static void main(String[] args) {
        isPrime(5);
    }

}
