package Day11_SOLID.P02OpenClosedPrinciple._03ShoppingCart.orderItems;

public class Each extends OrderItem {
    @Override
    public double getItemPrice(){
        return this.getQuantity() * 5.0;
    }
}
