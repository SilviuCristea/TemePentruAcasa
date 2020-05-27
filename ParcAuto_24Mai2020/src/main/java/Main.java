import java.io.*;

public class Main {

    //Sa se modeleze un parc auto
    //Masinile vor fi citite dintr-un fisier
    //Masinile vor avea marca, model, culoare, pret, combustibil, data fabricare (separate cu virgula)
    //3 tipuri de masini nemtesti, frantuzesti, altele
    //Citim din fisier masinile
    // daca sunt nemtesti se vor pune intr-un fisier separat si la fel pentru celalte
    //Fiecare masina va avea urmatorul comportament:
        // vandute in leasing (vom putea lua numarul de rate si valoarea ratei)
        // Masinile se vor compara dupa calitate reprezentat de anul de fabricatie
        //La leasing trebuie pus si un avans
    //Maina va mai avea un atribut vandut/nevandut
        //Masinile vandute se vor scrie in alt fisier
    //Afisam toate masinile vandute (din fisier)
    //Masinile vandute vor fi cele nemtesti de culoare neagra si pe benzina

    public static void main(String[] args) {
        //Avem nevoie de:

        //O clasa masina toate atributele (marca, model, culoare, pret, combustibil, data fabricatie

        //Masinile vor avea un camp vanzare (boolean)

        //Interfata pentru Leasing cu urmatoarele comportamente:
            //Calculam numarul de rate si valoarea ratei

        //Folosim (implementam)interfata predefinita Comparable pentru compararea masinilor

        //Un fisier care sa contina masinile (de citit)

        //Dupa ce le citim le sortam in 3 fisiere (nemtesti, frantuzesti, altele)

        //Citim din nou masinile din cele 3 fisiere pentru a vedea care sunt vandute

        //Un fisier pentru adauga masinile vandute



        try {
            String masiniInitiale = "C:\\Users\\Silviu\\Masini\\MasiniInitiale.txt";
            FileReader masiniInitialeReader = new FileReader(masiniInitiale);
            BufferedReader bufferedReader = new BufferedReader(masiniInitialeReader);

            String masiniNemtesti="C:\\Users\\Silviu\\Masini\\MasiniNemtesti.txt";
            FileWriter masiniNemtestiWriter=new FileWriter(masiniNemtesti);
            BufferedWriter masiniNemtestiBuffer=new BufferedWriter(masiniNemtestiWriter);


            String masiniFrantuzesti="C:\\Users\\Silviu\\Masini\\MasiniFrantuzesti.txt";
            FileWriter masiniFrantuzestiWriter=new FileWriter(masiniFrantuzesti);
            BufferedWriter masiniFrantuzestiBuffer=new BufferedWriter(masiniFrantuzestiWriter);

            String nasiniAltele="C:\\Users\\Silviu\\Masini\\MasiniAltele.txt";
            FileWriter nasiniAlteleWriter=new FileWriter(nasiniAltele);
            BufferedWriter nasiniAlteleBuffer=new BufferedWriter(nasiniAlteleWriter);

            String masiniVandute="C:\\Users\\Silviu\\Masini\\MasiniVandute.txt";
            FileWriter masiniVanduteWriter=new FileWriter(masiniVandute);
            BufferedWriter masiniVanduteBuffer=new BufferedWriter(masiniVanduteWriter);

            String text = bufferedReader.readLine();
            while (text!=null){
                String[] atributeMasini=text.split(",");
                Masina masina=new Masina(atributeMasini[0], atributeMasini[1], atributeMasini[2], Integer.valueOf(atributeMasini[3]),atributeMasini[4],Integer.valueOf(atributeMasini[5]));

                System.out.println("Rata pentru "+masina.getMarca()+" "+masina.getModel()+" este "+masina.valueRate());

                if (masina.getSold()==true){
                    masiniVanduteBuffer.write(text);
                    masiniVanduteBuffer.newLine();

                }
                text=bufferedReader.readLine();
            }
            masiniVanduteBuffer.close();

        }catch (IOException e){
            System.out.println("Eroare "+e.getMessage());
        }




    }
}
