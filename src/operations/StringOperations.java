package operations;

public class StringOperations {




        public static void showFirstTwoNumberParts(String userInput) {
            String[] splitUserInput = userInput.split("-");
            System.out.println("First two number parts: " + splitUserInput[0] + splitUserInput[2]);
        }

        public static void showDocumentNumberWithMaskedLetters(String userInput){
            String maskedDocumentNumber = userInput.replaceAll("[a-zA-Zа]", "*");
            System.out.println("Masked by \"*\" document number is: " + maskedDocumentNumber);
        }


        public static void showDocumentLetters(String userInput){
            String invokedLetters = userInput.replaceAll("[^a-zA-Zа]", "").toLowerCase();
            String formattedLetters = String.format("%s/%s/%s/%s", invokedLetters.substring(0, 3), invokedLetters.substring(3, 6), invokedLetters.substring(6, 7), invokedLetters.substring(7, 8));

            System.out.println("New document number with letters only is: " + formattedLetters);
        }


        public static void showFormattedDocumentNumberWithLetters(String userInput){
            String invokedLetters = userInput.replaceAll("[^a-zA-Zа]", "").toUpperCase();
            StringBuilder stringBuilder = new StringBuilder("Letters:");
            stringBuilder.append(invokedLetters, 0, 3).append("/").append(invokedLetters, 3, 6).append("/").append(invokedLetters.charAt(6)).append("/").append(invokedLetters.charAt(7));

            System.out.println("Document number in the \"Letters:yyy/yyy/y/y\" format is: " + stringBuilder);
        }


        public static void checkWordCombination(String userInput){
            boolean containsSequence = userInput.toLowerCase().contains("abc");

            if(containsSequence){
                System.out.println("The entered document number contains \"abc\"");
            }
            else{
                System.out.println("The entered document number doesn't contain \"abc\"");
            }
        }

        public static void checkNumber(String userInput){
            boolean isNumberSequencePresent = userInput.startsWith("555");

            if(isNumberSequencePresent)
            {
                System.out.println("The document number starts with \"555\"");
            }
            else{
                System.out.println("The document number doesn't start with \"555\"");
            }
        }

        public  static void checkDocumentNumberEnd(String userInput){
            boolean isDocumentNumberEndsWithSequence = userInput.endsWith("1a2b");

            if(isDocumentNumberEndsWithSequence){
                System.out.println("The document number ends with \"1a2b\"");
            }
            else{
                System.out.println("The document number doesn't end with \"1a2b\"");
            }
        }
    }

