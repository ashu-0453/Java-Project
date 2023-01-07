import java.util.Scanner;

public class Tournament {
    private String tournamentName;
    private int year;
    private Team[] teams;
    private int teamCounter;

    public Tournament() {
        teams=new Team[25];
        teamCounter=0;
    }

    public Tournament(String tournamentName, int year, Team[] teams, int teamCounter) {
        this.tournamentName = tournamentName;
        this.year = year;
        this.teams = teams;
        this.teamCounter = teamCounter;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public int getTeamCounter() {
        return teamCounter;
    }

    public void setTeamCounter(int teamCounter) {
        this.teamCounter = teamCounter;
    }

    public  void addTeam(){
        Scanner sc=new Scanner(System.in);
        teams[teamCounter]=new Team();
        System.out.println("Enter Team Details: ");
        teams[teamCounter].setTeamName(sc.next());
        teams[teamCounter].setCeo(sc.next());
        System.out.println("Enter Number of players to be added in the team: ");
        int nop=sc.nextInt();
        for (int i = 0; i < nop; i++) {
            teams[teamCounter].addPlayer();

        }
        teamCounter++;
    }

    public void displayTournament(){
        System.out.println("Tournament Name: "+tournamentName);
        System.out.println("Year: "+year);
        for (int i = 0; i <teamCounter ; i++) {
            teams[i].display();
        }
    }
}
