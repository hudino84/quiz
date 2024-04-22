import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Quiz> quizzes;

        quizzes = LoadData.loadQuizzes();

        while(!quizzes.isEmpty()) {

            System.out.println("Please, choose the quiz you want to play:");

            Quiz selectedQuiz = selectQuiz(quizzes);

            QuizRunner quizRunner = new QuizRunner(selectedQuiz);
            quizRunner.run();

            if (selectedQuiz.isFinished()) {
                quizzes.remove(selectedQuiz);
            }

            if(quizzes.isEmpty()) {
                System.out.println();
                System.out.println("All quizzes are done! Thank you for your play!");
                break;
            }

            if(!InputScanner.continuePlay()) break;
        }

    }

    public static Quiz selectQuiz(ArrayList<Quiz> quizzes) {
        ArrayList<Integer> allowedQuizzesNumber = new ArrayList<>();

        for (int i = 0; i < quizzes.size(); i++) {
            if (quizzes.get(i).isFinished()) continue;

            System.out.println((i + 1) + ". " + quizzes.get(i).getName());
            allowedQuizzesNumber.add(i + 1);
        }

        System.out.println();
        int userNumber = InputScanner.scanNumber(allowedQuizzesNumber);

        return quizzes.get(userNumber-1);
    }
}