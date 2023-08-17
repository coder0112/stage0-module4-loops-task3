package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int n) {
        int i = 0, f = 0, a = 0, b = 1;
        while (i != n) {
            if (i == 0) {
                System.out.println(f);

            } else if (i == 1) {
                System.out.println(1);
            } else {
                int t = b;
                f = a + b;
                a = t;
                b = f;
                System.out.println(f);
            }
            i++;
        }
    }
}
