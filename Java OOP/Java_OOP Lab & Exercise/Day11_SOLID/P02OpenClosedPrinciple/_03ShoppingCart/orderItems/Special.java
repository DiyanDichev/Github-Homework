package Day11_SOLID.P02OpenClosedPrinciple._03ShoppingCart.orderItems;

public class Special extends OrderItem {
    @Override
    public double getItemPrice(){
        return this.getQuantity() * 4.0;
    }
}
