import java.util.List;

public class Question {
    private final List<Answer> answers;
    private final String text;
    private QuestionType type;

    public Question(String text, List<Answer> answers) {
        this.text = text;
        this.answers = answers;

        setQuestionType();
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getText() {
        return text + " (Question has " +
                (
                this.type == QuestionType.SINGLE_ANSWER
                ? "single answer"
                : "multiple answers"
                )
                + ")";
    }

    public boolean isSingleAnswer() {
        return this.type == QuestionType.SINGLE_ANSWER;
    }

    private void setQuestionType() {
        int correctAnswers = 0;
        for(Answer a: this.answers) {
            if (a.isCorrect()) correctAnswers++;
        }

        this.type = correctAnswers > 1
                ? QuestionType.MULTIPLE_ANSWER
                : QuestionType.SINGLE_ANSWER;
    }
}
