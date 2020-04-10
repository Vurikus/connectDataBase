public class Person
{
    //Field
    private static int ID = 1;
    private int idPerson;
    private String name;
    private String surname;
    private int age;
    private Address address;

    //Constructor

    public Person(String name, String surname, int age, Address address) {
        setIdPerson();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    //Function
    private int setIdPerson (){
        idPerson = ID;
        ID ++;
        return idPerson;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
