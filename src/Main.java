import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String bandname = "Velvet Collapse";
        int fans = 8500;
        int maxFans = 15000;
        int fameLvl = 2;
        int xp = 3200;
        double money = 4750.50;
        boolean isActive = true;
        char genre = 'R';
        String[] tracks = {"Within", "Enough", "No sense", "Battlescars"};

        System.out.println("=== BAND PROFILE ===");
        System.out.println("Name: " + bandname);
        System.out.println("Genre: " + genre);
        System.out.println("Fame Level: " + fameLvl);
        System.out.println("Fans: " + fans);
        System.out.println("XP: " + xp);
        System.out.println("Money: " + money);
        System.out.println("Active: " + isActive);
        System.out.println("Repertoire (" + tracks.length + " songs ):");
        System.out.println("- " + tracks[0]);
        System.out.println("- " + tracks[1]);
        System.out.println("- " + tracks[2]);
        System.out.println("- " + tracks[3]);


    }
}
