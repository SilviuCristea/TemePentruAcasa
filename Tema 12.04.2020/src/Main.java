public class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 47;
        int c = 32;

        String text = "Welcome all in the house to the English language Wiktionary collaborative project to produce free content multilingual";
        String text2 = "Welcome all in the house, to the English language, Wiktionary collaborative, project to produce free content multilingual";

        //1.Write a Java program to find the smallest number among three numbers

        int celmaimicNumar=celmaimicNumar(a,b,c);
        System.out.println("Cel mai mic numar este: "+celmaimicNumar);

        //2.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        int average = (a + b + c) / 3;
        System.out.println("Media numerelor este: " + average);

        //3.Write a Java program to display the middle character of a string.

        midleCharacter(text);

        //4.Write a Java program to count all words in a string.

        int cuvinteText = cuvinteText(text);
        System.out.println("Numarul de cuvinte: " + cuvinteText);

        //5.Write a Java program to print characters between two characters (i.e. A to P ) from a text

        caractereCautate(text);

        //6.Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1

        int n = 557;

        int diviziune=diviziune(n);
        System.out.println(diviziune);

        //7.Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20

        int[] numere = new int[]{1, 5, 17, 10, 15, 45, 30, 20, 20, 44, 56, 10, 72, 55};

        arrayNumere(numere);

        //8.Write a Java program to find the numbers greater than the average of the numbers of a given array.

        int[] numereNoi = new int[]{1, 5, 17, 10, 15, 45, 30, 20, 20, 44, 56, 10, 72, 55};

        numerepesteMedie(numereNoi);


        //9.Write a Java program to check if the value 20 appears three times in an array

        int[] numereNoi2 = new int[]{1, 5, 17, 10, 15, 45, 30, 20, 58, 20, 88, 20, 56, 10, 72, 55, 73};

        numerede20(numereNoi2);

        //10.Write a Java program to add all the digits of a given positive integer until the result has a single digit.

        int m=256;

        int produsInt=produsInt(m);
        System.out.println("Suma cifrelor este: "+produsInt);

        //11.Write a Java program to check if a positive number is a palindrome or not.

        int d=45254;

        palindromInt(d);


        //12.Write a Java program to check if a string is a palindrome or not.

        String cuvant="madam";

        if (palindromString(cuvant)==true){
            System.out.println("Cuvantul este palindrom");
        }else {
            System.out.println("Cuvantul nu este palindrom");
        }

        //13.Write a Java program to compute the sum of first n given prime numbers.

        int n1=725;
        int sumaPrime=sumaPrime(n1);
        System.out.println("Suma numerelor prime pana la "+n1+" este "+sumaPrime);

        //14.Write a Java program to find the word from the middle of a given string.

        cuvantMijloc(text);


        //15.Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10

        pozitieMultipla5(text);


        //16.Write a Java program to read a string and if the first or last characters
        // are ’s’ or ’e’, return the string without the words from odd positions.

        textNou(text2);


        //17.Write a Java program to count the number of words ending that have more than 2 vowels

        int sumaVocale=sumaVocale(text);
        System.out.println("Numarul de cuvinte care se termina cu mai multe vocale este: "+sumaVocale);

        //18.Write a Java program to count all “,” and spaces in a text

        int spatiiCautate=spatiiCautate(text2);
        System.out.println("Numarul de spatii si virgule din text este: "+spatiiCautate);

        //19.Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|”
        // if the space is on an odd position from a given string.

        textModificat(text);


        }
    //7.Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20
    public static void arrayNumere (int[] numere){
        for (int cursor = 0; cursor < numere.length; cursor++) {
            if (numere[cursor] == 10 && numere[cursor + 1] == 10) {
                System.out.println("Sunt numere de 10 alaturate");
            }
            if (numere[cursor] == 20 && numere[cursor + 1] == 20) {
                System.out.println("Sunt numere de 20 alaturate");
            }
        }
    }

    //8.Write a Java program to find the numbers greater than the average of the numbers of a given array.
    public static void numerepesteMedie(int[] numereNoi){
        int suma = 0;

        for (int cursor = 0; cursor < numereNoi.length; cursor++) {
            suma = suma + numereNoi[cursor];
        }
        int medieNumere = suma / numereNoi.length;

        System.out.println("Numerele mai mari decat media sunt: ");

        for (int cursor = 0; cursor < numereNoi.length; cursor++) {
            if (numereNoi[cursor] > medieNumere) {
                System.out.println(numereNoi[cursor]);
            }

        }
    }

    //1. Aici avem functia pentru calcularea celui mai mic numar
    public static int celmaimicNumar (int a, int b, int c){
        int celmaimicNumar=0;
        if (a < b && a < c) {
            celmaimicNumar=a;
        } else if (b < a && b < c) {
            celmaimicNumar=b;
        } else if (c < a && c < b) {
            celmaimicNumar=c;
        }
        return celmaimicNumar;
    }
    //6.Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1
    public static int diviziune(int n){
        do {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

        }
        while (n > 1);
        return n;

    }

    //2. Aici avem functia pentru calcularea mediei
    public static int medie(int a, int b, int c){
        int medie = (a+b+c)/3;
        return medie;
    }
    //3. Aici avem functia pentru cautarea caracterului din mijloc

    public static void midleCharacter(String text){
        int lungimeText=text.length();
        char midleChar=text.charAt(lungimeText/2);
        System.out.println("Caracterul din mijloc este: "+midleChar);
    }
    //4. Aici avem functia pentru numararea cuvintelor din text

    public static int cuvinteText(String text){
        String[] rezultatSplit=text.split(" ");
        int cuvinteText=rezultatSplit.length;
        return cuvinteText;
    }
    //5. Aici avem functia pentru extragerea caraterelor aflate inter literele a si p

    public static void caractereCautate (String text){
        int caracterA=text.indexOf('a');
        int caracterP=text.indexOf('p');
        String caractereCautate=text.substring(caracterA+1,caracterP);
        System.out.println("Caracterele sunt: "+caractereCautate);
    }
    //9.Write a Java program to check if the value 20 appears three times in an array
    public static void numerede20 (int[] numereNoi2){
        int numarator=0;

        for (int i = 0; i < numereNoi2.length; i++) {
            if (numereNoi2[i]==20){
                numarator++;
            }
        }
        if (numarator==3){
            System.out.println("Sunt 3 numere de 20");
        }else{
            System.out.println("Nu sunt 3 numere de 20");
        }

    }

    //10.Write a Java program to add all the digits of a given positive integer until the result has a single digit.
    public static int produsInt(int m){
        int sum2=0;

        do {int sum3=0;
            while (m!=0){
                sum3=sum3+m%10;
                m=m/10;
            }
            m=sum3;
            sum2=sum3;
        }while (sum2>10);
        return sum2;
    }
    //11.Write a Java program to check if a positive number is a palindrome or not.
    public static void palindromInt(int d){
        int e=d;
        int p=0;
        while (e!=0){
            p=p*10+e%10;
            e=e/10;
        }
        if (p==d){
            System.out.println("Numarul este palindrom");
        }else{
            System.out.println("Numarul nu este palindrom");
        }
    }


    //12.Write a Java program to check if a string is a palindrome or not.
    public static boolean palindromString (String cuvant) {
        int i = 0;
        int j = cuvant.length()-1;
        do {
            if (cuvant.charAt(i++) != cuvant.charAt(j--))
                return false;
        }
        while (j>cuvant.length()/2);

        return true;

    }

    //13.Write a Java program to compute the sum of first n given prime numbers.
    public static int sumaPrime(int n1){
        int sumaPrime=0;
        for (int i=1; i<=n1; i++){
            boolean ok=true;
            for (int j=2; j<=i/2; j++){
                if (i%j==0){
                    ok=false;
                }
            }
            if (ok==true){
                sumaPrime=sumaPrime+i;
            }
        }
        return sumaPrime;

    }


    //14.Write a Java program to find the word from the middle of a given string.
    public static void cuvantMijloc(String text){
        String[] rezultatSplit2=text.split(" ");

        for (int cursor=0;cursor<rezultatSplit2.length;cursor++){
            if (cursor==rezultatSplit2.length/2){
                System.out.println("Cuvantul de la mijlocul textului este: "+rezultatSplit2[cursor]);
            }
        }

    }

    //15.Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10
    public static void pozitieMultipla5(String text){
        int pozitieCautata=0;
        do {
            pozitieCautata += 5;


            if (pozitieCautata % 10 != 0) {
                System.out.println("Caracterele cautate sunt: " + text.charAt(pozitieCautata));
            }
        }
        while (pozitieCautata<text.length());

    }

    //16.Write a Java program to read a string and if the first or last characters
    // are ’s’ or ’e’, return the string without the words from odd positions.

    //String textNou="Welcome all in the house to the English language Wiktionary collaborative project to produce free content multilingual"

    public static void textNou (String text2){
        System.out.println("Noul text este: ");
        String[] arraySplit=text2.split(" ");
        for (int i=0;i<arraySplit.length;i++) {
            if (arraySplit[i].startsWith("s") || arraySplit[i].startsWith("e") || arraySplit[i].endsWith("s") || arraySplit[i].endsWith("e")) {

                if ((i % 2) == 0) {
                    System.out.print(arraySplit[i] + " ");
                }
            }
        }
        System.out.println();
    }

    //17.Write a Java program to count the number of words ending that have more than 2 vowels
    public static int sumaVocale (String text){
        String[] arrayText=text.split(" ");
        int sumaVocale=0;
        for (int i=0; i<arrayText.length; i++){
            if (arrayText[i].endsWith("a")||arrayText[i].endsWith("e")||arrayText[i].endsWith("i")||arrayText[i].endsWith("o")||arrayText[i].endsWith("u")){
                if (arrayText[i].charAt(arrayText[i].length()-2)=='a'||arrayText[i].charAt(arrayText[i].length()-2)=='e'||arrayText[i].charAt(arrayText[i].length()-2)=='i'||arrayText[i].charAt(arrayText[i].length()-2)=='o'||arrayText[i].charAt(arrayText[i].length()-2)=='u') {
                    sumaVocale++;
                }

            }
        }
        return sumaVocale;
    }

    //18.Write a Java program to count all “,” and spaces in a text
    public static int spatiiCautate (String text2){
        int spatiiCautate=0;
        for (int i=0; i<text2.length(); i++){
            if(text2.charAt(i)==' '||text2.charAt(i)==','){
                spatiiCautate++;
            }
        }
        return spatiiCautate;
    }
    //19.Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|”
    // if the space is on an odd position from a given string.
    public static void textModificat (String text){
        for (int i=0; i<text.length(); i++){
            if(i%2==0){
                text=text.replace(' ', ';');
            }if(i%2!=0){
                text=text.replace(';', '|');
            }
        }
        System.out.println("Noul text este: "+text);
    }



}
