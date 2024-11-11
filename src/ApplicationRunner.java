import operations.StringOperations;

import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a document number in the xxxx-yyy-xxxx-yyy-xyxy format: ");
        String userInput = scanner.nextLine();
        StringOperations.showFirstTwoNumberParts(userInput);
        StringOperations.showDocumentNumberWithMaskedLetters(userInput);
        StringOperations.showDocumentLetters(userInput);
        StringOperations.showFormattedDocumentNumberWithLetters(userInput);
        StringOperations.checkWordCombination(userInput);
        StringOperations.checkNumber(userInput);
        StringOperations.checkDocumentNumberEnd(userInput);
    }
}
