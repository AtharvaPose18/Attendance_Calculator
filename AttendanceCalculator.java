import java.util.Scanner;
public class AttendanceCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total working days:");
        int totalDays=sc.nextInt();
        System.out.print("Enter days attended:");
        int attendedDays=sc.nextInt();
        if (totalDays<=0 || attendedDays<0 ||attendedDays>totalDays) {
            System.out.println("Invalid input!");
        } else {
            double percentage=(attendedDays*100.0)/totalDays;
            System.out.println("Attendance:"+percentage+"%");
            if (percentage>=75) {
                System.out.println("Attendance status:Eligible");
            } else {
                System.out.println("Attendance status:Not eligible");
            }
        }
        sc.close();
    }
}
