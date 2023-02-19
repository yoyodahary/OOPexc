public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public void changeSeason() {
        if(season == Season.WINTER){
            season = Season.SPRING;
        }else if(season == Season.SPRING){
            season = Season.SUMMER;
        }else if(season == Season.SUMMER){
            season = Season.FALL;
        }else if(season == Season.FALL){
            season = Season.WINTER;
        }
    }
    @Override
    public int compareTo(Object o) {
        // TODO: Implement.
        return 0;
    }
}

