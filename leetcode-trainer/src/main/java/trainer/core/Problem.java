package trainer.core;

import java.util.List;

/**
 * Every LeetCode problem implements this interface.
 * You implement solve(). The trainer calls run() for you.
 */
public interface Problem {
    String getName();
    String getDifficulty();   // "Easy" | "Medium" | "Hard"
    List<TestCase<?, ?>> getTestCases();
    void run();
}
