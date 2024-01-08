package fop.w11shop;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        BookShop shop = new BookShop();
        shop.addBooksInStore(7500);

        Customer peter = new Customer("Peter", shop);
        Customer paul = new Customer("Pauls", shop);

        Thread t1 =  new Thread(paul);
        Thread t2 =  new Thread(peter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();





        shop.printSummary();
        peter.printSummary();
        paul.printSummary();
    }
}
