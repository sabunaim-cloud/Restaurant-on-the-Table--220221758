public class Entertainment {
    private int contentID;
    private String type; // Book, Game
    private String title;

    public Entertainment(int contentID, String type, String title) {
        this.contentID = contentID;
        this.type = type;
        this.title = title;
    }

    public void loadContent() {
        System.out.println("Loading content: " + title);
    }

    public void startGame() {
        if(type.equals("Game")) {
            System.out.println("Starting game: " + title);
        }
    }

    public void readBook() {
        if(type.equals("Book")) {
            System.out.println("Reading book: " + title);
        }
    }
}
