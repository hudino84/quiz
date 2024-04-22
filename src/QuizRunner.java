import java.util.*;

public class QuizRunner {
    private final Quiz quiz;
    private final HashMap<Character, Answer> answersResults;
    private Integer correctAnswers;

    public QuizRunner(Quiz quiz) {
        this.quiz = quiz;
        this.answersResults = new HashMap<>();
        this.correctAnswers = 0;
    }

    public void run() {
        System.out.println();
        System.out.println("Welcome to the quiz: " + quiz.getName());
        System.out.println(quiz.getDescription());
        System.out.println("This quiz has " + quiz.getQuestions().size() + " questions.");
        System.out.println();

        Iterator<Question> iq = quiz.getQuestions().iterator();
        int i = 1;
        while (iq.hasNext()) {
            Question q = iq.next();
            System.out.println( i + ". " + q.getText() + ":");
            i++;

            List<Answer> answers = q.getAnswers();
            char letter = 'a';
            for (Answer answer : answers) {
                System.out.println(letter + ". " + answer.getText());
                answersResults.put(letter, answer);
                letter++;
            }

            String userAnswer = InputScanner.scanChars(q.isSingleAnswer(), answersResults.keySet());

            boolean answerIsCorrect = true;
            for(Character ch: answersResults.keySet()) {
                if (
                        answersResults.get(ch).isCorrect() && !userAnswer.contains(ch.toString())
                    || !answersResults.get(ch).isCorrect() && userAnswer.contains(ch.toString())
                    )
                {
                    answerIsCorrect = false;
                    break;
                }
            }
 /*           for (int j = 0; j <  answersResults.keySet().size() ; j++) {
                answerIsCorrect = answersResults.get(userAnswer.toCharArray()[j]).isCorrect();
                if(!answerIsCorrect) break;
            }
*/
            if(answerIsCorrect) {
                this.correctAnswers++;
            }

            System.out.println();
        }

        System.out.println("You had " + this.correctAnswers + " from " + this.quiz.getQuestions().size() + " answers correct");
        this.quiz.setFinished(true);
    }


}