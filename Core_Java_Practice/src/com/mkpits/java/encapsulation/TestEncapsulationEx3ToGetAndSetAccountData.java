//Java program to demonstrate Encapsulation.
//Example of encapsulation that has only four fields with its setter and getter methods.

//A Java class to test the encapsulated class Account.
public class TestEncapsulationEx3ToGetAndSetAccountData {
    public static void main(String[] args) {
        //creating instance of Account class
        EncapsulationEx3ToGetAndSetAccountData acc = new EncapsulationEx3ToGetAndSetAccountData();
        //setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("Mayuri Dhole");
        acc.setEmail("mayuridhole@mk.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
