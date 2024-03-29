package Day11_SOLID.P02OpenClosedPrinciple._03ShoppingCart.orderItems;

public abstract class OrderItem {
    private String barcode;

    private int quantity;

    public abstract double getItemPrice();

    public String getSku() {
        return this.barcode;
    }

    public void setSku(String sku) {
        this.barcode = sku;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
