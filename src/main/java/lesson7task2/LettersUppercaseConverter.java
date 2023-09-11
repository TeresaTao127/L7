package lesson7task2;

public class LettersUppercaseConverter {
    public static String ConvertToUppercase(String text) {

        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}
