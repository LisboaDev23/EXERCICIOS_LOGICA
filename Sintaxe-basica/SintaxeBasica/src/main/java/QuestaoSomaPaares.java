public class QuestaoSomaPaares {
    //Implemente um método que receba dois números inteiros a e b e retorne a
    // soma de todos os números pares entre a e b (inclusive).
    //Regras:
    //Se a for maior que b, o método deve inverter os valores.
    //Utilize um loop para percorrer o intervalo e acumular a soma dos números pares.

    public static Integer somaPares (Integer a, Integer b){
        Integer soma = 0;
        if (a > b) {
            Integer temp = a;
            a = b;
            b = temp;

        }
        for (int i = a; i <= b; i++){
            if (i % 2 == 0){
                System.out.println(i);
                soma+=i;
            }
        }
        System.out.println(soma);
        return soma;
    }

    public static void main(String[] args) {
        somaPares(2,10);
        somaPares(7,3);
    }

}
