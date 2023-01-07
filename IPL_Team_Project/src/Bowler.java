import java.util.Scanner;

public class Bowler extends Batsman{
    private int overs;
    private int wkts;

    public Bowler() {
    }

    public Bowler(int playerId, String playerName, int runs, int hundreds, int fifties, int overs, int wkts) {
        super(playerId, playerName, runs, hundreds, fifties);
        this.overs = overs;
        this.wkts = wkts;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getWkts() {
        return wkts;
    }

    public void setWkts(int wkts) {
        this.wkts = wkts;
    }

    public  void read(){
        super.read();
        System.out.println("Enter overs  and wickets: ");
        Scanner sc=new Scanner(System.in);
        overs=sc.nextInt();
        wkts=sc.nextInt();

    }

    @Override
    public String toString() {
        return super.toString()+"Bowler{" +
                "overs=" + overs +
                ", wkts=" + wkts +
                '}';
    }
}
