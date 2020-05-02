import java.util.Calendar;
import java.util.Date;

public class Main {
    // Vreau sa afisam data de astazi

    // Vreau da vedem luna curenta

    //Veau sa vedem anul curent

    //Vreau sa creem un obiect care sa tina un text

    //Vreau sa vedem ultima aparitie din text a caracterului A

    //Vreau sa creem un obiect care sa tina numarul 126

    //Vreau sa creem un obiect care sa tina caracterul S

    //Vreau pentru fiecare obiect sa cautam cate 2 compotrtamente noi

    public static void main(String[] args) {

        Date datadeAzi= new Date();
        System.out.println("Astazi este: "+datadeAzi);

        int lunaCurenta=Calendar.getInstance().get(Calendar.MONTH);

        switch (lunaCurenta){
            case 0: System.out.println("Ianuarie");break;
            case 1: System.out.println("Februarie");break;
            case 2: System.out.println("Martie");break;
            case 3: System.out.println("Aprilie");break;
            case 4: System.out.println("Mai");break;
            case 5: System.out.println("Iunie");break;
            case 6: System.out.println("Iulie");break;
            case 7: System.out.println("August");break;
            case 8: System.out.println("Septembrie");break;
            case 9: System.out.println("Octombrie");break;
            case 10: System.out.println("Noiembrie");break;
            case 11: System.out.println("Decembrie");break;
            default:System.out.println("Luna gresita");
        }

        int anulCurent=Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Anul curent este: "+anulCurent);

        String text=new String("Ana are mere si nu da la nimeni");

        System.out.println("Ultima aparitie a caracterului a este: "+text.lastIndexOf('a'));

        Integer numar=Integer.valueOf(126);

        System.out.println("Numarul este: "+numar);

        Character litera=Character.valueOf('s');

        System.out.println("Caracterul este: "+litera);

        char[] caractere=new char[5];
        caractere[0]='m';
        caractere[1]='l';
        caractere[2]='g';
        caractere[3]='r';
        caractere[4]='a';

        String textRezultat=String.copyValueOf(caractere);

        System.out.println("Noul text este: "+textRezultat);

        String text2=" Ana are mere ";

        if(text2.startsWith(" ")||text2.endsWith(" ")){
          System.out.println("Textul incepe sau se termina cu pauza");
        }

        String textFaraSpatii=text2.trim();

        if(textFaraSpatii.startsWith(" ")||textFaraSpatii.endsWith(" ")){
          System.out.println("Textul incepe cu pauza");
        }else{
            System.out.println("Textul nu se termina cu pauza");
        }

        System.out.println("Textul fara spatii este: "+ textFaraSpatii);
    }



}
