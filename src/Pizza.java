public class Pizza {
    //These are all qualities that the pizza has
    public boolean isHot;
    public String Toppings;
    public int slices;
    public int eat;

    public Pizza(String pizzaTopping){
        //Sets the toppings using a parameter
        Toppings= pizzaTopping;
        //Sets the number of slices randomly
        slices= (int)(Math.random()*8)+1;
        isHot = true;
    }//End of pizza constructor

    public void printInfo(){
        //This prints the toppings, if the pizza is hot or cold, and the number of slices
        System.out.println("One of them is a " + Toppings+ " pizza");
        System.out.println("This pizza has "+ slices+" slices");
        System.out.println("It is " + isHot + " that the pizza is piping hot");
        System.out.println("We have eaten " + eat + " slices in this pizza");
    }//End of printInfo method

    public void ateSlices(){
        //Subtracts one slice from the pizza because I got hungry
       eat= slices-1 ;
    }//End of ateSlices method

    public void coolDown(){
        //Changes isHot to false
        isHot = false;
    }//End of coolDown method


}//End of Pizza class
