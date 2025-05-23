public class Record {
    private static int autoincrement = 1;
    private int id;
    private String title;
    private Artist artist;
    private int releaseYear;
    private String format;
    private double price;

    public Record(int id, String title, Artist artist, int releaseYear, String format, double price) {
        this.id = autoincrement++;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.format = format;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID" + id + " | " + title + " por " + artist + ", lançado em " + releaseYear + " no formato " + format;
    }
}
