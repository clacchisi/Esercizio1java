import java.util.ArrayList;

public class Team
{
    private String name;
    private String dateOfFoundation;
    private int numberOfPlayer;
    private ArrayList<Player> players; //è un ArrayList di tipo classe Player( <Player> ) --- players è il nome dell'arrayList

    //costruttore del Team
    public Team(String name, String dateOfFoundation)
    {
        this.name = name;
        this.dateOfFoundation = dateOfFoundation;
        this.numberOfPlayer = 0;
        this.players = new ArrayList<>();// creo un nuovo Arraylist e lo assegno all'arrayList di nome players
    }

    public String getName() {
        return name;
    }

    public String getDateOfFoundation() {return dateOfFoundation;}

    //metodo per aggiungere un player (parametro in ingresso variabile di appoggio player di tipo classe Player
    public void addPlayer(Player player)
    {
        players.add(player);
        this.numberOfPlayer++;
    }


    public ArrayList<Player> findPlayerByName(String name)
    {
        ArrayList<Player> foundPlayer = new ArrayList<>();

        //ciclo e condizione per recuperare i giocatori con le caratteristiche corrispondenti
        for (int i = 0; i < this.numberOfPlayer; i++)
        {
            if (players.get(i).getName().equals(name))   //    (prende il nome di indice i.getName() ).equals(name)
                foundPlayer.add(players.get(i));
        }
        return foundPlayer;
    }

    public ArrayList<Player> findPlayerByrole(String role)
    {
        ArrayList<Player> foundPlayer = new ArrayList<>();

        for (int i = 0; i < this.numberOfPlayer; i++) {
            if (players.get(i).getRole().equals(role))   //    (prende il nome di indice i.getName() ).equals(name)
                foundPlayer.add(players.get(i));

        }
        return foundPlayer;
    }



    @Override
    public String toString()
    {
        return "Name: "+getName()+" - "+getDateOfFoundation()+" ";  // mi serve per visualizzare Nome Team e Anno prima dell'inserimento
    }





}
