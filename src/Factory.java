public class Factory {
    //These variables tells people if my store is open or not
    // It also holds the three different pizza orders
    public boolean isOpen = true;
    public Pizza pizzaOrder1;
    public Pizza pizzaOrder2;
    public Pizza pizzaOrder3;
    public int randomNumber;


    //psvm creates the factory object
    public static void main(String[] args) {
        Factory a = new Factory();
}//End of the main method

        public Factory() {
            //Prints whether my store is open or not
            System.out.println("It is "+isOpen+ " that Michael's pizza store is open");

            //Generates a random number of free pizzas
            randomNumber = (int)(Math.random()*8)+1;
            System.out.println("We just got "+randomNumber+ " free pizzas");


            //Creates three different kinds of pizzas
            pizzaOrder1=new Pizza("Cheese");
            pizzaOrder2=new Pizza("Pepperoni");
            pizzaOrder3=new Pizza("Meat Lovers");

            //Eats one slice, cools down the first pizza, and then prints the info
            pizzaOrder1.ateSlices();
            pizzaOrder1.coolDown();
            pizzaOrder1.printInfo();

            //Eats one slice, cools down the second pizza, and then prints the info
            pizzaOrder2.ateSlices();
            pizzaOrder2.coolDown();
            pizzaOrder2.printInfo();

            //Eats one slice, cools down the third pizza, and then prints the info
            pizzaOrder3.ateSlices();
            pizzaOrder3.coolDown();
            pizzaOrder3.printInfo();

        }//End of Factory constructor




}//End of Factory class
