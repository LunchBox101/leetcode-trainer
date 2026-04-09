# LeetCode Personal Trainer

## How it works
1. Open a problem file in `src/main/java/trainer/problems/`
2. Read the problem description at the top
3. Implement the `solve()` method — that's the ONLY method you touch
4. Run `./compile_and_run.sh` from this folder
5. Read the output — FAIL cases show a hint, not the answer
6. Fix, re-run, repeat until all pass

## Compile & run
```bash
cd leetcode-trainer
./compile_and_run.sh
```
Or manually:
```bash
find src -name "*.java" | xargs javac -d out
java -cp out trainer.core.Trainer
```

## Adding a new problem
1. Copy `ValidParentheses.java` as a template
2. Rename the class, fill in getName(), getDifficulty(), getTestCases(), solve()
3. Register it in `Trainer.java`'s problem list

## Problems included
| # | Problem | Difficulty | Key concept |
|---|---------|-----------|-------------|
| 1 | Two Sum | Easy | HashMap |
| 2 | Valid Parentheses | Easy | Stack |
| 3 | Maximum Subarray | Medium | Kadane's / DP |
