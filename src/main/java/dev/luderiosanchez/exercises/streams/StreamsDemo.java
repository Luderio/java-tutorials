package dev.luderiosanchez.exercises.streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Dr. Stone", 50),
                new Movie("Wistoria", 80),
                new Movie("Bon Apettite, your Majesty", 80),
                new Movie("Teach you a Lesson", 100)
        );

        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 100)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
