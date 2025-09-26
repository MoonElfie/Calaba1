public class a2 {

    public static void main(String[] args) {

        int[] massive = {23, 34, 71, 6, 105, 85, 65, 27, 94};

        int accumulator = 0;
        for (int a = 0; a < massive.length; a++) {
            int totalmass = massive[a];
            if (massive[a] > accumulator) {
                accumulator = massive[a];
            }
            System.out.println(accumulator);


        }
    }

}








