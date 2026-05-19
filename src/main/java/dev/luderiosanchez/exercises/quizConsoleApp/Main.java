package dev.luderiosanchez.exercises.quizConsoleApp;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        QuestionService quizzesFromJSON = new QuestionService(new QuestionsFromJSON());
        quizzesFromJSON.playQuiz();
    }
}
