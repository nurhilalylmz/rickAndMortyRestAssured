package model.CharacterModel;

import java.util.List;

public class AllCharacter {

    public Info info;
    public List<Character> results = null;

    /**
     * No args constructor for use in serialization
     */
    public AllCharacter() {
    }

    /**
     * @param results
     * @param info
     */
    public AllCharacter(Info info, List<Character> results) {
        super();
        this.info = info;
        this.results = results;
    }
}
