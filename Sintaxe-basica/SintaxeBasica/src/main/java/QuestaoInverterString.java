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
        int count = 1;
        for (int i = 0; i < listLetras.length; i++){
            stringInvertida+= listLetras[listLetras.length-count];
            count++;
        }
        return stringInvertida;
    }

    //MELHORIA FORNECIDA PELO CHATGPT
    public static String inverterStringGPT(String palavra) {
        // String para armazenar o resultado da string invertida
        String stringInvertida = "";

        // Percorre a string do último caractere até o primeiro
        for (int i = palavra.length() - 1; i >= 0; i--) {
            //ATRAVÉS DO MÉTODO charAt(index) conseguimos recuperar a letra que está no devido índice
            stringInvertida += palavra.charAt(i); // Adiciona o caractere à string invertida
        }

        return stringInvertida;
    }

    public static void main(String[] args) {
        System.out.println(inverterString("GABRIEL"));
        System.out.println(inverterStringGPT("GABRIEL"));
    }
}
