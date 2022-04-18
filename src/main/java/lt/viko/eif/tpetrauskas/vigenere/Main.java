package lt.viko.eif.tpetrauskas.vigenere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vigenere vigAlg = new Vigenere();
        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite teksta: ");
        String inputText = input.nextLine();

        String inputKeyword = vigAlg.validateTextLength(inputText);

        String text = vigAlg.LowerToUpper(inputText);
        String keyword = vigAlg.LowerToUpper(inputKeyword);

        String key = vigAlg.generateKey(text, keyword);

        String cipherText = vigAlg.cipherText(text, key);

        System.out.println("Uzkoduotas tekstas: "
                + cipherText + "\n");

        System.out.println("Issifruotas tekstas: "
                + vigAlg.originalText(cipherText, key));
    }
}
