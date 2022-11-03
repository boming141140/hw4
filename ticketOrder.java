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

    static boolean isDigit(String inp) {
        for(int i = 0; i < inp.length(); i++) {
            if(!Character.isDigit(inp.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(String []args) {
        final int MAX_TICKET_NUM = 1;
        int count = 0;
        String name,nameS, city, zipCode, numOfTicket, numberOfStreet;
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<ticketOrder> trueTicket = new ArrayList<>();
        ArrayList<ticketOrder> ticketStore = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true) {
            if (count >= MAX_TICKET_NUM) {
                System.out.println("Maximum number of tickets have been reached.");
                break;
            }
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
            if(!isDigit(name) && !isDigit(nameS) && !isDigit(city) && isDigit(zipCode) && isDigit(numOfTicket) && isDigit(numberOfStreet)){
                int numOfS = Integer.parseInt(numberOfStreet);
                int numOfT = Integer.parseInt(numOfTicket);
                int zipCodeR = Integer.parseInt(zipCode);
                Address userAdd = new Address(nameS,numOfS,city,zipCodeR);
                ticketOrder userTick = new ticketOrder(name,userAdd,numOfT);
                ticketStore.add(userTick);
            }else{
                System.out.println("Invalid Input, Try Again.");
            }
            count++;
        }
        for (ticketOrder ticketOrder : ticketStore) {
            boolean hasName = true;
            if (!nameList.contains(ticketOrder.getName())) {
                nameList.add(ticketOrder.getName());
            } else {
                hasName = false;
            }
            if (hasName) {
                if (ticketOrder.getNumberOfTicket() < 5) {
                    trueTicket.add(ticketOrder);
                }
            }
        }
        for(ticketOrder i : trueTicket)
            i.PrintTicketOrder();
    }
}
