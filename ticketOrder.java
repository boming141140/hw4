import java.util.ArrayList;
import java.util.Scanner;

public class ticketOrder {
    private String name;
    private Address address;
    private int numberOfTicket;

    public ticketOrder() {
        name = "";
        address = new Address();
        numberOfTicket = 0;
    }

    public ticketOrder(String name, Address address, int numberOfTicket) {
        this.name = name;
        this.address = address;
        this.numberOfTicket = numberOfTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public void PrintTicketOrder() {
        System.out.printf("Name: %s\n",name);
        address.printAddress();
        System.out.printf("Number of Tickets: %d\n",numberOfTicket);
    }

    public boolean isEqualTicket(ticketOrder obj) {
        return name.equals(obj.getName()) && address.isEqualAddress(obj.getAddress());
    }

    public static void main(String []args) {
        String name,nameS, city, zipCode, numOfTicket, numberOfStreet;
        ArrayList<ticketOrder> ticketStore = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name:");
        name = input.nextLine();
        System.out.println("Enter an address, address name:");
        nameS = input.nextLine();
        System.out.println("Enter the numberOfStreet:");
        numberOfStreet = input.nextLine();
        System.out.println("Enter city name:");
        city = input.nextLine();
        System.out.println("Enter the zipCode:");
        zipCode = input.nextLine();
        System.out.println("Enter numOfTicket:");
        numOfTicket = input.nextLine();
    }
}
