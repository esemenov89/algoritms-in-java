package exercises;

public class Exercise1_1_35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }
        for (int k = 2; k <= 2*SIDES; k++) {
            dist[k] /= 36.0;
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }

        System.out.println("--Experimentally--");
        double[] mas = new double[2*SIDES+1];
        int sum = 0;

        int N = 1_000_000;

        while (true) {
            System.out.println("N=" + N);

            for (int i = 0; i < mas.length; i++) {
                mas[i] = 0.0;
            }

            for (int i = 0; i < N; i++) {
                sum = (int) (1 + Math.random() * 6) + (int) (1 + Math.random() * 6);
                mas[sum] += 1.0 / N;
            }

            boolean allGood = true;

            for (int i = 0; i < mas.length; i++) {
                int endDistI = 5;
                int endMasI = 5;
                String distIstr = String.valueOf(dist[i]);
                String masIstr = String.valueOf(mas[i]);

                if (distIstr.length() < endDistI) {
                    endDistI = distIstr.length();
                }
                if (masIstr.length() < endMasI) {
                    endMasI = String.valueOf(mas[i]).length();
                }
                String distI = distIstr.substring(0, endDistI);
                String masI = masIstr.substring(0, endMasI);

                if (!distI.equals(masI)) {
                    allGood = false;
                    break;
                }
            }

            if (allGood) {
                System.out.println("All experimental values equals all theoretical values if N = " + N);
                break;
            } else {
                System.out.println("Not all experimental values equals all theoretical values if N = " + N);
            }
            N += 1_000_000;
        }
    }

}

// ANSWER: If N >= 1_000_000

// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_1_35 10 0 10 < test1_1_32.txt