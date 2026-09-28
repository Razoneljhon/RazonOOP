/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinalactivity;

/**
 *
 * @author Complab 3
 */
public class ProductInformation {

    String productId;
    String productName;
    String category;
    double price;
    int quantity;

    public ProductInformation(String productId, String productName,
                              String category, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public String getStockStatus() {
        if (quantity == 0) {
            return "Out of Stock";
        } else if (quantity <= 10) {
            return "Low Stock";
        } else {
            return "Normal Stock";
        }
    }

    public void displayProduct() {
        System.out.println("===== PRODUCT INFORMATION =====");
        System.out.println();
        System.out.println("Product ID: " + productId);
        System.out.println();
        System.out.println("Product Name: " + productName);
        System.out.println();
        System.out.println("Category: " + category);
        System.out.println();
        System.out.printf("Price: ₱%.2f%n", price);
        System.out.println();
        System.out.println("Quantity: " + quantity);
        System.out.println();
        System.out.printf("Inventory Value: ₱%.2f%n", getInventoryValue());
        System.out.println();
        System.out.println("Stock Status: " + getStockStatus());
    }

    public static void main(String[] args) {

        ProductInformation product = new ProductInformation(
            "P-1001",
            "Wireless Mouse",
            "Computer Accessories",
            850.00,
            25
        );

        product.displayProduct();
    }
}
