public class Player extends Person
{
    private String role;
    private String number;

    //costruttore(parametri di ingresso di player + parametri di ingresso di person perchè sono ereditati)
    public Player(String role, String number,String name, String surname, String address, String fiscalCode)
    {
        super(name,surname,address,fiscalCode); //richiamo il costruttore della classe padre person)
        this.role = role;
        this.number = number;
    }

    public String getRole()
    {
        return role;
    }

    @Override
    public String toString()
    {
        return "\nName: "+getName()+"\nSurname: "+getSurname()+"\nAddress: "+getAddress()+"\nFiscal Code: "+getFiscalCode()+"\nRole: "+role+"\nNumber of shirt: "+number;
    }
}
