public class NumberCube {

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] rolls = new int[numTosses];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = cube.toss();
        }
        return rolls;
    }

    public static int getLongestRun(int[] values) {
        int run = 0;
        int maxRun = 0;
        int maxIndex = -1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                run++;
                if (run > maxRun) {
                    maxRun = run;
                    maxIndex = i - run + 1;
                }
            } else {
                run = 0;
            }
        }
        return maxIndex;
    }
}