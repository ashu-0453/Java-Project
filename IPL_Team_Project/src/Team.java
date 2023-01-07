import java.util.Scanner;

public class Team {
    private String teamName,ceo;
    private Player[] players;
    private  int playercounter;

    public Team() {
        players=new Player[20];
        playercounter=0;
    }

    public Team(String teamName, String ceo, Player[] players, int playercounter) {
        this.teamName = teamName;
        this.ceo = ceo;
        this.players = players;
        this.playercounter = playercounter;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getPlayercounter() {
        return playercounter;
    }

    public void setPlayercounter(int playercounter) {
        this.playercounter = playercounter;
    }

    public void addPlayer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1-> Batsman 2-> Bowler 3-> Wicket Keeper");
        System.out.println("Enter choice: ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                players[playercounter]=new Batsman();
                players[playercounter].read();
                break;
            case 2:
                players[playercounter]=new Bowler();
                players[playercounter].read();
                break;
            case 3:
                players[playercounter]=new WicketKeeper();
                players[playercounter].read();
        }
        playercounter++;

    }
    public  void display(){
        System.out.println("Team Name: "+teamName);
        System.out.println("CEO: "+ceo);
        for (int i = 0; i <playercounter ; i++) {
            System.out.println(players[i]);
        }
    }

}
