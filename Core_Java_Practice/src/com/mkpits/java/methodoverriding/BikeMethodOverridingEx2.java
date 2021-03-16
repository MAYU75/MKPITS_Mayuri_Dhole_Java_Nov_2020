//Java Program to illustrate the use of Java Method Overriding

//Creating a parent class.
class VehicleMethodOverridingEx2 {
    //defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Creating a child class
class BikeMethodOverridingEx2 extends VehicleMethodOverridingEx2 {
    //defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        BikeMethodOverridingEx2 obj = new BikeMethodOverridingEx2();//creating object
        obj.run();//calling method
    }
}
