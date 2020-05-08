import java.util.List;

public class FizzBuzz {

    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";

    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules){
        this.rules = rules;
    }

    public String say(Integer value) {
        StringBuilder answer = new StringBuilder();

        for (Rule rule : rules){
            rule.applyRule(value, answer);
        }

        return answer.toString();
    }

}