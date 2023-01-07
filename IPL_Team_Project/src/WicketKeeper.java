import java.util.Scanner;

public class WicketKeeper extends Batsman{
    private  int stumps,catches;

    public WicketKeeper() {
    }

    public WicketKeeper(int playerId, String playerName, int runs, int hundreds, int fifties, int stumps, int catches) {
        super(playerId, playerName, runs, hundreds, fifties);
        this.stumps = stumps;
        this.catches = catches;
    }

    public int getStumps() {
        return stumps;
    }

    public void setStumps(int stumps) {
        this.stumps = stumps;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public void read(){
        super.read();
        System.out.println("Enter stumps and catches: ");
        Scanner sc= new Scanner(System.in);
        stumps=sc.nextInt();
        catches=sc.nextInt();

    }

    @Override
    public String toString() {
        return super.toString()+"WicketKeeper{" +
                "stumps=" + stumps +
                ", catches=" + catches +
                '}';
    }
}
