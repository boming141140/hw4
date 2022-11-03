public class Address {
    private String name, city, zipCode;
    private int numOfStreet;
    public Address(){
        name = "";
        numOfStreet = 0;
        city = "";
        zipCode = "";
    }

    public Address(String name, int numOfStreet, String city, String zipCode) {
        this.name = name;
        this.numOfStreet = numOfStreet;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getNumOfStreet() {
        return numOfStreet;
    }

    public void setNumOfStreet(int numOfStreet) {
        this.numOfStreet = numOfStreet;
    }

    public void printAddress() {
        System.out.printf("Name: %s\n Number of street: %d\n city: %s\n zipCode: %s",name, numOfStreet, city, zipCode);
    }

    public boolean isEqualAddress(Address obj) {
        return name.equals(obj.getName()) && numOfStreet == obj.getNumOfStreet() && city.equals(obj.name) && zipCode.equals(obj.getZipCode());
    }


}
