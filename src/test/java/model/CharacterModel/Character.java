package model.CharacterModel;

import java.util.List;

public class Character {

    public Integer id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public Origin origin;
    public Location location;
    public String image;
    public List<String> episode = null;
    public String url;
    public String created;

    public Character() {
    }

    /**
     * @param image
     * @param gender
     * @param species
     * @param created
     * @param origin
     * @param name
     * @param location
     * @param episode
     * @param id
     * @param type
     * @param url
     * @param status
     */
    public Character(Integer id, String name, String status, String species, String type, String gender, Origin origin, Location location, String image, List<String> episode, String url, String created) {
        super();
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = origin;
        this.location = location;
        this.image = image;
        this.episode = episode;
        this.url = url;
        this.created = created;
    }

}


