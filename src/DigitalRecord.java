class DigitalRecord extends Record {
    private String audioQuality;
    private double fileSizeMB;

    public DigitalRecord(String title, Artist artist, int releaseYear, double price, String audioQuality, double fileSizeMB) {
        super(title, artist, releaseYear, price);
        this.audioQuality = audioQuality;
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getFormat() {
        return "Digital";
    }

    @Override
    public double getDurabilityRating() {
        return 10.0;
    }

    @Override
    public double calculateShippingCost() {
        return 0.0;
    }

    @Override
    public String getFormatDetails() {
        return audioQuality + " (" + fileSizeMB + " MB)";
    }

    @Override
    public String getStorageRecommendation() {
        return "Fazer backup regular em múltiplas mídias";
    }

    public String getAudioQuality() {
        return audioQuality;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
