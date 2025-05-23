import java.util.ArrayList;
import java.util.List;

public class RecordCollection {
    private List<Record> records;

    public RecordCollection() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
        System.out.println("Disco " + record.getTitle() + " adicionado com sucesso.");
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
        List<Record> records = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getTitle().equals(title)) {
                records.add(record);
            }
        }
        return records;
    }

    public List<Record> getByArtist(String artist) {
        List<Record> records = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getArtist().equals(artist)) {
                records.add(record);
            }
        }
        return records;
    }

    public List<Record> getByFormat(String format) {
        List<Record> records = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getFormat().equals(format)) {
                records.add(record);
            }
        }
        return records;
    }

    public void printRecords() {
        if (this.records.isEmpty()) {
            System.out.println("Nenhum disco encontrado.");
            return;
        }

        for (Record record : this.records) {
            System.out.println(record);
        }
    }

    public void printStatistics() {
        System.out.println("Total de discos: " + this.records.size());

        if (this.records.isEmpty()) {
            System.out.println("Nenhum disco encontrado.");
            return;
        }

        double totalValue = 0;
        for (Record record : this.records) {
            totalValue += record.getPrice();
        }

        System.out.println("Valor total da coleção: " + String.format("%.2f", totalValue));
        System.out.println("Valor médio por disco: " + String.format("%.2f", totalValue / records.size()));
    }

    public List<Record> getRecords() {
        return new ArrayList<>(records);
    }

    public int getSize() {
        return records.size();
    }
}
