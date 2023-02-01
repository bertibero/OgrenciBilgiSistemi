public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Beraat Hoca","MAT","+905522977122");
        Teacher t2 = new Teacher("Mahmut Hoca","TURK","+903505556366");
        Teacher t3 = new Teacher("Özlem Hoca", "COG","+901235693358");

        Course mat = new Course("Matematik","101","MAT");
        Course turk = new Course("Türkçe","102","TURK");
        Course cograf = new Course("Coğrafya","103","COG");

        mat.addTeacher(t1);
        turk.addTeacher(t2);
        cograf.addTeacher(t3);

        Student s1 = new Student("Alex De Souza",10,"1548979231",mat,cograf,turk);
        s1.addBulkExamNote(50,80,45);
        s1.addBulkQuizNote(90,10,25);
        s1.addBulkQuizEffect(10,5,50);
        s1.isPass();

        Student s2 = new Student("Muhammed", 7,"5647873424",mat,cograf,turk );
        s2.addBulkExamNote(10,65,65);
        s2.addBulkQuizNote(15,90,50);
        s2.addBulkQuizEffect(10,6,15);
        s2.isPass();

    }
}