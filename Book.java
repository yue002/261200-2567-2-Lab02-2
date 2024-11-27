public class Book {
    String title ;
    String author ;
    double price ;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
        // TODO: Complete the rest of this method.
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void applyDiscount (double discount){
        if(discount <= 0.0 || discount >= 100.0){
            System.out.print("Error: Invalid discount percentage.");
        }
        else{
            double discountAmount = price * (discount / 100.0);
            price -= discountAmount;
            System.out.println("Discount of " + discount + "% applied. Updated price: " + price);

        }

    }

    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();

        hp1Book.applyDiscount(-20.0);
        hp1Book.applyDiscount(0.0);
        hp1Book.applyDiscount(0.5);
        hp1Book.applyDiscount(25.0);
        hp1Book.applyDiscount(50.0);
        hp1Book.applyDiscount(100.0);
        hp1Book.applyDiscount(150.0);

    }

}
