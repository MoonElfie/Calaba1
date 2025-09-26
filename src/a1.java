public class a1 {
    public static void main(String[] args) {

        int[] massive = {23, 34, 54, 62, 85, 62, 27, 94};
        for (int a = 0; a < massive.length; a = a +1) {
            if (massive[a] != 60) {
                massive[a] = 59;
            }
            System.out.println(massive[a]);
        }
    }
}



