import java.util.Scanner;
public class Date1 {
        public static void main(String args[]){
            System.out.println("This is a java date program");
            Scanner in = new Scanner(System.in);
            String day,date, mon;
            int year;
            System.out.println("Enter the day");
            day = in.nextLine();
            System.out.println("Enter the date");
            date = in.nextLine();
            System.out.println("Enter the month");
            mon = in.nextLine();
            System.out.println("Enter the year");
            year = in.nextInt();
            System.out.println("The given date is "+date+" "+day+" "+mon+" "+year);
    }

}
