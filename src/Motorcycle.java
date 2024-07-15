 public class Motorcycle extends Vehicle{
        // bu baş sınıf yani super class olan vehicleden üretildiği için bu subclasstır.
        public Motorcycle(String make, int speed , int maxSpeed){
            super(make, speed, maxSpeed);
        }
        //Hız arttırma
        public void speedUp(){
            super.speedUp(10);
        }
        //Hız azaltma
        public void speedDown(){
            super.speedDown(10);
        }
        //Ön teker kaldırma
        void frontLift(){
            System.out.println(make + " marka motosiklet ön tekeri kaldırınca devrildi!");
            //speed superclass içerisinde private tanımlandığı için speed = 0 şeklinde erişilemez.
            setSpeed(0);
            //Motosiklet devrilince hız 0 a düştü
        }
    }

