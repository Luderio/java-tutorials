package dev.luderiosanchez.exercises.demo;

public class TextBox extends UIControl{
    private String text;

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    public String toUpperCase() {
        return text.toUpperCase();
    }

    public String toLowerCase() {
        return text.toLowerCase();
    }

    public String clear() {
        return text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
