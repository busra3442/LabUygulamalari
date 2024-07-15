public class Automobile extends Vehicle{
        //bu baş sınıf yani super class olan vehicleden üretildiği için bu subclasstır.
        //consturctor gövdesindeki ilk ifade super olmalıdır
        //bu şekilde üst sınıfın yöntemlerine eriştik
        //üst sınıf constructor çağrısı
        public Automobile (String make, int speed, int maxSpeed){
            super (make, speed, maxSpeed);
        }
        //Hız arttırma
        public void speedUp(){
            super.speedUp(15);//üst sınıfın speedup ı
        }
        //Hız azaltma
        public void speedDown(){
            super.speedDown(15);
        }
        //Korna sesi
        public void hornSound(){
            //make özelliği protected tanımlandığı için doğrudan erişildi
            System.out.println(make + " Marka otomobilin kornası çalıyor: Düt Düt!");
        }

    }

