class CDRecord extends Record {
    private boolean isRemastered;
    private String edition;

    public CDRecord(String title, Artist artist, int releaseYear, double price, boolean isRemastered, String edition) {
        super(title, artist, releaseYear, price);
        this.isRemastered = isRemastered;
        this.edition = edition;
    }

    @Override
    public String getFormat() {
        return "CD";
    }

    @Override
    public double getDurabilityRating() {
        return 8.0;
    }

    @Override
    public double calculateShippingCost() {
        return price * 0.08;
    }

    @Override
    public String getFormatDetails() {
        return edition + (isRemastered ? " (Remasterizado)" : "");
    }

    @Override
    public String getStorageRecommendation() {
        return "Manter em estojo, longe de riscos e luz solar direta";
    }

    public boolean isRemastered() {
        return isRemastered;
    }

    public String getEdition() {
        return edition;
    }
}