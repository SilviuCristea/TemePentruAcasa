import java.io.Serializable;

public class Student extends Person implements Examinator,Comparable<Student>, Serializable {

    private int infoGrade;
    private int mathGrade;
    private int phisicsGrade;
    private boolean admisPoli;
    private boolean admisInfo;
    private boolean admisPhis;
    private int medie;

    public Student(String firstName, String name, int infoGrade, int mathGrade, int phisicsGrade){
        this.firstName=firstName;
        this.name=name;
        this.infoGrade=infoGrade;
        this.mathGrade=mathGrade;
        this.phisicsGrade=phisicsGrade;
    }

    public boolean getAdmisPoli(){
        return this.admisPoli;
    }

    public boolean getAdmisInfo() {
        return this.admisInfo;
    }

    public boolean getAdmisPhis() {
        return this.admisPhis;
    }

    public void computeAdmisInfo(){
        int medieInfo = (this.mathGrade+this.infoGrade)/2;
        if(medieInfo>9){
            this.admisInfo=true;
        }else{
            this.admisInfo=false;
        }
    }
    public void computeAdmisPhis(){
        int mediePhis=(this.mathGrade+this.phisicsGrade)/2;
        if (mediePhis>9){
            this.admisPhis=true;
        }else{
            this.admisPhis=false;
        }
    }

    public void computeAverage() throws BadGradesException, ExcelenteGradesException {
        int average=(this.infoGrade+this.mathGrade+this.phisicsGrade)/3;
        if (average==10){
            throw new ExcelenteGradesException("Felicitari! Sunteti admis la oricare facultate.");
        }
        else if (average<6){
            throw new BadGradesException("Studentul este repetent.");
        }else if (average>=6 && average<9){
            this.admisPoli = false;
        }else{
            this.admisPoli = true;
        }
    }

    public int getInfoGrade() {
        return infoGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getPhisicsGrade() {
        return phisicsGrade;
    }

    public int getMedie(){
        this.medie=(this.infoGrade+this.mathGrade+this.phisicsGrade)/3;
        return medie;
    }


    @Override
    public int compareTo(Student o) {
        if (this.medie>o.getMedie()){
            return 1;
        }else if (this.medie<o.getMedie()){
            return -1;
        }else {
            return 0;
        }
    }
}
