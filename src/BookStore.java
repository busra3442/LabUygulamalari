import java.util.ArrayList;
public class BookStore {
    public static void main(String[] args) {
        Book[] books = {//book classının tipinde array oluşturuyorum çünkü onun içindeki parametreleri görmem lazım
                //böylece bütün yükü tek bir classa yüklemiyorum
                new Book("Clean Code", "Robert C. Martin", 2008, 600),
                new Book("Effective Java", "Joshua Bloch", 2017, 1200)
        };
        //ovverloading farklı parametrelerle sınıfın farklı özelliklerine sahip nesneler oluşturur(new)ile
        //değişkenler private
        //metotlar public
        System.out.println("\n Kitaplar sisteme başarıyla eklendi!");

        Customer[] customers = {
                new Customer("Gökhan Azizoğlu", "gazizoglu@cumhuriyet.edu.tr", 2000),
                new Customer("Tayfur Bingöl","tayfur75@gmail.com",4000)
        };

        System.out.println("\n Müşteriler sisteme başarıyla eklendi!");

        double balance = 0;
        String email = "gazizoglu@cumhuriyet.edu.tr";
        Customer foundCustomer = null;
        for(Customer c : customers){
            if(c.getEmail().equals(email)){
                foundCustomer = c;
                break;
            }
        }
        if(foundCustomer==null){
            throw new IllegalArgumentException("Müşteri bulunamadı");
        }
        String bookName = "Clean Code";
        Book foundBook = null;
        for(Book b : books){
            if(b.getName().equals(bookName)){
                foundBook = b;
                break;
            }
        }
        if(foundBook==null){
            throw new IllegalArgumentException("Kitap bulunamadı!");
        }
        try {
            foundCustomer.buyBook(foundBook.getPrice());//foundcustomer hangi müşteri ile eşleştirdin diyor buy book satın aldırır
            System.out.println("\n Kitap başarıyla satın alındı!");
        }catch (IllegalArgumentException e){//böyle çağırılır bu bir kalıp hatamı bilmediğim için try catch kullanıyorum
            System.out.println("\n" + e.getMessage());
        }
        System.out.println("Bakiye: " + foundCustomer.getBalance());//işte get başka classtan değer getirdi

    }
}

