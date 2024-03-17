package Day11_SOLID.P02OpenClosedPrinciple._03ShoppingCart;

public class OnlineOrder extends Order {

    protected OnlineOrder(Cart cart) {
        super(cart);
    }
}
