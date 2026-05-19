package dev.luderiosanchez.exercises.quizConsoleApp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.Scanner;

public class QuestionService {
    private final QuestionSource questions;

    public QuestionService(QuestionSource questions) {
        this.questions = questions;
    }

    public void playQuiz() throws IOException {
        System.out.println("The Quiz has started");
        System.out.println("------------------------------------------\n");
        System.out.println("Instructions: Select the letter of the correct answer! \n");

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        final int CHANCES = 3;

        Question[] questionItems = questions.loadQuestions();
        QuestionUtils.shuffle(questionItems);


        for(Question question : questionItems) {
            boolean next = false;
            int count = 0;
            while (!next && count < CHANCES) {
                System.out.println(question.toString());
                System.out.print("Your answer: ");
                String answer = String.valueOf(scanner.nextLine().trim().charAt(0)).toLowerCase();
                if (String.valueOf(question.getAnswer().toLowerCase().charAt(0)).equals(answer)) {
                    System.out.println(question.getAnswer() + " is correct!");
                    System.out.println("---------------------------------------------------------");
                    score++;
                    next = true;
                } else {
                    System.out.println("Your answer is incorrect");
                    System.out.println("--------------------------------------------------------- \n");
                    count++;
                }

                if (count == 3) {
                    System.out.println("You incorrectly answered the question 3 times. Moving on to the next question");
                    System.out.println("---------------------------------------------------------\n");
                    break;
                }
            }
        }

        System.out.println("Quiz is done, You answered " + score + " questions correctly out of " + questionItems.length + " questions");
    }


}
