public class Ex11_02 {
     public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.brand = "Apple";
        p1.model = "iPhone 13";
        p1.storage = 128;
        p1.price = 999;
        p1.color = "Black";

        Phone p2 = new Phone();
        p2.brand = "Samsung";
        p2.model = "Galaxy S22";
        p2.storage = 256;
        p2.price = 850;
        p2.color = "White";

        Phone p3 = new Phone();
        p3.brand = "Xiaomi";
        p3.model = "Mi 11";
        p3.storage = 128;
        p3.price = 600;
        p3.color = "Blue";

        Phone[] phones = {p1, p2, p3};

        for (int i = 0; i < phones.length; i++) {
            System.out.println("Brand: " + phones[i].brand);
            System.out.println("Model: " + phones[i].model);
            System.out.println("Storage: " + phones[i].storage);
            System.out.println("Price: " + phones[i].price);
            System.out.println("Color: " + phones[i].color);
            System.out.println();
        }
    }
}
class Phone {

    String brand;
    String model;
    int storage;
    double price;
    String color;
}