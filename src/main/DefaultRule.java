public class DefaultRule implements Rule{
    public void applyRule(Integer value, StringBuilder answer) {
        if (answer.length() == 0) {
            answer.append(value);
        }
    }
}