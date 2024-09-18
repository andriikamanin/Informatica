public class Console {
    FileLoader fileLoader = new FileLoader();

    public void removeSpaces(String input) {
        if (input == null) {
            System.out.println("Non c'e' nessuna stringa.");
            return;
        }

        StringBuilder result = new StringBuilder();  // Use StringBuilder to build the result string

        for (int i = 0; i < input.length(); i++) {  // Iterate through each character in the input string
            char currentChar = input.charAt(i);
            if (currentChar != ' ') {  // If the character is not a space, append it to the result
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());  // Convert StringBuilder to String and return it
    }
    public String caricaStringa(){
        return fileLoader.loadFromFile();
    }
    public void start(){
        String stringa = caricaStringa();
        removeSpaces(stringa);
        countConsonants(stringa);
        countVowels(stringa);

    }

    public void countVowels(String input) {
        if (input == null) {
            System.out.println("Non c'e' nessuna lettera vowels.");// Handle null input
        }

        int vowelCount = 0;
        String vowels = "AEIOUaeiou";  // Define vowels in both uppercase and lowercase

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {  // Check if the character is a vowel
                vowelCount++;
            }
        }

        System.out.println("Numero di lettere vowel sono "+vowelCount) ; // Return the number of vowels
    }

    // Function to count the number of consonants in a string
    public void countConsonants(String input) {
        if (input == null) {
            System.out.println("Non c'e' nessuna lettera consonanta.");
        }

        int consonantCount = 0;
        String vowels = "AEIOUaeiou";  // Define vowels to exclude them
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is a letter and not a vowel
            if (Character.isLetter(currentChar) && vowels.indexOf(currentChar) == -1) {
                consonantCount++;
            }
        }

        System.out.println("Numero di simboli consonanti: "+ consonantCount); // Return the number of consonants
    }





}
