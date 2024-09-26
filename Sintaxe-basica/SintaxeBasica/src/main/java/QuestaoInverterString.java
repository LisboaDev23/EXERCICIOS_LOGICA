import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestaoInverterString {
    //Implemente um método que receba uma string como argumento e retorne a string invertida.
    //
    //Regras:
    //Não utilize bibliotecas ou métodos prontos de inversão de string.
    //Utilize um loop para construir a string invertida caractere por caractere.

    public static String inverterString (String palavra){
        //recuperar todas as letras e armazenar elas num array
        String[] listLetras = palavra.split("");
        //percorrer todas as letras
        String stringInvertida = "";
        for (int i = listLetras.length-1; i <= 0; i--){

        }
        return stringInvertida;
    }

    public static void main(String[] args) {
        System.out.println(inverterString("SIM"));
    }
}
