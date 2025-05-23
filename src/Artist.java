import java.util.Date;

public class Artist {
    private String name;
    private String genre;
    private String country;
    private Date formationDate;

    public Artist(String genre, String country, Date formationDate, String name) {
        this.genre = genre;
        this.country = country;
        this.formationDate = formationDate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Date formationDate) {
        this.formationDate = formationDate;
    }

    @Override
    public String toString() {
        return "Artista: " + name + ", " + "País: " + country + ", " + "Data de Formação: " + formationDate;
    }
}
