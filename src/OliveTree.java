public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        String desc = "Olive tree.";
        if (this.season == Season.FALL) {
            desc += " I give fruit.";
        }
        desc += super.toString();
        return desc;
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        if (this.season == Season.WINTER) {
            this.height += 5;
        } else if (this.season == Season.SPRING) {
            this.height += 10;
        } else if (this.season == Season.SUMMER) {
            this.height += 10;
        } else if (this.season == Season.FALL) {
            this.height += 5;
        }
    }
}

