import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDetails {
    public static void main(String[] args) {
        String dobStr = "2000-01-01"; // Example date of birth in YYYY-MM-DD format
        
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date dob = formatter.parse(dobStr);
            Date now = new Date();
            
            long diffInMillies = Math.abs(now.getTime() - dob.getTime());
            long age = diffInMillies / (1000L * 60 * 60 * 24 * 365);
            
            System.out.println("Name: John Doe"); // Hardcoded name
            System.out.println("Age: " + age + " years");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD or DD-MM-YYYY.");
        }
    }
}
