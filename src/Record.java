abstract class Record implements Media {
    private static int autoincrement = 1;
    private int id;
    private String title;
    private Artist artist;
    private int releaseYear;
    protected double price;

    public Record(String title, Artist artist, int releaseYear, double price) {
        this.id = autoincrement++;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public abstract String getFormat();
    public abstract double getDurabilityRating();

    public int getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }
    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "ID" + id + " | " + title + " por " + artist.getName() +
                ", lançado em " + releaseYear + " (" + getFormat() + ") - " + getFormatDetails();
    }
}
