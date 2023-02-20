public class Caribou extends Animal {
    private String location;

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, null);
        if (super.getSeason() == Season.WINTER) {
            this.color = Color.WHITE;
            this.location = "South";
        } else if (super.getSeason() == Season.SPRING) {
            this.color = Color.BROWN;
            this.location = "South";
        } else if (super.getSeason() == Season.SUMMER) {
            this.color = Color.BROWN;
            this.location = "North";
        } else if (super.getSeason() == Season.FALL) {
            this.color = Color.BROWN;
            this.location = "North";
        }
    }

    /**
     * Returns a string representation of this object.
     *
     * @return a string representation of this object.
     */
    @Override
    public String toString() {
        return "Caribou: " + super.toString();

    }

    /**
     * Changes the current season to the next one.
     * Changes also the color and the location.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        if (super.getSeason() == Season.WINTER) {
            this.color = Color.WHITE;
            this.location = "South";
        } else if (super.getSeason() == Season.SPRING) {
            this.color = Color.BROWN;
        } else if (super.getSeason() == Season.SUMMER) {
            this.location = "North";
        }
    }

}