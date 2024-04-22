import java.util.ArrayList;
import java.util.List;

public class LoadData {

    public static ArrayList<Quiz> loadQuizzes() {
        ArrayList<Quiz> quizzes = new ArrayList<>();

        //First quiz
        Answer a11 = new Answer("Amazon River", true);
        Answer a12 = new Answer("Nile River", false);
        Answer a13 = new Answer("Mississippi", false);
        Answer a14 = new Answer("Svratka", false);

        Question q11 = new Question("Which is the longest river in the world?",
                List.of(a11, a12, a13, a14));

        Answer b11 = new Answer("Solar Energy", true);
        Answer b12 = new Answer("Wind Energy", true);
        Answer b13 = new Answer("River Energy", true);
        Answer b14 = new Answer("Coal Energy", false);

        Question q12 = new Question("Which of the following are renewable resources?",
                List.of(b11, b12, b13, b14));

        Answer c11 = new Answer("Slovak Republic", false);
        Answer c12 = new Answer("Hungary", false);
        Answer c13 = new Answer("Czech Republic", true);

        Question q13 = new Question("Prague is the capital of which country?", List.of(c11, c12, c13));

        Quiz quiz = new Quiz("General Knowledge Quiz", "A quiz covering various topics.", List.of(q11, q12, q13));


        //Second quiz
        Answer a21 = new Answer("Sahara", true);
        Answer a22 = new Answer("Arabian Desert", false);
        Answer a23 = new Answer("Gobi", false);
        Answer a24 = new Answer("Antarctic Desert", true);

        Question q21 = new Question("Which of the following are considered the largest deserts in the world?", List.of(a21, a22, a23, a24));

        Answer b21 = new Answer("Tokyo", true);
        Answer b22 = new Answer("Delhi", false);
        Answer b23 = new Answer("Shanghai", false);
        Answer b24 = new Answer("New York", false);

        Question q22 = new Question("Which is the most populous city in the world?", List.of(b21, b22, b23, b24));


        Answer d21 = new Answer("Mariana Trench", true);
        Answer d22 = new Answer("Tonga Trench", false);
        Answer d23 = new Answer("Java Trench", false);
        Answer d24 = new Answer("Kuril-Kamchatka Trench", false);

        Question q24 = new Question("Which is the deepest oceanic trench in the world?", List.of(d21, d22, d23, d24));

        Answer e21 = new Answer("Arctic Ocean", false);
        Answer e22 = new Answer("Pacific Ocean", true);
        Answer e23 = new Answer("Atlantic Ocean", true);
        Answer e24 = new Answer("Indian Ocean", true);


        Question q25 = new Question("Which of the following oceans are known for their warm waters?", List.of(e21, e22, e23, e24));

        Quiz quiz2 = new Quiz("Geographic Wonder", "A Global Exploration Quiz", List.of(q21, q22, q24, q25));


        //third quiz
        Answer a31 = new Answer("The Printing Press", true);
        Answer a32 = new Answer("The Internet", true);
        Answer a33 = new Answer("Electric Light Bulb", true);
        Answer a34 = new Answer("Steam Engine", true);

        Question q31 = new Question("Which of the following inventions significantly changed human history?", List.of(a31, a32, a33, a34));


        Answer b31 = new Answer("Christopher Columbus", true);
        Answer b32 = new Answer("Leif Erikson", true);
        Answer b33 = new Answer("Marco Polo", false);
        Answer b34 = new Answer("Ferdinand Magellan", false);

        Question q32 = new Question("Who were explorers associated with the discovery of America?", List.of(b31, b32, b33, b34));

        Answer c31 = new Answer("Battle of Waterloo", true);
        Answer c32 = new Answer("Battle of Hastings", false);
        Answer c33 = new Answer("Battle of the Bulge", false);
        Answer c34 = new Answer("Battle of Stalingrad", false);

        Question q33 = new Question("Which battle marked the defeat of Napoleon Bonaparte?", List.of(c31, c32, c33, c34));

        Answer d31 = new Answer("Apollo 11", true);
        Answer d32 = new Answer("Apollo 13", false);
        Answer d33 = new Answer("Apollo 17", false);
        Answer d34 = new Answer("Apollo 8", false);

        Question q34 = new Question("Which Apollo mission was the first to land humans on the Moon?", List.of(d31, d32, d33, d34));

        Answer e31 = new Answer("Salyut", false);
        Answer e32 = new Answer("ISS", false);
        Answer e33 = new Answer("Skylab", false);
        Answer e34 = new Answer("Tiangong", false);
        Answer e35 = new Answer("Mir", true);

        Question q35 = new Question("Which space station was the first modular space station operated by the Soviet Union and later by Russia, continuously inhabited for nearly 15 years before being decommissioned?", List.of(e31, e32, e33, e34, e35));

        Quiz quiz3 = new Quiz("Historical Insights", "Skills from the historical events of mankind", List.of(q31, q32, q33, q34, q35));


        quizzes.add(quiz);
        quizzes.add(quiz2);
        quizzes.add(quiz3);

        return quizzes;
    }

}
