package L7task2;

public class LettersUppercase {
    public static String lettersConvertUppercase(String text) {

        if (text == null) {
            return "The text is null";
        }
        return text.toUpperCase();
    }
}
