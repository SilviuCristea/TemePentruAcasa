import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OutOfRangeGrades {

        //Sa se modeleze un student care sa aibe nume prenume //note la mate info fizica // atribut admis la Politehnica (boolean)
        //Clasa parinte Person
        //Folosim o interfata pt folosirea notelor si admiterea la facultate (se calculeaza in functie de medii)
        //Se introduc de la tastatura numele, prenumele si notele
        //Daca media notelor este mai mica decat 6 sa arunce o exceptie "BadGradesException"

        //Sa se creeze si sa trateze exceptia cand notele sunt mai mici decat 1 si mai mari ca 10
        //Sa se mai adauge urmatorul comportament prin intermediul unei interfete
            //Sa se calculeze media doar la mate si fizica si sa se afiseze un camp admis la fizica
            //Sa se calculeze media la info si mate si sa se afiseze un mesaj admis la mate
            //Sa se mai adauge o exceptie cand nota este 10 cu mesajul "felicitari. Aveti media 10"
        //De adaugat o interfata cu comportamente ce pot fi adaugate

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti prenumele");
        String firstName=scanner.nextLine();

        System.out.println("Va rugam introduceti numele");
        String name = scanner.nextLine();

        System.out.println("Va rugam introduceti nota la informatica");
        int infoGrade = scanner.nextInt();

        try {
            if (infoGrade<1 || infoGrade>10){
                throw new OutOfRangeGrades("Nota incorecta.");
            }
        }catch (OutOfRangeGrades e){
            System.out.println("Incercati din nou. "+e.getMessage());
            infoGrade=scanner.nextInt();
        }


        System.out.println("Va rugam introduceti nota la matematica");
        int mathGrade = scanner.nextInt();
        try {
            if (mathGrade<1 || mathGrade>10){
                throw new OutOfRangeGrades("Nota incorecta.");
            }
        }catch (OutOfRangeGrades e){
            System.out.println("Incercati din nou. "+e.getMessage());
            mathGrade=scanner.nextInt();
        }

        System.out.println("Va rugam introduceti nota la fizica");
        int phisicsGrade = scanner.nextInt();

        try {
            if (phisicsGrade<1 || phisicsGrade>10){
                throw new OutOfRangeGrades("Nota incorecta.");
            }
        }catch (OutOfRangeGrades e){
            System.out.println("Incercati din nou. "+e.getMessage());
            phisicsGrade=scanner.nextInt();
        }

        System.out.println("Numele studentului este: "+firstName+" "+name);
        System.out.println("Nota la Informatica: "+infoGrade);
        System.out.println("Nota la Matematica: "+mathGrade);
        System.out.println("Nota la Fizica: "+phisicsGrade);


        Student student = new Student(firstName, name, infoGrade, mathGrade, phisicsGrade);
            try {
                student.computeAverage();
                System.out.println("Admiterea la Politehnica este: "+student.getAdmisPoli());
                student.computeAdmisInfo();
                System.out.println("Admiterea la Informatica este: "+student.getAdmisInfo());
                student.computeAdmisPhis();
                System.out.println("Admiterea la Fizica este: "+student.getAdmisPhis());
            }catch (BadGradesException e){
                System.out.println("Ne pare rau. "+e.getMessage());
            }catch (ExcelenteGradesException e){
                System.out.println(e.getMessage());
            }


        //Cum comparam studentii?

        Student student_Alex=new Student("Alex","Ion", 8,7,9);
        Student student_Liviu=new Student("Liviu", "Popescu", 5,8,7);

        //Putem face media si ulterior sa o comparam
        int medieAlex=(student_Alex.getInfoGrade()+student_Alex.getMathGrade()+student_Alex.getPhisicsGrade())/3;
        int medieLiviu=(student_Liviu.getInfoGrade()+student_Liviu.getMathGrade()+student_Liviu.getPhisicsGrade())/3;

        //Am facut o metoda in clasa Student pentru a calcula media
        if (student_Alex.getMedie()>student_Liviu.getMedie()){
            System.out.println("Media lui Alex este mai mare");
        }else{
            System.out.println("Mecia lui Liviu este mai mare");
        }
        
        // parca mai era o metoda de comparat studentii, care era si mai de preferat

    }
}
