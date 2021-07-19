package model;


import java.util.Objects;

public class Student {
       private String sirName;
       private String firstName;
       private int matrNr;

       public Student(String sirName, String firstName, int matrNr){
        setFirstName(firstName);
        setSirName(sirName);
        setMatrNr(matrNr);

       }


        public String getSirName(){
            return sirName;
        }

        public void setSirName(String sirName){
            this.sirName = sirName;
        }

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String sirName){
            this.firstName = sirName;
        }

        public int getMatrNr(){
            return matrNr;
        }

        public void setMatrNr(int matrNr){
            this.matrNr = matrNr;
        }

        public String toString(){
           String studentString = firstName + " " + sirName + " " + matrNr;
           return studentString;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr && Objects.equals(sirName, student.sirName) && Objects.equals(firstName, student.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sirName, firstName, matrNr);
    }
}


