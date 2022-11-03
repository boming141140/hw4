public class Address {
    private String name, city;
    int zipCode;
    private int numOfStreet;
    public Address(){
        name = "";
        numOfStreet = 0;
        city = "";
        zipCode = 0;
    }

    public Address(String name, int numOfStreet, String city, int zipCode) {
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getNumOfStreet() {
        return numOfStreet;
    }

    public void setNumOfStreet(int numOfStreet) {
        this.numOfStreet = numOfStreet;
    }

    public void printAddress() {
        System.out.printf("Street: %s\nNumber of street: %d\ncity: %s\nzipCode: %s\n",name, numOfStreet, city, zipCode);
    }

    public boolean isEqualAddress(Address obj) {
        return name.equals(obj.getName()) && numOfStreet == obj.getNumOfStreet() && city.equals(obj.name) && zipCode == obj.getZipCode();
    }


}
