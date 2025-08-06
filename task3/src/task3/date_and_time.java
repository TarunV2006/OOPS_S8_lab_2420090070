
package task3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date_and_time {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			// Input format
			System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
			String input = sc.nextLine();

			// Define the expected format
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			//try {
			    // Parse input to LocalDateTime
			    LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
			    LocalDateTime now = LocalDateTime.now();
			    
			    if (eventDateTime.isBefore(now)) {
			        System.out.println("The event date/time is already past.");
			        return;
			    }

			    // Calculate the duration
			    Duration duration = Duration.between(now, eventDateTime);
			    long totalMinutes = duration.toMinutes();

			    long days = totalMinutes / (24 * 60);
			    long hours = (totalMinutes % (24 * 60)) / 60;
			    long minutes = totalMinutes % 60;

			    System.out.println("Time remaining until event:");
			    System.out.printf("\t\t%d days, %d hours, and %d minutes\n", days, hours, minutes);
			//} catch (Exception e) {
			  //  System.out.println("Invalid input format. Please enter date and time as yyyy-MM-dd HH:mm");
			//}
		}
    }
}