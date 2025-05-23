import java.util.ArrayList;
import java.util.List;

class RecordCollection {
    private List<Record> records;

    public RecordCollection() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
        System.out.println("Disco " + record.getTitle() + " (" + record.getFormat() + ") adicionado com sucesso.");
    }

    public boolean removeRecord(int id) {
        for (Record record : this.records) {
            if (record.getId() == id) {
                this.records.remove(record);
                System.out.println("Disco " + record.getTitle() + " removido com sucesso.");
                return true;
            }
        }
        System.out.println("Disco não encontrado.");
        return false;
    }

    public List<Record> getByTitle(String title) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getTitle().equalsIgnoreCase(title)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    public List<Record> getByArtist(String artistName) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getArtist().getName().equalsIgnoreCase(artistName)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    public List<Record> getByFormat(String format) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getFormat().equalsIgnoreCase(format)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    public void printShippingCosts() {
        System.out.println("\n=== CUSTOS DE ENVIO ===");
        double totalShippingCost = 0;

        for (Record record : this.records) {
            double cost = record.calculateShippingCost();
            totalShippingCost += cost;

            System.out.printf("%s - %s: R$ %.2f%n",
                    record.getTitle(), record.getFormat(), cost);
        }

        System.out.printf("Custo total de envio: R$ %.2f%n", totalShippingCost);
    }

    public void printStorageRecommendations() {
        System.out.println("\n=== RECOMENDAÇÕES DE ARMAZENAMENTO ===");

        for (Record record : this.records) {
            System.out.println(record.getFormat() + " - " + record.getTitle() + ":");
            System.out.println("  " + record.getStorageRecommendation());
            System.out.println();
        }
    }

    public void printDurabilityAnalysis() {
        System.out.println("\n=== ANÁLISE DE DURABILIDADE ===");

        for (Record record : this.records) {
            double rating = record.getDurabilityRating();
            String category = rating >= 9.0 ? "Excelente" :
                    rating >= 8.0 ? "Muito Boa" :
                            rating >= 7.0 ? "Boa" : "Regular";

            System.out.printf("%s (%s): %.1f/10 - %s%n",
                    record.getTitle(), record.getFormat(), rating, category);
        }
    }

    public void printRecords() {
        if (this.records.isEmpty()) {
            System.out.println("Nenhum disco encontrado.");
            return;
        }

        System.out.println("\n=== COLEÇÃO DE DISCOS ===");
        for (Record record : this.records) {
            System.out.println(record);
        }
    }

    public void printStatistics() {
        System.out.println("\n=== ESTATÍSTICAS DA COLEÇÃO ===");
        System.out.println("Total de discos: " + this.records.size());

        if (this.records.isEmpty()) {
            return;
        }

        double totalValue = 0;
        int vinylCount = 0, cdCount = 0, digitalCount = 0;

        for (Record record : this.records) {
            totalValue += record.getPrice();

            switch (record.getFormat()) {
                case "Vinil":
                    vinylCount++;
                    break;
                case "CD":
                    cdCount++;
                    break;
                case "Digital":
                    digitalCount++;
                    break;
            }
        }

        System.out.printf("Valor total da coleção: R$ %.2f%n", totalValue);
        System.out.printf("Valor médio por disco: R$ %.2f%n", totalValue / records.size());
        System.out.println("Distribuição por formato:");
        System.out.println("  Vinil: " + vinylCount);
        System.out.println("  CD: " + cdCount);
        System.out.println("  Digital: " + digitalCount);
    }

    public List<Record> getRecords() {
        return new ArrayList<>(records);
    }

    public int getSize() {
        return records.size();
    }
}
