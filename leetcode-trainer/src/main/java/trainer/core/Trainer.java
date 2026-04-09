package trainer.core;

import trainer.problems.TwoSum;
import trainer.problems.ValidParentheses;
import trainer.problems.MaxSubarray;
import trainer.problems.MergeIntervals;

import java.util.List;

/**
 * Main runner. Add new problems to the list below as you work through them.
 */
public class Trainer {

    public static void main(String[] args) {
        List<Problem> problems = List.of(
            new TwoSum(),
            new ValidParentheses(),
            new MaxSubarray(),
            new MergeIntervals()
        );

        System.out.println("==========================================");
        System.out.println("     LeetCode Personal Trainer");
        System.out.println("==========================================");
        System.out.println("  Implement solve() in each problem file.");
        System.out.println("  FAILs show hints, not answers. Good luck!");

        for (Problem p : problems) {
            p.run();
        }

        System.out.println("\n==========================================");
        System.out.println("  Done! Fix the FAILs and re-run.");
        System.out.println("==========================================\n");
    }
}
