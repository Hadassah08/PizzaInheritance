public class DeliveryPizza extends Pizza{
    int deliveryFee;
    String address;

    public DeliveryPizza(String[] toppings, String address, int numToppings, boolean isThinCrust) {
        super(toppings, numToppings, isThinCrust);

        if (this.price > 18) {
            this.deliveryFee = 3;
    } else {
            this.deliveryFee = 5;
        }
        this.address = address;
        this.price=this.price+this.deliveryFee; //initializes price with delivery fee
    }

    public String toString(){
        return "The delivery to " + address + " costs: $" + this.price;
    }
}
