package model.CharacterModel;

public class Location {

        public String name;
        public String url;

        /**
         * No args constructor for use in serialization
         */
        public Location() {
        }

        /**
         * @param name
         * @param url
         */
        public Location(String name, String url) {
                super();
                this.name = name;
                this.url = url;
        }
}
