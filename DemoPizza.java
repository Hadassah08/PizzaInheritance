import javax.swing.*;
public class DemoPizza{
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null, "How many toppings do you want on your pizza");
        boolean done=false;
        int numToppings=1;
        while(!done) {
            try {
                numToppings = Integer.parseInt(input);
                if(numToppings>10) throw new Exception();
                done=true;
            } catch (Exception e) {
                input = JOptionPane.showInputDialog(null, "How many toppings, please enter an interger less than 10");
            }
        }
        String[] toppings = new String[numToppings];
        for(int i=0; i<numToppings; i++){
            toppings[i] = JOptionPane.showInputDialog(null, "Topping: "+(i+1));
        }

        int ynChoice = JOptionPane.showConfirmDialog(null, "Would you like your pizza delivered");
        System.out.println(ynChoice);

        String[] ttOpt = {"Thin Crust", "Thick Crust"};
        int ttChoice = JOptionPane.showOptionDialog(null, "What type of crust", "Crust choice", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ttOpt, ttOpt[0]);

        String address;
        if(ynChoice == 0){
            address = JOptionPane.showInputDialog(null, "What is the address for delivery");
            DeliveryPizza dp = new DeliveryPizza(toppings, address, numToppings, ttOpt[ttChoice].equals("ThinCrust"));
            JOptionPane.showMessageDialog(null, dp);
        }//delivery
        else{
            Pizza p = new Pizza(toppings, numToppings, ttOpt[ttChoice].equals("Thin Crust"));
            JOptionPane.showMessageDialog(null, p);
        }//pickup
    }
}