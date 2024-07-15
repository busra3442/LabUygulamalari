public class CarrotPlant extends Plant {
    private int waterLevel;

    public CarrotPlant(String name, int growthTime, boolean isHarvestable,int waterLevel) {
        super(name, growthTime, isHarvestable);
        this.waterLevel = 0;
    }

    @Override
    public void harvest(){
       if(isHarvestable()){
           System.out.println("Carrot plant harvested!");
       }else{
           System.out.println("Carrot plan is not ready for harvest.");
       }
    }
    @Override
    public void grow() {
        if (waterLevel >= getGrowthTime()) {
            boolean setHarvestable = true;
            System.out.println("Carrot plant has grown and is ready for harvest!");
        }
    }
    @Override
    public void water(){
        waterLevel++;
        System.out.println("Carrot plant is growing. Growth time: " + getGrowthTime() );
    }
}
