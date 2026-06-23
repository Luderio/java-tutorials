package dev.luderiosanchez.exercises.streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Teach you a Lesson", 100),
                new Movie("Dr. Stone", 50),
                new Movie("Wistoria", 80),
                new Movie("Bon Apettite, your Majesty", 80)
        );

        movies.stream().mapToInt(Movie::getLikes).forEach(System.out::println);
    }
}
