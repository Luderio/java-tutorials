package dev.luderiosanchez.exercises.quizConsoleApp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class QuestionsFromJSON implements QuestionSource{

    @Override
    public Question[] loadQuestions() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream input = getClass().getResourceAsStream("/questionnaire.json");
        return mapper.readValue(input, Question[].class);
    }
}
