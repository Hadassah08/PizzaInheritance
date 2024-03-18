public class Pizza{
    String[] toppings;
    double price;

    public Pizza(String[] toppings, int numToppings, boolean isThinCrust){
        numToppings = 10;
        if (numToppings > 10) {
            System.out.println("Error. Maximum number of toppings is 10, please input 10 toppings."); //throws error if topppings more thgan 10
            return;
        }

        this.toppings = toppings;
        this.price = 14 + (2 * numToppings);
    }

    //format for toppings and price description
    public String toString(){
        if (toppings == null || toppings.length == 0) {
            return "No toppings";
        }

        StringBuilder description = new StringBuilder();
        for (int i = 0; i < toppings.length; i++){
            description.append(toppings[i]);
            if (i < toppings.length - 1) {
                description.append(", ");
            }
        }

        return "Toppings: " + description.toString() + "\nPrice: $" + price;
    }



}