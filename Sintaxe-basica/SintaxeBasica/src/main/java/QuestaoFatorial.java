public class QuestaoFatorial {

    //Implemente um método recursivo para calcular o fatorial de um número inteiro. O fatorial de um número é o
    // produto de todos os inteiros positivos até o número fornecido. O fatorial de 0 é definido como 1.
    //Fórmula:
    //n! = n * (n-1) * (n-2) * ... * 1
    //0! = 1
    //Regras:
    //Utilize recursão para resolver o problema.
    //O método deve receber um número inteiro n e retornar seu fatorial.

    public static Integer fatorial (Integer n) {
        //condição de parada, se o n do fatorial for 0, return 1;
        if (n == 0) {
            return 1;
        }
         return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(4));
    }
}
