public class Shapes {
    //Atributele
    protected int nrEdges;
    //Constructorul
    public Shapes(int nrEdges){
        this.nrEdges=nrEdges;
    }
    //
    public Shapes(){

    }

    public int getNrEdgesrEdges(){
        return nrEdges;
    }

    public String draw(){
        return "Sunt o forma generala";
    }
}
