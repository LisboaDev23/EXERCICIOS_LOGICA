package QuestaoAnagrama;

import java.util.Arrays;

public class Anagrama {
    //1) Crie uma função para validar se duas palavras são anagramas(anagramas são palavras que são
    // escritas da mesma forma na ordem inversa). Ex: teste("amor","roma")->true
    public Boolean isAnagram(String word1, String word2){
        if (word1.length() != word2.length()){
            System.out.println("Palavras com tamanhos diferentes!");
            return false;
        }
        String word1Invert = "";
        for (int i = word1.length()-1; i >=0; i--){
            word1Invert+=word1.charAt(i);
            System.out.println(word1Invert);
        }
        return word1Invert.equals(word2);
    }

    public Boolean isAnagramGPT(String word1, String word2){
        if (word1.length() != word2.length()){
            System.out.println("Palavras com tamanhos diferentes!");
            return false;
        }
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }
}
