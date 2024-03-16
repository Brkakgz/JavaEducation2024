package TeamHomeWork;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private String name;
    private List<T> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addPlayer(T player) {
        members.add(player);
        System.out.println(player.getName() + " added to team " + name);
    }


    public void listPlayers() {
        System.out.println("Players of team " + name + ":");
        for (T player : members) {
            System.out.println("- " + player.getName());

        }
        System.out.println("**********");
    }
    public void setMembers(List<T> members) {
        this.members = members;
    }

    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Galip");
        FootballPlayer footballPlayer2 = new FootballPlayer("Eray");
        FootballPlayer footballPlayer3 = new FootballPlayer("Burak");


        BasketballPlayer basketballPlayer = new BasketballPlayer("Hasan");
        BasketballPlayer basketballPlayer2= new BasketballPlayer("Kadir");
        BasketballPlayer basketballPlayer3 = new BasketballPlayer("Demir");

        VoleybolPlayer voleybolPlayer = new VoleybolPlayer("Adnan");
        VoleybolPlayer voleybolPlayer2 = new VoleybolPlayer("Necla");
        VoleybolPlayer voleybolPlayer3 = new VoleybolPlayer("Yaren");

        ePlayer ePlayer=new ePlayer("Murat");
        ePlayer ePlayer1=new ePlayer("Ali");
        ePlayer ePlayer2=new ePlayer("Veli");

        Team<FootballPlayer> footballPlayerTeam = new Team<>("Team A");
        footballPlayerTeam.addPlayer(footballPlayer);
        footballPlayerTeam.addPlayer(footballPlayer2);
        footballPlayerTeam.addPlayer(footballPlayer3);
        footballPlayerTeam.listPlayers();

        Team<BasketballPlayer> basketballPlayerTeam =new Team<>("Team B");
        basketballPlayerTeam.addPlayer(basketballPlayer);
        basketballPlayerTeam.addPlayer(basketballPlayer2);
        basketballPlayerTeam.addPlayer(basketballPlayer3);
        basketballPlayerTeam.listPlayers();

        Team<VoleybolPlayer> voleybolPlayerTeam = new Team<>("Team C");
        voleybolPlayerTeam.addPlayer(voleybolPlayer);
        voleybolPlayerTeam.addPlayer(voleybolPlayer2);
        voleybolPlayerTeam.addPlayer(voleybolPlayer3);
        voleybolPlayerTeam.listPlayers();

        Team<ePlayer> ePlayerTeam = new Team<>("Team D");
        ePlayerTeam.addPlayer(ePlayer);
        ePlayerTeam.addPlayer(ePlayer1);
        ePlayerTeam.addPlayer(ePlayer2);
        ePlayerTeam.listPlayers();



    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }
}

class BasketballPlayer extends Player {
    public BasketballPlayer(String name) {
        super(name);
    }
}
class VoleybolPlayer extends Player
{
    public VoleybolPlayer(String name){
        super(name);
    }
}
class ePlayer extends Player
{
    public ePlayer(String name){
        super(name);
    }
}