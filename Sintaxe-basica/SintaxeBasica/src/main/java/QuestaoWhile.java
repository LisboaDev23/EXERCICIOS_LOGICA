public class QuestaoWhile {
    //enquanto(condição) for verdadeira execute {...}

    //Questão: Crie um programa que exiba todos os números pares entre 0 e 20 usando um while.

    public static void numerosPares (){
        int count = 0;
        while (count <= 20) {
            if (count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }
    }

    public static void main(String[] args) {
        numerosPares();
    }
}
