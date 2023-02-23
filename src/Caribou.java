public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, null);
        if (super.getSeason() == Season.WINTER) {
            this.color = Color.WHITE;
        } else if (super.getSeason() == Season.SPRING) {
            this.color = Color.BROWN;
        } else if (super.getSeason() == Season.SUMMER) {
            this.color = Color.BROWN;
        } else if (super.getSeason() == Season.FALL) {
            this.color = Color.BROWN;
        }
    }

    /**
     * Returns a string representation of this object.
     *
     * @return a string representation of this object.
     */
    @Override
    public String toString() {
        String desc = "Caribou: ";
        if (super.getSeason() == Season.WINTER) {
            desc += "I am migrating south. ";
        } else if (super.getSeason() == Season.SUMMER) {
            desc += "I am migrating north. ";
        }

        return desc + super.toString();

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
        } else if (super.getSeason() == Season.SPRING) {
            this.color = Color.BROWN;
        }


    }

}