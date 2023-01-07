import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tournament t=new Tournament();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name and Year: ");
        t.setTournamentName(sc.next());
        t.setYear(sc.nextInt());
        int choice;
        do{
            System.out.println("1. Add Team 2. Display 3. Exit.");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    t.addTeam();
                    break;
                case 2:
                    t.displayTournament();
                    break;
                case 3:
                    break;
            }
        }while(choice!=3);
    }
}
