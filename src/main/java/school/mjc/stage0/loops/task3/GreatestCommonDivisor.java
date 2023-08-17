package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int m, int n) {

        if (m > 0 && n > 0) {
            while (m != n) {
                if (m > n) {
                    m -= n;
                } else {
                    n -= m;
                }
            }
           System.out.println(m);
        } else {
            System.out.println(m == 0 ? n : m);
        }
    }
}
