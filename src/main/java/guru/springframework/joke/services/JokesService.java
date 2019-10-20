package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {
    public String getJoke() {
        var x = new ChuckNorrisQuotes();
        return x.getRandomQuote();
    }
}
