package dev.luderiosanchez.exercises.streams;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Dr. Stone", 50),
                new Movie("Wistoria", 80),
                new Movie("Bon Apettite, your Majesty", 80),
                new Movie("Teach you a Lesson", 100),
                new Movie("World War II: From the Front Lines", 40)
        );

        var result = movies.stream().anyMatch(movie -> movie.getLikes() < 100);
        System.out.println(result);
    }
}
