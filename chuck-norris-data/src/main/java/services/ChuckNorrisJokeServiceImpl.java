package services;

import model.Joke;
import model.Jokes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService{

    @Override
    public String getRandomQuote() {
        List<Joke> jokes = Jokes.getJokes();
        return jokes.get(new Random().nextInt(jokes.size())).getJokeContent();
    }
}
