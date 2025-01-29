package order_system;
public class Order {
    private String itemName;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private String paymentMethod;

    public Order(String itemName, int quantity, double unitPrice, String paymentMethod) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = quantity * unitPrice;
        this.paymentMethod = paymentMethod;
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
