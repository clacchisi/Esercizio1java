import java.util.Scanner;
import java.util.ArrayList;

public class Test1
{
    public static void main(String[] args)
    {
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Player> foundedPlayers = new ArrayList<>();
        int menuChoise;

        do {

            System.out.println("---Menu---");
            System.out.println("1. Insert new Team");
            System.out.println("2. Insert new player");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Role");
            System.out.println("0. Exit\n>");

            Scanner scanIn = new Scanner(System.in).useDelimiter("\n"); //useDelimiter("\n") evita il blocco inserendo uno spazio
            menuChoise = scanIn.nextInt();

            switch (menuChoise)
            {
                case 1:
                     {
                        System.out.println("Insert name of Team");
                        String name = scanIn.next();
                        System.out.println("Insert date of Foundation");
                        String dateOfFoundation = scanIn.next();
                        Team team = new Team(name, dateOfFoundation);
                        teams.add(team);
                        System.out.println("\nTeam added succesfully!\n");
                        break;
                     }
                case 2:
                     {
                         System.out.println(teams.toString());
                         System.out.print("\nType Team's Name you want to insert a New Player?\n>");
                         String nameTeam = scanIn.next();

                         for(int i=0;i<teams.size();i++)
                         {
                             if(teams.get(i).getName().equals(nameTeam))
                             {
                                 System.out.println("Insert Name ");
                                 String name = scanIn.next();
                                 System.out.println("Insert Surname ");
                                 String surname = scanIn.next();
                                 System.out.println("Insert Fiscal Code ");
                                 String fiscalCode = scanIn.next();
                                 System.out.println("Insert Address ");
                                 String address = scanIn.next();
                                 System.out.println("Insert Role ");
                                 String role = scanIn.next();
                                 System.out.println("Insert T-Shirt Number ");

                                 /*ho preferito usare String al posto di int per il numero
                                     //modificando ovvimente anche il parametro di ingresso del costruttore
                                     in modo da prevenire il blocco del programma*/
                                 String number= scanIn.next();
                                 Player player = new Player(role,number,name,surname,address,fiscalCode);
                                 teams.get(i).addPlayer(player);
                                 System.out.println("\nPlayer added succesfully\n");
                             }

                         }
                         break;
                     }
                 case 3:
                      {



                         System.out.println(teams.toString()); //visualizza i Team già inseriti
                         System.out.println("Choose witch Team?");
                         String nameTeam = scanIn.next();

                         for (int i=0; i<teams.size(); i++)
                            {
                                if(teams.get(i).getName().equals(nameTeam))
                                    {
                                        System.out.println("Insert Name of player");
                                        String namePlayer= scanIn.next();
                                        foundedPlayers = teams.get(i).findPlayerByName(namePlayer);
                                        System.out.println("Found: " + foundedPlayers.toString());
                                        break;

                                    }
                            }

                        break;

                     }
                case 4:
                     {

                        System.out.println(teams.toString());
                        System.out.println("Choose witch Team?");
                        String nameTeam = scanIn.next();

                        for (int i=0; i<teams.size(); i++)
                        {
                            if(teams.get(i).getName().equals(nameTeam))
                            {
                                System.out.println("Insert Role of player");
                                String rolePlayer= scanIn.next();
                                foundedPlayers = teams.get(i).findPlayerByrole(rolePlayer);
                                System.out.println("Found: " + foundedPlayers.toString());
                            }

                        }
                        break;
                    }
                default:
                    System.out.println("Good bye!");
            }

        }while ( menuChoise > 0 ) ;

    }
}
