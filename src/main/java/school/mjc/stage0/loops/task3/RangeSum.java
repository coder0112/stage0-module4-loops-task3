package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int n, int m) {
        int sum = 0;
        if (n == m) {
            System.out.println(n);
            return;
        }
        while (n != m) {
            sum += n;
            n++;
        }
        sum += m;
        System.out.println(sum);
    }
}
