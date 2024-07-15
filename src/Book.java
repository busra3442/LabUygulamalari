    public class Book {
        private String name;//instance variable(örnek değişkeni)
        private String aouthor;
        private int publishYear;
        private double price;

        public Book(String name, String aouthor, int publishYear, double price) {
            this.name = name;//this: benim bulunduğum classın içi
            this.aouthor = aouthor;
            this.publishYear = publishYear;
            this.price = price;
        }
        //constructor overloading
        public Book(String name, String aouthor){
            this.name = name;
            this.aouthor = aouthor;
            this.price = 0;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public String getName(){
            return name;
        }
        public String getAouthor(){
            return aouthor;
        }
        public int getPublishYear(){
            return publishYear;
        }
        public double getPrice(){
            return price;
        }
    }


