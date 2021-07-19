import Student.Student;
import kotlin.NoWhenBranchMatchedException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("SirName")
    public void checkForSirName(){
        //Given
        Student student = new Student();
        student.setSirName("Schumacher");
        //When
        String actual = student.getSirName();
        //Then
        assertEquals("Schumacher", actual);

    }

    @Test
    @DisplayName("FirstName")
    public void checkForFirstName(){
        //Given
        Student student = new Student();
        student.setFirstName("Michael");
        //When
        String actual = student.getFirstName();
        //Then
        assertEquals("Michael", actual);

    }

    @Test
    @DisplayName("MatrNr")
    public void checkForMatrNr(){
        //Given
        Student student = new Student();
        student.setMatrNr(1234567);
        //When
        int actual = student.getMatrNr();
        //Then
        assertEquals(1234567, actual);

    }



}