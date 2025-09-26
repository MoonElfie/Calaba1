import java.util.Arrays;

public class a4 {
    public static void main(String[] args) {

        String s = "ÐŸÐµÑ€ÐµÐ²Ñ‹Ð±Ð¾Ñ€Ñ‹ Ð²Ñ‹Ð±Ñ€Ð°Ð½Ð½Ð¾Ð³Ð¾ Ð¿Ñ€ÐµÐ·Ð¸Ð´ÐµÐ½Ñ‚Ð°";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Ðµ') {
                count++;
            }
        }

        System.out.println("ÐšÐ¾Ð»Ð¸Ñ‡ÐµÑÑ‚Ð²Ð¾ Ð±ÑƒÐºÐ² 'Ðµ': " + count);
    }
}