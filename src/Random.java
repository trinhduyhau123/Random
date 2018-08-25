import java.util.Random;


class Random1 {
    public static void randomInteger() {
        //Random[] number = new Random[1000];
        int[] number = new int[1000];

        for (int i = 0; i < 1000; i++) {
            Random n = new Random();
            if (i < 50) {
                number[i] = n.nextInt(100);
                System.out.printf(number[i] + "\t");
            } else {
                number[i] = n.nextInt(1000 - 50 + 1) + 50;
                System.out.printf(number[i] + "\t");
            }

        }
    }
    public static void main(String[] args) {
        randomInteger();
    }
}


