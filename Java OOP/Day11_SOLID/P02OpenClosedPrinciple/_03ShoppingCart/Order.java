package Day11_SOLID.P02OpenClosedPrinciple._03ShoppingCart;

public abstract class Order {
    protected final Cart cart;

    protected Order(Cart cart) {
        this.cart = cart;
    }
    void checkout(){
        //log the order in the p03_Database
    }
}
