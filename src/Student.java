import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Ron";
        String studentLastName = "Heichman";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
        String bioString = "Student " + studentFirstInitial + studentLastInitial + "'s age is " + studentAge + " and their GPA is " + studentGPA;
        String attendanceString = "";
        if (hasPerfectAttendance) {
            attendanceString = " and they have perfect attendance";
        } else {
            attendanceString = " and they do not have perfect attendance";
        }
        System.out.print(bioString + attendanceString + "\n");
        Scanner input = new Scanner(System.in);
        String stuff = input.nextLine();
        System.out.print(stuff);

    }
}
