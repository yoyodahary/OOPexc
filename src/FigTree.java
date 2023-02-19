public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height, season, null);
        if (season == Season.SPRING || season == Season.SUMMER) {
            this.leavesColor = Color.GREEN;
        } else if (season == Season.FALL) {
            this.leavesColor = Color.YELLOW;
        }
    }

    @Override
    public String toString() {
        String desc = "Fig tree.";
        if (this.season == Season.SUMMER) {
            desc += "I give fruit.";
        }
        desc += super.toString();
        return desc;
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        if (this.season == Season.WINTER) {
            this.height += 20;
            this.leavesColor = null;
        } else if (this.season == Season.SPRING) {
            this.height += 30;
            this.leavesColor = Color.GREEN;
        } else if (this.season == Season.SUMMER) {
            this.height += 30;
        } else if (this.season == Season.FALL) {
            this.height += 20;
            this.leavesColor = Color.YELLOW;
        }
    }
}
