package trainer.core;

public class TestCase<I, O> {
    public final String description;
    public final I input;
    public final O expected;
    public final String hint;

    public TestCase(String description, I input, O expected, String hint) {
        this.description = description;
        this.input = input;
        this.expected = expected;
        this.hint = hint;
    }
}
