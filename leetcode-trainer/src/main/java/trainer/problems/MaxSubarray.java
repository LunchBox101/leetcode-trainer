package trainer.problems;

import trainer.core.BaseProblem;
import trainer.core.TestCase;

import java.util.List;

/**
 * PROBLEM: Maximum Subarray (Kadane's Algorithm)
 * ─────────────────────────────────────────
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum,
 * and return that sum.
 *
 * A subarray is a contiguous portion of an array.
 *
 * Examples:
 *   [-2, 1, -3, 4, -1, 2, 1, -5, 4]  =>  6   (subarray [4, -1, 2, 1])
 *   [1]                                =>  1
 *   [5, 4, -1, 7, 8]                  =>  23
 *
 * ─────────────────────────────────────────
 * YOUR TASK: implement solve() below.
 * Do NOT change anything else in this file.
 */
public class MaxSubarray extends BaseProblem {

    @Override
    public String getName() { return "Maximum Subarray"; }

    @Override
    public String getDifficulty() { return "Medium"; }

    @Override
    public List<TestCase<?, ?>> getTestCases() {
        return List.of(
            new TestCase<>(
                "classic example",
                new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4},
                6,
                "Best subarray is [4,-1,2,1]. Track a 'currentSum' and reset if it goes negative."
            ),
            new TestCase<>(
                "single element",
                new int[]{1},
                1,
                "Edge case: only one choice available."
            ),
            new TestCase<>(
                "all positive",
                new int[]{5, 4, -1, 7, 8},
                23,
                "When all values are positive, the whole array is the answer."
            ),
            new TestCase<>(
                "all negative",
                new int[]{-3, -2, -1, -4},
                -1,
                "Must pick at least one element. The least-negative number is the answer."
            ),
            new TestCase<>(
                "negative then large positives",
                new int[]{-10, 100, -5, 200},
                295,
                "Starting negative doesn't mean the whole subarray is bad. Look at what follows."
            ),
            new TestCase<>(
                "large swing",
                new int[]{-2, -3, 4, -1, -2, 1, 5, -3},
                7,
                "Best subarray is [4,-1,-2,1,5]. When currentSum + nums[i] > nums[i] alone, keep extending."
            )
        );
    }

    // ─────────────────────────────────────────────────────────────
    //   YOUR CODE GOES BELOW HERE
    //   Only edit the solve() method body.
    // ─────────────────────────────────────────────────────────────

    public int solve(int[] nums) {
        // TODO: implement me!
        //
        // Kadane's Algorithm uses two variables:
        //   currentSum = the best sum of a subarray ending at THIS index
        //   maxSum     = the best sum seen across all subarrays so far
        //
        // At each step:
        //   currentSum = Math.max(nums[i], currentSum + nums[i])
        //   maxSum     = Math.max(maxSum, currentSum)
        //
        // Initialize both to nums[0], then loop from index 1.
        //
        return 0;
    }

    // ─────────────────────────────────────────────────────────────

    @Override
    protected Object solveRaw(Object input) {
        return solve((int[]) input);
    }
}
