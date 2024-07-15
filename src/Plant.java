public abstract class Plant implements IPlantActions {
    private String name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant(String name, int growthTime,boolean isHarvestable) {
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvestable = false;
    }
    public abstract void harvest();
    public abstract void grow();
    public abstract void water();


    public boolean isHarvestable(){
        return isHarvestable;
    }

    public void setHarvestable(boolean harvestable) {
        isHarvestable = harvestable;
    }

    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public String getName() {
        return name;
    }

    public int getGrowthTime() {
        return growthTime;
    }

}
