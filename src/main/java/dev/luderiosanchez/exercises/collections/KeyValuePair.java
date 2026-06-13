package dev.luderiosanchez.exercises.collections;

public class KeyValuePair <Key, Value>{
    private Key key;
    private Value value;

    public KeyValuePair(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.println("{ " + key + ": " + value + " }");
    }
}
