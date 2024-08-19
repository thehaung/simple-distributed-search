package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DocumentData implements Serializable {
    private static final Map<String, Double> TERM_TO_FREQUENCY = new HashMap<>();

    public void putTermFrequency(String term, double frequency) {
        TERM_TO_FREQUENCY.put(term, frequency);
    }

    public double getFrequency(String term) {
        return TERM_TO_FREQUENCY.get(term);
    }
}
