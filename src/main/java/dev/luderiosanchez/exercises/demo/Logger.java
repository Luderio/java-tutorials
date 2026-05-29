package dev.luderiosanchez.exercises.demo;

public interface Logger {
    public enum LogType {INFO, WARNING, ERROR};
    void info(String message, Object data);

    void warning(String message, Object data);

    void error(String message, Object data);
}
