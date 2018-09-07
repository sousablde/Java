
public class Song {
    //only 2 fields the title and duration
    private String title;
    private double duration;

    //constructor
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    //getter for the title
    public String getTitle() {
        return title;
    }

    //Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method
    // that is already provided by one of its super-classes or parent classes.
    @Override
    public String toString() {
        //toString function only prints out the title colon and duration
        return this.title + ": " + this.duration;
    }
}
