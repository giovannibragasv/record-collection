import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecordCollection newCollection = new RecordCollection();

        Artist pinkFloyd = new Artist("Progressive Rock", "United Kingdom", 1965, "Pink Floyd");
        Artist beatles = new Artist("Rock", "United Kingdom", 1960, "The Beatles");
        Artist radiohead = new Artist("Alternative Rock", "United Kingdom", 1985, "Radiohead");
        Artist carSeatHeadrest = new Artist("Indie Rock", "United States of America", 2010, "Car Seat Headrest");

        Record r1 = new Record("Meddle", pinkFloyd, 1971, "Vinyl", 530.00);
        Record r2 = new Record("Ummagumma", pinkFloyd, 1969, "Vinyl", 330.00);
        Record r3 = new Record("Abbey Road", beatles, 1969, "Vinyl", 270.00);
        Record r4 = new Record("A Moon Shaped Pool", radiohead, 2016, "Vinyl", 330.00);
        Record r5 = new Record("Kid A", radiohead, 2000, "Vinyl", 340.00);
        Record r6 = new Record("In Rainbows", radiohead, 2007, "Vinyl", 350.00);
        Record r7 = new Record("Twin Fantasy", carSeatHeadrest, 2018, "Vinyl", 300.00);

        newCollection.addRecord(r1);
        newCollection.addRecord(r2);
        newCollection.addRecord(r3);
        newCollection.addRecord(r4);
        newCollection.addRecord(r5);
        newCollection.addRecord(r6);
        newCollection.addRecord(r7);

        System.out.println("\n");
        newCollection.printRecords();
        newCollection.printStatistics();

        System.out.println("\n");
        List<Record> beatlesRecords = newCollection.getByArtist("Pink Floyd");
        for (Record record : beatlesRecords) {
            System.out.println(record);
        }

        System.out.println("\n");
        newCollection.removeRecord(3);

        System.out.println("\n");
        newCollection.printRecords();
        newCollection.printStatistics();
    }
}