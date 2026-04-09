package trainer.problems;

import trainer.core.BaseProblem;
import trainer.core.TestCase;

import java.util.List;

/**
 * PROBLEM: Two Sum
 * ─────────────────────────────────────────
 * Given an array of integers `nums` and an integer `target`,
 * return the INDICES of the two numbers that add up to target.
 *
 * You may assume exactly one solution exists.
 * You cannot use the same element twice.
 *
 * Example:
 *   nums = [2, 7, 11, 15], target = 9
 *   => [0, 1]   because nums[0] + nums[1] = 2 + 7 = 9
 *
 * ─────────────────────────────────────────
 * YOUR TASK: implement solve() below.
 * Do NOT change anything else in this file.
 */
public class TwoSum extends BaseProblem {

    /** Input wrapper so we can pass two things as one object. */
    public record Input(int[] nums, int target) {
        @Override public String toString() {
            return "nums=" + java.util.Arrays.toString(nums) + ", target=" + target;
        }
    }

    @Override
    public String getName() { return "Two Sum"; }

    @Override
    public String getDifficulty() { return "Easy"; }

    @Override
    public List<TestCase<?, ?>> getTestCases() {
        return List.of(
            new TestCase<>(
                "basic pair",
                new Input(new int[]{2, 7, 11, 15}, 9),
                new int[]{0, 1},
                "Which two numbers add up to 9? What are their positions?"
            ),
            new TestCase<>(
                "answer not at index 0",
                new Input(new int[]{3, 2, 4}, 6),
                new int[]{1, 2},
                "Don't assume the first element is always part of the answer."
            ),
            new TestCase<>(
                "duplicate values",
                new Input(new int[]{3, 3}, 6),
                new int[]{0, 1},
                "Same value can appear twice — track indices, not just values."
            ),
            new TestCase<>(
                "negative numbers",
                new Input(new int[]{-1, -2, -3, -4, -5}, -8),
                new int[]{2, 4},
                "Negatives work the same way. -3 + -5 = -8."
            ),
            new TestCase<>(
                "larger array",
                new Input(new int[]{0, 4, 3, 0, 1, 7, 2}, 9),
                new int[]{1, 5},
                "Think about how to avoid checking every pair. A HashMap stores what you've seen so far."
            )
        );
    }

    // ─────────────────────────────────────────────────────────────
    //   YOUR CODE GOES BELOW HERE
    //   Only edit the solve() method body.
    // ─────────────────────────────────────────────────────────────

    public int[] solve(int[] nums, int target) {
        // TODO: implement me!
        //
        // Brute force approach:
        //   Two nested loops, check every pair i, j where j > i.
        //   If nums[i] + nums[j] == target, return new int[]{i, j}.
        //
        // Optimal approach (O(n)):
        //   Use a HashMap<Integer, Integer> to store value => index.
        //   For each number, check if (target - number) is already in the map.
        //
        return new int[]{};
    }

    // ─────────────────────────────────────────────────────────────

    @Override
    protected Object solveRaw(Object input) {
        Input in = (Input) input;
        return solve(in.nums, in.target);
    }
}
