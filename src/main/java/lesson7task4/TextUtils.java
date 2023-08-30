package lesson7task4;

public class TextUtils {
    public static int calculateLength(String text) {
        if (text == null) {
            return 0;
        }
        return  text.length();
    }
}
