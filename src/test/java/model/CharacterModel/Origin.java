package model.CharacterModel;

public class Origin {

        public String name;
        public String url;

        /**
         * No args constructor for use in serialization
         *
         */
        public Origin() {
        }

        /**
         *
         * @param name
         * @param url
         */
        public Origin(String name, String url) {
                super();
                this.name = name;
                this.url = url;
        }

}
