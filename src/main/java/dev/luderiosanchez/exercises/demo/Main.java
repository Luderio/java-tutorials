package dev.luderiosanchez.exercises.demo;


public class Main {
    private static final ConsoleLog log = new ConsoleLog();


    public static void main(String[] args) {
      var textBox = new TextBox();
      textBox.setText("hello chezzy");
      System.out.println(textBox.toUpperCase());
      System.out.println(textBox.clear());
    }
}
