public class Triangles extends Shapes{
    private int latura1;
    private int latura2;
    private int latura3;
    private int inaltime;

    public Triangles(int nrEdges, int latura1, int latura2, int latura3, int inaltime){
        this.latura1=latura1;
        this.latura2=latura2;
        this.latura3=latura3;
        this.inaltime=inaltime;
        this.nrEdges=nrEdges;
    }
    public Triangles(){

    }

    public String draw(){
        return "Ma desenez un triunghi";
    }

    public int perimetru(){
        return latura1+latura2+latura3;
    }

    public int arie(){
        return (latura3*inaltime)/2;
    }
}
