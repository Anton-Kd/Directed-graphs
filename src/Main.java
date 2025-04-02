import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        DAG<String> flights = new DAG<>();

        Vertex<String> rome = flights.createVertex("Рим");
        Vertex<String> paris = flights.createVertex("Париж");
        Vertex<String> berlin = flights.createVertex("Берлин");
        Vertex<String> london = flights.createVertex("Лондон");
        Vertex<String> beijing = flights.createVertex("Пекин");

        flights.createEdge(rome, paris);
        flights.createEdge(london, paris);
        flights.createEdge(berlin, paris);
        flights.createEdge(rome, berlin);

        flights.createEdge(paris, berlin);
        flights.createEdge(berlin, beijing);

        System.out.println(flights.path(london, paris)); // 1
        System.out.println(flights.path(london, berlin)); // 2
        System.out.println(flights.path(rome, beijing)); // 2
        System.out.println(flights.path(rome, london)); // -1

    }

}