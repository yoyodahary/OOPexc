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

    /**
     * Returns the current season.
     * @return the current season.
     */
    protected Season getSeason() {
        return season;
    }

    /**
     * Sets the current season.
     * @return the current season.
     */
    protected void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Changes the current season to the next one.
     */
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

    /**
     * Compares this object with the specified object for order.
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        // TODO: Implement.
        try {
            Animal other = (Animal) o;
            return Integer.compare(this.weight, other.weight);
        }catch (Exception e){
            throw new ClassCastException("The object is not an Animal");
        }

    }

    /**
     * Returns a string representation of the object.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        String desc = "";
        desc += "My weight is: " + this.weight;
        desc += " and my color is: " + this.color;
        return desc;
    }
}

