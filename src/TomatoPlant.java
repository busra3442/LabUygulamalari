public class TomatoPlant extends Plant {
    private int waterLevel;

    public TomatoPlant(String name, int growthTime, boolean isHarvestable,int waterLevel) {
        super(name, growthTime, isHarvestable);
        this.waterLevel = 0;
    }

    @Override
    public void harvest(){
      if(isHarvestable()){
          System.out.println("Tomato plant harvested!");
      }else{
          System.out.println("Tomato plant is not ready for harvest yet.");
      }
    }
    @Override
    public void grow(){
       if(waterLevel>=getGrowthTime()){
           boolean setHarvestable = true;
           System.out.println("Tomato plant has grown and is ready for harvest!");
       }
       }
    @Override
    public void water(){
       waterLevel++;
        System.out.println("Tomato plant is growing. Growth time: " + getGrowthTime() );
    }
}
