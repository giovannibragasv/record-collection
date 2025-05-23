import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecordCollection newCollection = new RecordCollection();

        Artist pinkFloyd = new Artist("Progressive Rock", "United Kingdom", 1965, "Pink Floyd");
        Artist beatles = new Artist("Rock", "United Kingdom", 1960, "The Beatles");
        Artist radiohead = new Artist("Alternative Rock", "United Kingdom", 1985, "Radiohead");
        Artist carSeatHeadrest = new Artist("Indie Rock", "United States of America", 2010, "Car Seat Headrest");

        Record r1 = new VinylRecord("Meddle", pinkFloyd, 1971, 530.00, "33⅓", "12\"");
        Record r2 = new VinylRecord("Ummagumma", pinkFloyd, 1969, 330.00, "33⅓", "12\"");
        Record r3 = new CDRecord("Abbey Road", beatles, 1969, 270.00, true, "Deluxe");
        Record r4 = new CDRecord("A Moon Shaped Pool", radiohead, 2016, 330.00, false, "Standard");
        Record r5 = new DigitalRecord("Kid A", radiohead, 2000, 340.00, "FLAC", 450.5);
        Record r6 = new CDRecord("In Rainbows", radiohead, 2007, 350.00, true, "Special Edition");
        Record r7 = new DigitalRecord("Twin Fantasy", carSeatHeadrest, 2018, 300.00, "MP3 320kbps", 125.8);

        newCollection.addRecord(r1);
        newCollection.addRecord(r2);
        newCollection.addRecord(r3);
        newCollection.addRecord(r4);
        newCollection.addRecord(r5);
        newCollection.addRecord(r6);
        newCollection.addRecord(r7);

        newCollection.printRecords();
        newCollection.printStatistics();

        newCollection.printShippingCosts();

        newCollection.printStorageRecommendations();

        newCollection.printDurabilityAnalysis();

        System.out.println("\n=== BUSCA POR FORMATO ===");
        List<Record> vinylRecords = newCollection.getByFormat("Vinil");
        System.out.println("Discos de vinil encontrados:");
        for (Record record : vinylRecords) {
            System.out.println("  " + record);
        }

        System.out.println("\n=== TESTE DE REMOÇÃO ===");
        newCollection.removeRecord(3);

        System.out.println("\n=== COLEÇÃO ATUALIZADA ===");
        newCollection.printRecords();
        newCollection.printStatistics();
    }
}
