package review8;

public class Hospital {
    public static void main(String[] args) {
       Doctor doc= new Doctor("John", "Doe");
       doc.printInfo();
       Doctor doc2=new Doctor("Jane", "Smit", "Cardiologist");
       doc2.printInfo();  // public
        doc2.treat(); // protected
        doc2.prescribeMedicine("antibiotics"); // defoult

    }
}