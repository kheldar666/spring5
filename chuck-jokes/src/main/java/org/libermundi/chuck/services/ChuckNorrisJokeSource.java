package org.libermundi.chuck.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeSource implements JokeSource {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeSource() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
