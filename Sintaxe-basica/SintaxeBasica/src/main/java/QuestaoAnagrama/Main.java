package QuestaoAnagrama;

public class Main {
    public static void main(String[] args) {
        Anagrama anagrama = new Anagrama();
        System.out.println(anagrama.isAnagram("ala", "ala"));
        System.out.println(anagrama.isAnagramGPT("alegria", "regalia"));
    }
}
