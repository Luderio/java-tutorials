package dev.luderiosanchez.exercises.streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Teach you a Lesson", 100),
                new Movie("Dr. Stone", 50),
                new Movie("Wistoria", 80)
        );

        var count = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println(count);
    }
}
