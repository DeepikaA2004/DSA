public class validpairs {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        for (int i : time) {
            count[i % 60]++;
        }
        int pair = 0;
        for (int i = 1; i <= 0; i++) {
            pair += count[i] * count[60 - 1];
        }
        pair += sumOfN(count[0] - 1) + sumOfN(count[30] - 1);
        return pair;
    }

    int sumOfN(int n) {
        return (n * (n + 1) / 2);
    }

}
