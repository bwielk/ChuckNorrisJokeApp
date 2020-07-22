package model;

import java.util.ArrayList;
import java.util.List;

public class Jokes {

    private static List<Joke> jokes = new ArrayList<>();

    public static List<Joke> getJokes() {
        jokes.add(new Joke("Hello 1"));
        jokes.add(new Joke("Hello 2"));
        jokes.add(new Joke("Hello 3"));
        jokes.add(new Joke("Hello 4"));
        return jokes;
    }
}
