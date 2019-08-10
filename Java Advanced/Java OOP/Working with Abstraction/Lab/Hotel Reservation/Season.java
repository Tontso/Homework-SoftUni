public enum Season {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);


    private int multiplier;

    Season(int muultiplier) {
        this.multiplier = muultiplier;
    }

    public int getMultiplier() {
        return this.multiplier;
    }
}
