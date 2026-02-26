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
        char genre = 'R'; //‘R’ (Rock), ‘E’ (Electronic), ‘H’ (HipHop), ‘P’ (Pop)
        String[] tracks = {"Within", "Enough", "No sense", "Battlescars"};
        String[] status = {"Unknown - Playing in garages", "Local Hero - Small venues await", "Rising Star - Festival invitations coming in", "Mainstream - Arena tours possible", "Superstar - Stadium glory!"};

        int venueCapacity = 500;
        int venueAttendance = 420;
        int venueAttendanceP = (venueAttendance * 100) /venueCapacity;

        System.out.println("=== BAND PROFILE ===");
        System.out.println("Name: " + bandname);
        System.out.println("Genre: " + genre);
        System.out.println("Fame Level: " + fameLvl);
        System.out.println("Fans: " + fans);
        System.out.println("XP: " + xp);
        System.out.println("Money: " + money);
        System.out.println("Active: " + isActive);
        System.out.println("Status: " + status[fameLvl - 1]);
        System.out.println("Repertoire (" + tracks.length + " songs ):");
        for(String track : tracks){
            System.out.println(" - " + track);
        }

        System.out.println("\n=== STATUS CHECK ===");
        if(xp < 2000 * fameLvl){
            System.out.println("Ready to level up!");
        }
        if(genre == 'R'){
            if(fans <= 0){
                System.out.println("The band has broken up...");
            }else if(fans < maxFans * 0.25){
                System.out.println("Warning: Losing relevance! Consider a comeback strategy.");
            }
        }else if(genre == 'E'){
            if(fans <= 0){
                System.out.println("The band is not so electrifying anymore...");
            }else if(fans < maxFans * 0.25){
                System.out.println("Warning: Losing relevance! Get back at it asap.");
            }
        }else if(genre == 'H'){
            if(fans <= 0){
                System.out.println("There is no long any Hip to the Hop...");
            }else if(fans < maxFans * 0.25){
                System.out.println("Warning: Your crowds is leaving, get hip again.");
            }
        }else if(genre == 'P'){
            if(fans <= 0){
                System.out.println("You lost the popularity contest, its over");
            }else if(fans < maxFans * 0.25){
                System.out.println("Warning: Noone is singing along, you need to do something fast.");
            }
        }else{
            System.out.println("Wait... what kind of band is this?");
        }

        System.out.println("\n=== GIG NIGHT ===");
        System.out.println("Playing at venue (capacity: " + venueCapacity + ")");
        System.out.println("Attendance: " + venueAttendance + " (" + venueAttendanceP + "%)");
        int fansBefore = fans; // gem gammel værdi
        if(venueAttendanceP > 80){
            fans +=200;
            System.out.println("Great turnout!");
            System.out.println("Fans: " + fansBefore + " -> " + fans);
        } else{
            fans += 50;
            System.out.println("Not the best turnout.");
            System.out.println("Fans: " + fansBefore + " -> " + fans);
        }
        double moneyBefore = money;
        money =+ 1500;
        System.out.println("Money: $" + moneyBefore + " -> $" + money);

        System.out.println("\n=== RANDOM EVENT ===");
        int eventType = 1; //1-3
        if(eventType == 1){
            System.out.println("Great review in local music blog!");
            fans += 500;
            System.out.println("Fans: " + fansBefore + " -> " + fans);
        } else if (eventType == 2) {
            System.out.println("Quiet week. Nothing happens.");
        } else if (eventType == 3){
            System.out.println("Scandal!");
            fans -= 300;
            System.out.println("Fans: " + fansBefore + " -> " + fans);
        }



        /*

        */

    }
}
