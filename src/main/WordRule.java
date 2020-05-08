public class WordRule implements Rule {
    private int divisor;
    private String word;

    public WordRule(int divisor, String word){
        this.word = word;
        this.divisor = divisor;
    }

    @Override
    public void applyRule(Integer n, StringBuilder answer) {
        if (n % (divisor) == 0) {
            answer.append(word);
        }
    }
}