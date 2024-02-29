
public class GradeBookRunner {

    public void run() {
		
        GradeBook myGradeBook = 
			new GradeBook("CS101 Introduction to Java Programming.");

        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}