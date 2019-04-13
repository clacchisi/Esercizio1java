public class Person
{
    private String name;
    private String surname;
    private String address;
    private String fiscalCode;


   //costruttore (variabili  di ingresso)
    public Person(String name, String surname, String address, String fiscalCode)
    {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.fiscalCode = fiscalCode;
    }

    // getters
    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getAddress() {return address;}

    public String getFiscalCode() { return fiscalCode;}
}


