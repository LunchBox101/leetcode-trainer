package trainer.problems;

import trainer.core.BaseProblem;
import trainer.core.TestCase;

import java.util.List;

/**
 * PROBLEM: Merge Intervals
 * ─────────────────────────────────────────
 * Given an array of intervals where intervals[i] = [start, end],
 * merge all overlapping intervals and return the result.
 *
 * Two intervals overlap if one starts before the other ends.
 * Touching counts too: [1,4] and [4,5] overlap => [1,5]
 *
 * Examples:
 *   [[1,3],[2,6],[8,10],[15,18]]  =>  [[1,6],[8,10],[15,18]]
 *   [[1,4],[4,5]]                 =>  [[1,5]]
 *   [[4,7],[1,4]]                 =>  [[1,7]]   <-- note: input not sorted!
 *
 * ─────────────────────────────────────────
 * YOUR TASK: implement solve() below.
 * Do NOT change anything else in this file.
 */
public class MergeIntervals extends BaseProblem {

    @Override
    public String getName() { return "Merge Intervals"; }

    @Override
    public String getDifficulty() { return "Medium"; }

    @Override
    public List<TestCase<?, ?>> getTestCases() {
        return List.of(

            new TestCase<>(
                "example 1 - one merge in the middle",
                new int[][]{{1,3},{2,6},{8,10},{15,18}},
                new int[][]{{1,6},{8,10},{15,18}},
                "[1,3] and [2,6] overlap because 2 <= 3. The merged end is max(3,6)=6. The others don't touch anything."
            ),

            new TestCase<>(
                "example 2 - touching endpoints merge",
                new int[][]{{1,4},{4,5}},
                new int[][]{{1,5}},
                "Touching counts as overlapping. 4 <= 4, so merge into [1,5]."
            ),

            new TestCase<>(
                "example 3 - input not sorted",
                new int[][]{{4,7},{1,4}},
                new int[][]{{1,7}},
                "The input isn't always sorted! Sort by start time FIRST, then merge."
            ),

            new TestCase<>(
                "no merges needed",
                new int[][]{{1,2},{3,4},{5,6}},
                new int[][]{{1,2},{3,4},{5,6}},
                "None of these touch. Your output should equal the (sorted) input."
            ),

            new TestCase<>(
                "all intervals merge into one",
                new int[][]{{1,4},{2,5},{3,8}},
                new int[][]{{1,8}},
                "Each one overlaps the next. Think about how the end keeps growing: max(4,5)=5, max(5,8)=8."
            ),

            new TestCase<>(
                "single interval",
                new int[][]{{3,7}},
                new int[][]{{3,7}},
                "Edge case: only one interval, nothing to merge, just return it."
            ),

            new TestCase<>(
                "contained interval (one inside another)",
                new int[][]{{1,10},{2,5}},
                new int[][]{{1,10}},
                "[2,5] is completely inside [1,10]. The merged result is just [1,10]. The end doesn't grow."
            ),

            new TestCase<>(
                "multiple groups with gaps",
                new int[][]{{1,3},{2,4},{6,8},{7,10},{12,15}},
                new int[][]{{1,4},{6,10},{12,15}},
                "Three separate groups. Sort first, then walk through and merge when current.start <= last.end."
            ),

            new TestCase<>(
                "unsorted input with multiple merges",
                new int[][]{{15,18},{1,3},{8,10},{2,6}},
                new int[][]{{1,6},{8,10},{15,18}},
                "Same as example 1 but shuffled. Confirms you MUST sort before merging."
            )
        );
    }

    // ─────────────────────────────────────────────────────────────
    //   YOUR CODE GOES BELOW HERE
    //   Only edit the solve() method body.
    // ─────────────────────────────────────────────────────────────

    public int[][] solve(int[][] intervals) {
        // TODO: implement me!
        //
        // Step 1: Sort intervals by their start value.
        //   Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //
        // Step 2: Walk through sorted intervals.
        //   Keep a result list. For each interval:
        //     - If the list is empty OR current.start > last.end:
        //         no overlap, just add it.
        //     - Else:
        //         overlap! Update last.end = Math.max(last.end, current.end)
        //
        // Step 3: Convert your list back to int[][].
        //   result.toArray(new int[0][])
        //
        return new int[][]{};
    }

    // ─────────────────────────────────────────────────────────────

    @Override
    protected Object solveRaw(Object input) {
        return solve((int[][]) input);
    }
}
