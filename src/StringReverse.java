public class StringReverse {
    public static void main(String[] args) {
        /*
          Write a program that takes a full name string (hardcoded): String fullName = "  alice marie johnson  ";
          Trim whitespace, then capitalize the first letter of each word (use a combination of substring, toUpperCase, and concatenation).
          Extract and print: first name, middle name, last name separately using indexOf and substring.
          Count how many vowels (a,e,i,o,u — both upper and lower case) are in the cleaned name.
          Reverse the string character by character using a loop and string concatenation.

            Hint: Use toLowerCase() first before vowel counting so you only need to check lowercase vowels.
            Expected Output (sample):
            Cleaned: Alice Marie Johnson
            First: Alice  Middle: Marie  Last: Johnson
            Vowel count: 8
            Reversed: nosnhoJ eiraM ecilA
         */
        String fullName = "  alice marie johnson  ";
        String cleanedName = fullName.trim();

        System.out.println("Cleaned: " + cleanedName);

        String[] nameParts = cleanedName.split(" ");

        StringBuilder capitalizedFullName = new StringBuilder();
        for (String part : nameParts) {

            if (!part.isEmpty()) {
                capitalizedFullName.append(part.substring(0, 1).toUpperCase())
                                   .append(part.substring(1))
                                   .append(" ");
            }
        }

        System.out.println("Reversed: "+capitalizedFullName.reverse());
    }
}
