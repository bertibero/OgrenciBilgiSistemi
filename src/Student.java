public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course turk;
    Course cograf;
    double avarage;
    boolean isPass;

    Student (String name, int classes, String stuNo, Course mat, Course turk, Course cograf){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.turk = turk;
        this.cograf = cograf;
        calcAvarage();
        this.isPass = false;
    }
    void addBulkExamNote(int mat, int turk, int cograf){
        if(mat >= 0 && mat <=100){
            this.mat.note = mat;
        }
        if(turk >= 0 && turk <=100){
            this.turk.note = turk;
        }
        if(cograf >= 0 && cograf <=100){
            this.cograf.note = cograf;
        }
    }
    void addBulkQuizNote(int mat, int turk, int cograf){
        if(mat >= 0 && mat <=100){
            this.mat.quiz = mat;
        }
        if(turk >= 0 && turk <=100){
            this.turk.quiz = turk;
        }
        if(cograf >= 0 && cograf <=100){
            this.cograf.quiz = cograf;
        }
    }
    void addBulkQuizEffect(int mat, int turk, int cograf){
        if(mat >= 0 && mat <=100){
            this.mat.effect = mat;
        }
        if(turk >= 0 && turk <=1000){
            this.turk.effect = turk;
        }
        if(cograf >= 0 && cograf <=100){
            this.cograf.effect = cograf;
        }
    }
    void isPass(){
        if(this.mat.note == 0 || this.turk.note == 0 || this.cograf.note == 0){
            System.out.println("Notlar tam girilmemiş.");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama :" + String.format("%.2f",this.avarage));
            if (this.isPass){
                System.out.println("Sınıfı geçtiniz.");
            }else {
                System.out.println("Sınıfta kaldınız.");
            }
        }
    }
    void calcAvarage(){
        this.cograf.note = ((this.cograf.quiz * (this.cograf.effect /100) +(this.cograf.note * ((100 - this.cograf.effect) /100))));
        this.turk.note =((this.turk.quiz * (this.turk.effect /100) +(this.turk.note * ((100 - this.turk.effect) /100))));
        this.mat.note =((this.mat.quiz * (this.mat.effect /100) +(this.mat.note * ((100 - this.mat.effect) /100))));

        this.avarage = (this.cograf.note + this.turk.note + this.mat.note) / 3;
    }

    boolean isCheckPass(){
        calcAvarage();
        return  this.avarage >55;
    }

    void printNote(){
        System.out.println("=================");
        System.out.println("Öğrenci :" + this.name);
        System.out.println("Matematik notu :" + this.mat.note);
        System.out.println("Coğrafya notu :" + this.cograf.note);
        System.out.println("Türkçe notu :" + this.turk.note);
    }
}
