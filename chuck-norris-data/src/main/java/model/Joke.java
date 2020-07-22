package model;

public class Joke extends BaseEntity{

    private String jokeContent;

    public Joke(String content){
        this.jokeContent = content;
    }

    public String getJokeContent() {
        return jokeContent;
    }
}
