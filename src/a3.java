import java.util.Arrays;

public class a3 {
    public static void main(String[] args) {

        int[] massive = {23, 34, 71, 6, 105, 85, 65, 27, 94};
        int[] delta = new int[massive.length];

        for (int a = 0; a < massive.length; a++) {
            int totalmass = massive[a];
            delta[a] = 60 - totalmass;

        }

        System.out.println(Arrays.toString(delta));
    }
}
