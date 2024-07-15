public class Vehicle {
        //Bu baş class yani super class
        protected String make;
        private double speed;
        protected int maxSpeed;
        private double distance;

        //constructorun içine koşul falan yazamazsın
        public Vehicle (String make,int speed,int maxSpeed,double distance){
            this.make = make;
            this.speed = speed;
            this.maxSpeed = maxSpeed;
            this.distance = distance;
        }
        //constructor overloading
        public Vehicle (String make,int speed,int maxSpeed){
            this(make,speed,maxSpeed,0);
        }
        public void speedUp(int amount){
            double oldSpeed = getSpeed();
            setSpeed (oldSpeed+amount);
            double newSpeed = getSpeed();
            double newDistance = (oldSpeed + newSpeed)/2;
            setDistance (getDistance() + newDistance);
        }
        public void speedDown(int amount){
            double oldSpeed = getSpeed();
            setSpeed (oldSpeed-amount);
            double newSpeed = getSpeed();
            double newDistance = (oldSpeed + newSpeed)/2;
            setDistance (getDistance() + newDistance);
        }
        public void showSpeed(){
            System.out.println(make + " aracın hızı: " + getSpeed() + " , " + " kat ettiği mesafe: " + getDistance());
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;//referans verdik
            if(speed<0){
                this.speed = 0;
            }
            if(speed>maxSpeed){
                this.speed = maxSpeed;
            }
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

    }

