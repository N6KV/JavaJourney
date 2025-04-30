import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthDate = null;
        LocalDate today = LocalDate.now();

        while (birthDate == null || birthDate.isAfter(today)) {
            try {
                System.out.print("Please enter the year of birth (YYYY): ");
                int year = scanner.nextInt();

                System.out.print("Please enter the month of birth (1-12): ");
                int month = scanner.nextInt();

                System.out.print("Please enter the day of birth (1-31): ");
                int day = scanner.nextInt();

                birthDate = LocalDate.of(year, month, day);

                if (birthDate.isAfter(today)) {
                    Period untilBirth = Period.between(today, birthDate);
                    System.out.println("❌ You haven't been born yet, please try again in " + untilBirth.getYears() + " years ;)");
                    birthDate = null;
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid date, please type in a correct date.");
                scanner.nextLine();
            }
        }

        Period age = Period.between(birthDate, today);
        System.out.println("🎂 You are " + age.getYears() + " years, " + age.getMonths() + " months and " + age.getDays() + " days old!");
    }
}
