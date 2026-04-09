package trainer.core;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Handles test execution and output. never edit this file.
 */
public abstract class BaseProblem implements Problem {

    @Override
    public void run() {
        System.out.println("\n==========================================");
        System.out.printf("  %s  [%s]%n", getName(), getDifficulty());
        System.out.println("==========================================");

        List<TestCase<?, ?>> cases = getTestCases();
        int passed = 0;

        for (int i = 0; i < cases.size(); i++) {
            TestCase<?, ?> tc = cases.get(i);
            Object actual;
            try {
                actual = solveRaw(tc.input);
            } catch (Exception e) {
                actual = "ERROR: " + e.getMessage();
            }

            boolean ok = deepEqual(actual, tc.expected);

            System.out.printf("%n  Test %d: %s%n", i + 1, tc.description);
            System.out.printf("  Input:    %s%n", fmt(tc.input));
            System.out.printf("  Expected: %s%n", fmt(tc.expected));
            System.out.printf("  Got:      %s%n", fmt(actual));

            if (ok) {
                System.out.println("  PASS");
                passed++;
            } else {
                System.out.println("  FAIL");
                System.out.println("  Hint: " + tc.hint);
            }
        }

        System.out.printf("%n  Result: %d / %d tests passed%n", passed, cases.size());
    }

    /** Override in each problem to call your solve() with the right cast. */
    protected abstract Object solveRaw(Object input);

    private boolean deepEqual(Object a, Object b) {
        if (a == null || b == null) return Objects.equals(a, b);
        if (a instanceof int[] && b instanceof int[])
            return Arrays.equals((int[]) a, (int[]) b);
        if (a instanceof int[][] && b instanceof int[][])
            return Arrays.deepEquals((int[][]) a, (int[][]) b);
        if (a.getClass().isArray() && b.getClass().isArray())
            return Arrays.deepEquals(new Object[]{a}, new Object[]{b});
        return Objects.equals(a, b);
    }

    private String fmt(Object o) {
        if (o == null) return "null";
        if (o instanceof int[]) return Arrays.toString((int[]) o);
        if (o instanceof int[][]) return Arrays.deepToString((int[][]) o);
        if (o.getClass().isArray()) return Arrays.deepToString(new Object[]{o});
        return o.toString();
    }
}
