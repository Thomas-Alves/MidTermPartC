import java.util.Scanner;
//Thomas Alves 
//Friday june 23, 2023
//Midterm - software design/fundies 

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Profile Creation!");

        // Get user input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display available genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Available genres:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Get user input for favorite genre
        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int genreChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Validate genre choice
        if (genreChoice >= 1 && genreChoice <= genres.length) {
            String favoriteGenre = genres[genreChoice - 1];

            // Create user profile
            UserProfile userProfile = new UserProfile(name, favoriteGenre);

            // Display profile creation message
            System.out.println("User profile created successfully!");
            System.out.println("Name: " + userProfile.getUserID());
            System.out.println("Favorite Genre: " + userProfile.getGenre());
        } else {
            System.out.println("Invalid genre choice. Profile creation failed.");
        }//end of else 
    }//end of main 
}//end of class 