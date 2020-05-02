public class Circles extends Shapes {
    protected int raza;

    public Circles(int nrEdges, int raza){
        this.nrEdges=nrEdges;
        this.raza=raza;
    }
    public Circles(){

    }
    public String draw(){
       return "Ma desenez ca un cerc";
    }
    public double perimetru(){
        return raza*2*3.14;
    }
    public double arie(){
        return raza*raza*3.14;
    }
}
