public class LMSData{
    public static void main(String[] args)
    {

        // Student Entities for LMS 

        int StudentID=10;
        String studentName = "Elsa";
        byte studentAge = 25;
        String StudentGener = "f";
        float studentRating = 4.5f;
        boolean isInstructor = false;
        String CourseName = "Java";
        Short CourseID = 105;

        
        System.out.println("Student ID is " + StudentID);
        System.out.println("StudentName is " + studentName);
        System.out.println("Student Age is " + studentAge);
        System.out.println("Student Rating is " + studentRating);
        System.out.println("Student Gender is " + StudentGener);
        System.out.println("Student is a Instructor " + isInstructor);
        System.out.println("Student is enrolled in " + CourseName);
        System.out.println("Course ID of student enrolled is " + CourseID);
        
        System.out.println("-----------------------------");

        //Course Entities for LMS
        String courseName = "Java";
        Short courseID = 113;
        String courseInstructor = "Ravi";
        byte courseEnrolled = 15;
        float courseRating = 4.5f;
        int courseQuiz = 5;
        int courseTracking = 65;

        System.out.println("Course ID is " + courseID);
        System.out.println("Course Name is " + courseName);
        System.out.println("Course Instructor is " + courseInstructor);
        System.out.println("Number of people enrolled in course  is " + courseEnrolled);
        System.out.println("Course Rating is " + courseRating);
        System.out.println("Number of quizes in this course are " + courseQuiz);
        System.out.println("Course is almost " + courseTracking + " percent  done");
        

         System.out.println("-----------------------------");

        //Instructor Entities for LMS
        
        String instructorName = "Taylor Swift";
        Short instructorID = 13;
        byte instructorAge = 25;
        String instructorGender = "Female";
        float instructorRating = 4.5f;
        String instructorEmail = "swifties.chicago@gmail.com";
        long instructorNumber = 1234567;
        String instructorTaught = "Communication Skills";

        System.out.println("Instructor ID is " + instructorID);
        System.out.println("Instructor Name is " + instructorName);
        System.out.println("Instructor Gender is " + instructorGender);
        System.out.println("Instructor Age is " + instructorAge);
        System.out.println("Instructor Rating is " + instructorRating);
        System.out.println("Instructor Email is " + instructorEmail);
        System.out.println("Instructor Contact Number is " + instructorNumber);
        System.out.println("Instructor Will Teach " + instructorTaught + " course");
    }
    
}
