import java.util.Scanner;

public abstract class Player {
    private int playerId;
    private String playerName;

    public Player() {
    }

    public Player(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void read(){
        System.out.println("Enter Player Id and Name: ");
        Scanner sc=new Scanner(System.in);
        playerId=sc.nextInt();
        playerName=sc.next();
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
