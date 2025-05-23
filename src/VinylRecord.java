class VinylRecord extends Record {
    private String rpm;
    private String size;

    public VinylRecord(String title, Artist artist, int releaseYear, double price, String rpm, String size) {
        super(title, artist, releaseYear, price);
        this.rpm = rpm;
        this.size = size;
    }

    @Override
    public String getFormat() {
        return "Vinil";
    }

    @Override
    public double getDurabilityRating() {
        return 7.5;
    }

    @Override
    public double calculateShippingCost() {
        return price * 0.15;
    }

    @Override
    public String getFormatDetails() {
        return rpm + " RPM, " + size;
    }

    @Override
    public String getStorageRecommendation() {
        return "Armazenar verticalmente, longe de calor e umidade";
    }

    public String getRpm() { return rpm; }
    public String getSize() { return size; }
}
