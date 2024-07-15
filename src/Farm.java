import java.util.ArrayList;
import java.util.List;
public class Farm {
    public Farm() {
        this.plants = new ArrayList<>();
    }
    private List<Plant> plants;

    public void addPlant (Plant plant){
        plants.add(plant);
    }
    public void simulateDay(){
        System.out.println("Simulating a day on the farm...");
        for(Plant plant: plants){
            plant.water();
            plant.grow();
            plant.harvest();
        }
        System.out.println();
    }
}