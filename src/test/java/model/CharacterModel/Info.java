package model.CharacterModel;

public class Info {

    public Integer count;
    public Integer pages;
    public String next;
    public Object prev;

    /**
     * No args constructor for use in serialization
     */
    public Info() {
    }

    /**
     * @param next
     * @param pages
     * @param prev
     * @param count
     */
    public Info(Integer count, Integer pages, String next, Object prev) {
        super();
        this.count = count;
        this.pages = pages;
        this.next = next;
        this.prev = prev;
    }
}
