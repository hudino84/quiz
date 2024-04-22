import java.util.List;

public class Quiz {

    private final String name;
    private final String description;
    private final List<Question> questions;
    private boolean finished;

    Quiz(String name, String description, List<Question> question) {
        this.name = name;
        this.description = description;
        this.questions = question;
        this.finished = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    //    public void shuffleQuestions() {
//        Collections.shuffle(questions);
//    }
}