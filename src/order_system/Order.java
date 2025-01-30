package order_system;
public class Order {
    private String itemName;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private String paymentMethod;

    public Order(String itemName, int quantity, double unitPrice, double totalPrice) {
    this.itemName = itemName;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.totalPrice = totalPrice; // Note: Normally, totalPrice should be calculated from quantity * unitPrice
    this.paymentMethod = "Not specified"; // Default value if paymentMethod isn't provided
}


    // Getters
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getTotalPrice() { return totalPrice; }
    public String getPaymentMethod() { return paymentMethod; }

    // Display order as a string
    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Unit Price: " + unitPrice +
               ", Total Price: " + totalPrice + ", Payment: " + paymentMethod;
    }
}
