public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;

    Tree(double height, Season season, Color leavesColor) {
        this.height = (int) Math.round(height);
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        Tree other = (Tree) o;
        return Integer.compare(this.height, other.height);
    }

    @Override
    public void changeSeason() {
        if (season == Season.WINTER) {
            season = Season.SPRING;
        } else if (season == Season.SPRING) {
            season = Season.SUMMER;
        } else if (season == Season.SUMMER) {
            season = Season.FALL;
        } else if (season == Season.FALL) {
            season = Season.WINTER;
        }
    }

    @Override
    public String toString() {
        String desc = "";
        desc += "My height is: " + this.height;
        if (leavesColor != null) {
            desc += " and my color is: " + this.leavesColor;
        } else {
            desc += " and I have no leaves";
        }
        return desc;
    }
}

