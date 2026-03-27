class Category {
    String name;
    String description;

    Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

class Product {
    String id;
    String name;
    double price;
    String brand;
    int stock;
    Category category;

    Product(String id, String name, double price, String brand, int stock, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.stock = stock;
        this.category = category;
    }

    void display() {
        System.out.println(id + " | " + name + " | $" + price +
                " | " + brand + " | Stock: " + stock +
                " | Category: " + category.name);
    }
}

public class Ex8_1 {
    public static void main(String[] args) {
        Category c1 = new Category("Smartphone", "Mobile devices");
        Category c2 = new Category("Accessory", "Phone accessories");

        Product p1 = new Product("P01", "iPhone 14", 999, "Apple", 10, c1);
        Product p2 = new Product("P02", "Samsung S23", 850, "Samsung", 8, c1);
        Product p3 = new Product("P03", "AirPods", 199, "Apple", 15, c2);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            p.display();
        }
    }
}