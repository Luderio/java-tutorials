package dev.luderiosanchez.exercises.quizConsoleApp;

import java.io.IOException;

public interface QuestionSource {
    Question[] loadQuestions() throws IOException;
}
