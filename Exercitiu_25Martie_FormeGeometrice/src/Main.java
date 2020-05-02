public class Main {

    public static void main(String[] args) {

        // exerctiu OOP Shape —
        // — atribute—
        // — numberOfEdges —
        // — metode—
        // String draw();
        // int Perimeter();
        // int arial()
        // Triangle
        // FourSquares
        // Circle
        Circles cerc1=new Circles(0,5);
        Triangles triunghi1=new Triangles(3, 5, 7, 6, 4);
        Patrulater deptrunghi1=new Patrulater(4, 6,4,6,4);

        System.out.println("Perimetrul triunghului 1 este: "+triunghi1.perimetru());
        System.out.println("Trunghiul arata "+triunghi1.draw());
        System.out.println("Aria triunghiului este: "+triunghi1.arie());
    }

}
