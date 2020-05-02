public class Patrulater extends Shapes{

    protected int latura1;
    protected int latura2;
    protected int latura3;
    protected int latura4;

    public Patrulater(int nrEdges, int laatura1, int latura2, int latura3, int latura4){
        this.latura1=latura1;
        this.latura2=latura2;
        this.latura3=latura3;
        this.latura4=latura4;
        this.nrEdges=nrEdges;
    }
    public Patrulater(){

    }

    public String draw(){
        return "Ma desenez ca un patrat";
    }
    public int perimetru(){
        return latura1+latura2+latura3+latura4;
    }
    public int arie(){
        return latura4*latura3;
    }


}
