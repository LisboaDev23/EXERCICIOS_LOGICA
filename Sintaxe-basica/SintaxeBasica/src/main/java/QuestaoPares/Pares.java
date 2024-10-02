package QuestaoPares;

public class Pares {
    //Dado um array em que cada elemento representa uma meia e seu tamanho, encontre quantos pares
    // podem ser formados. Ex.: teste([10, 20, 10, 20, 10, 30, 20, 50, 10]) -> 3 pares.
    //Descubro quantos pares podem ser formados para cada tamanho.
    //Ex.: teste([10, 20, 10, 20, 10, 30, 20, 50, 10]) -> 2 pares de 10 e 1 par de 20

    public void verifyPairs(Integer[] halfsArrays){
        int pairs = 0;
        for (int i = 0; i < halfsArrays.length; i++) {
            int quantityElementsEquals = 0;
            System.out.println(halfsArrays[i]);
            for (int j = 1; j < halfsArrays.length; j++) {
                if (halfsArrays[j].equals(halfsArrays[i])) {
                    quantityElementsEquals++;
                }
            }
            if (quantityElementsEquals % 2 == 0) {
                pairs++;
            }
        }
        System.out.println(pairs + " pares.");
    }
}
