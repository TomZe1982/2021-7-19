package model;


    public class Student {
       private String sirName = "Busch";
       private String firstName ="Wilhelm";
       private int matrNr = 1234567;

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

    }


