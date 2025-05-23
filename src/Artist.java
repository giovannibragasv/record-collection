class Artist {
    private String name;
    private String genre;
    private String country;
    private int foundationYear;

    public Artist(String genre, String country, int foundationYear, String name) {
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.foundationYear = foundationYear;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
    public String getCountry() { return country; }
    public int getFoundationYear() { return foundationYear; }

    @Override
    public String toString() {
        return name + " (" + genre + ", " + country + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return name.equals(artist.name);
    }
}
