public class FarmVille {
    public static void main(String[] args) {
     Farm farm = new Farm();
        System.out.println("Tomato plant has been added to farm.");
        System.out.println("Carrot plant has been added to farm");

     TomatoPlant tomatoPlant = new TomatoPlant("Tomato",3,true,4);
     CarrotPlant carrotPlant = new CarrotPlant("Carrot",5,true,3);

     farm.addPlant(tomatoPlant);
     farm.addPlant(carrotPlant);

     for(int day = 1; day<=5; day++){
         System.out.println("Day" + day + ":");
         farm.simulateDay();
     }
    }
}
