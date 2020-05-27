public class Masina implements Leasing, Comparable<Masina>{
    private String marca;
    private String model;
    private String culoare;
    private int pret;
    private String motorizare;
    private int dataFabricare;
    private boolean sold=false;

    public Masina(String marca, String model, String culoare, int pret, String motorizare, int dataFabricare){
        this.marca=marca;
        this.model=model;
        this.culoare=culoare;
        this.pret=pret;
        this.motorizare=motorizare;
        this.dataFabricare=dataFabricare;
    }

    public String getMarca(){
        return marca;
    }
    public String getModel(){
        return model;
    }
    public int getDataFabricare(){
        return dataFabricare;
    }
    public String getCuloare(){
        return culoare;
    }
    public int getPret() {
        return pret;
    }
    public boolean getSold(){
        if((this.marca.equals("Audi")||this.marca.equals("BMW"))&&this.culoare.equals("negru")&&this.motorizare.equals("benzina")){
            return true;
        }else{
            return false;
        }
    }



    public int compareTo(Masina o) {
        if (this.dataFabricare<o.getDataFabricare()){
            return -1;
        }else if (this.dataFabricare>o.getDataFabricare()){
            return 1;
        }else {
            return 0;
        }
    }

    public int numberOfPays() {
        return 24;
    }

    public int valueRate() {
        return this.pret/numberOfPays();
    }
}
