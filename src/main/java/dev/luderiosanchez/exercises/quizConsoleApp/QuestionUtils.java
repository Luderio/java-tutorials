package dev.luderiosanchez.exercises.quizConsoleApp;

import java.util.Arrays;
import java.util.Collections;

public class QuestionUtils {
    public static void shuffle(Question[] questions) {
        if (questions == null || questions.length == 0) return;
        Collections.shuffle(Arrays.asList(questions));
    }
}
