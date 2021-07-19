package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("SirName")
    public void checkForSirName(){
        //Given
        Student student = new Student("Schumacher", "Michael", 1234567);
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
        Student student = new Student("Schumacher", "Michael", 1234567);
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
        Student student = new Student("Schumacher", "Michael", 1234567);
        student.setMatrNr(1234567);
        //When
        int actual = student.getMatrNr();
        //Then
        assertEquals(1234567, actual);

    }

    @Test
    @DisplayName("StringTest")
    public void checkToStringTest(){
        //Given
        Student student = new Student("Schuhmacher", "Michael", 1234567);


        //When
        String acutal = student.toString();

        //Then
        assertEquals("Michael Schuhmacher 1234567",acutal);

    }



}