public class Bear extends Animal {
    private boolean isAsleep;
    Bear(int weight, Season season) {
        // TODO: Implement.
        super(weight,season,Color.BROWN);
        this.isAsleep = false;
    }
    @Override
    public String toString() {
        return "Bear. " + super.toString();

    }
    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
        if (super.getSeason() == Season.WINTER) {
            super.weight = (int) Math.round(0.8*super.weight);
            isAsleep = true;
        } else if (super.getSeason() == Season.SPRING) {
            this.weight = (int) Math.round(0.75*super.weight);
            isAsleep = false;
        } else if (super.getSeason() == Season.SUMMER) {
            this.weight = (int) Math.round((4/3)*super.weight);
        } else if (super.getSeason() == Season.FALL) {
            this.weight = (int) Math.round(1.25*super.weight);
        }
    }
}