// Fig. 5.9: GradeBook.java
// GradeBook class uses switch statement to count A, B, C, D and F grades.
import java.util.Scanner; // program uses class Scanner

public class GradeBook 
{
   private String courseName; // name of course this GradeBook represents
   private int total; // sum of grades
   private int gradeCounter; // number of grades entered
   // create private attribute aCount
   // create private attribute bCount
   // create private attribute cCount
   // create private attribute dCount
   private int fCount; // count of F grades
   
   // write constructor with parameter course name

   // write setter and getter for course name

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // getCourseName gets the name of the course
      System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
         getCourseName() );
   } // end method displayMessage

   // input arbitrary number of grades from user
   public void inputGrades()
   {
      Scanner input = new Scanner( System.in );

      int grade; // grade entered by user

      System.out.printf( "%s\n%s\n   %s\n   %s\n", 
         "Enter the integer grades in the range 0-100.", 
         "Type the end-of-file indicator to terminate input:", 
         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
         "On Windows type <ctrl> z then press Enter" );

      // write while loop until user enters the end-of-file indicator      
	  
   } // end method inputGrades

   // add 1 to appropriate counter for specified grade
   public void incrementLetterGradeCounter( int grade )
   {
      // determine which grade was entered
      switch ( grade / 10 )
      {  
         // write cases for switch

         default: // grade was less than 60
            ++fCount; // increment fCount    
            break; // optional; will exit switch anyway
      } // end switch
   } // end method incrementLetterGradeCounter

   // display a report based on the grades entered by user 
   public void displayGradeReport()
   {
      System.out.println( "\nGrade Report:" );

      // if user entered at least one grade...
      if ( gradeCounter != 0 ) 
      {
         // calculate average of all grades entered
         double average = (double) total / gradeCounter;  

         // output summary of results
         System.out.printf( "Total of the %d grades entered is %d\n", 
            gradeCounter, total );
         System.out.printf( "Class average is %.2f\n", average );
         System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
            "Number of students who received each grade:", 
            "A: ", aCount,   // display number of A grades
            "B: ", bCount,   // display number of B grades
            "C: ", cCount,   // display number of C grades 
            "D: ", dCount,   // display number of D grades
            "F: ", fCount ); // display number of F grades
      } // end if
      else // no grades were entered, so output appropriate message
         System.out.println( "No grades were entered" );
   } // end method displayGradeReport
} // end class GradeBook