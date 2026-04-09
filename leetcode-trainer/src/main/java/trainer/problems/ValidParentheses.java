package trainer.problems;

import trainer.core.BaseProblem;
import trainer.core.TestCase;

import java.util.List;

/**
 * PROBLEM: Valid Parentheses
 * ─────────────────────────────────────────
 * Given a string containing only '(', ')', '{', '}', '[', ']',
 * determine if the input string is valid.
 *
 * Valid means:
 *   1. Open brackets are closed by the same type of bracket.
 *   2. Open brackets are closed in the correct order.
 *   3. Every close bracket has a corresponding open bracket.
 *
 * Examples:
 *   "()"     => true
 *   "()[]{}" => true
 *   "(]"     => false
 *   "([)]"   => false
 *   "{[]}"   => true
 *
 * ─────────────────────────────────────────
 * YOUR TASK: implement solve() below.
 * Do NOT change anything else in this file.
 */
public class ValidParentheses extends BaseProblem {

    @Override
    public String getName() { return "Valid Parentheses"; }

    @Override
    public String getDifficulty() { return "Easy"; }

    @Override
    public List<TestCase<?, ?>> getTestCases() {
        return List.of(
            new TestCase<>(
                "simple valid pair",
                "()",
                true,
                "A single open + matching close is always valid."
            ),
            new TestCase<>(
                "multiple valid pairs",
                "()[]{}",
                true,
                "Each pair is self-contained. Process one character at a time."
            ),
            new TestCase<>(
                "mismatched type",
                "(]",
                false,
                "Opening '(' must close with ')'. A Stack helps — push opens, pop and compare on each close."
            ),
            new TestCase<>(
                "wrong order",
                "([)]",
                false,
                "Order matters. The most recently opened bracket must close first — that's exactly what a Stack gives you."
            ),
            new TestCase<>(
                "nested valid",
                "{[]}",
                true,
                "Nesting is fine as long as each inner pair closes before the outer one."
            ),
            new TestCase<>(
                "only open brackets",
                "(((",
                false,
                "If the stack is not empty at the end, there are unclosed brackets."
            ),
            new TestCase<>(
                "empty string",
                "",
                true,
                "Edge case: empty string has nothing invalid — return true."
            ),
            new TestCase<>(
                "close before open",
                "]",
                false,
                "If you hit a close bracket but the stack is empty, it's invalid immediately."
            )
        );
    }

    // ─────────────────────────────────────────────────────────────
    //   YOUR CODE GOES BELOW HERE
    //   Only edit the solve() method body.
    // ─────────────────────────────────────────────────────────────

    public boolean solve(String s) {
        // TODO: implement me!
        //
        // Hint: use a Stack<Character>
        //   - For every character in s:
        //       if it's an opening bracket: push it onto the stack
        //       if it's a closing bracket:
        //           if stack is empty => return false (nothing to match)
        //           pop from stack, check it's the matching open bracket
        //           if not => return false
        //   - After the loop: return stack.isEmpty()
        //     (any leftover opens mean it's invalid)
        //
        return false;
    }

    // ─────────────────────────────────────────────────────────────

    @Override
    protected Object solveRaw(Object input) {
        return solve((String) input);
    }
}
