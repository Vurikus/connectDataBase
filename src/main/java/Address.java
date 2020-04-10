public class Address
{
    //Field
    private static int ID = 1;
    private int idAddress;
    private String country;
    private String city;

    //Constructor

    public Address(String country, String city) {
        setIdAddress();
        this.country = country;
        this.city = city;
    }

    //Function
    private int setIdAddress (){
        idAddress = ID;
        ID ++;
        return idAddress;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
