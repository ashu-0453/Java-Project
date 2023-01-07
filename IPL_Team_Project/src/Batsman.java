import java.util.Scanner;

public class Batsman extends Player {
    private int runs;
    private int hundreds;
    private int fifties;

    public Batsman() {
    }

    public Batsman(int playerId, String playerName, int runs, int hundreds, int fifties) {
        super(playerId, playerName);
        this.runs = runs;
        this.hundreds = hundreds;
        this.fifties = fifties;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public void read(){
        super.read();

        System.out.println("Enter Runs , Hundreds, fifties: ");

        Scanner sc=new Scanner(System.in);
        runs=sc.nextInt();
        hundreds= sc.nextInt();
        fifties=sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+" Batsman{" +
                "Runs=" + runs +
                ", Hundreds=" + hundreds +
                ", Fifties=" + fifties +
                '}';
    }
}
