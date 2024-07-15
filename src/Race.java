  public class Race {
        public static void main(String[] args) {
            Vehicle tesla = new Automobile("TESLA",0,200);
            Vehicle togg = new Automobile("TOGG",0,200);
            Vehicle yamaha = new Motorcycle("YAMAHA",0,180);


            Vehicle[] raceCars = new Vehicle[3];
            //döngü ile array içinde geziyorum
            raceCars[0] = tesla;
            raceCars[1] = togg;
            raceCars[2] = yamaha;

            //pist uzunluğu
            int runwayLength = 1000;
            //örnek olarak 1000 birimlik yarış uzunluğu belirledik

            //yarış devam ediyor mu?
            boolean isRaceContuniue = true;
            //while ın içindeki değeri tutsun
            Vehicle winner = null;

            while (isRaceContuniue){
                for(Vehicle vehicle: raceCars){
                    int randomSpeetAmount = (int)(Math.random()*30)+1;
                    //1 ile 30 arasında rastgele hızlanma değeri
                    vehicle.speedUp(randomSpeetAmount);
                    vehicle.showSpeed();
                    // aracın kat ettiği mesafe pisti geçerse yarışı bitir
                    if(vehicle.getDistance()>=runwayLength){
                        winner = vehicle;
                        isRaceContuniue = false;
                        break;
                    }
                }
                System.out.println("-------------");
            }
            //Kazanan araç otomobilse korna çalsın
            //instanceof operatörü bir objenin belirli bir sınıfa ait olup olmadığını kontrol eder

            if(winner instanceof Automobile){
                ((Automobile)winner).hornSound();
            }
            //Kazanan araç motosikletse ön tekeri kaldırıp devrildi
            if(winner instanceof Motorcycle){
                ((Motorcycle)winner).frontLift();
            }
            System.out.println("Kazanan araç: " + winner.make);
        }
    }


