package graph;

public class Client {
    public static void main(String [] args){
        Graph g=new Graph();
        g.addVertice("P");
        g.addVertice("Q");
        g.addEdge("P","Q",10);
        g.addVertice("A");
        g.addVertice("B");
        g.addVertice("C");
        g.addVertice("D");
        g.addVertice("E");
        g.addVertice("F");
        g.addVertice("G");
        g.addVertice("X");
        g.addEdge("A","B",10);
        g.addEdge("A","D",40);
        g.addEdge("B","C",10);
        g.addEdge("D","C",10);
        g.addEdge("D","E",2);
        g.addEdge("E","F",3);
        g.addEdge("E","G",8);
        g.addEdge("F","G",3);
        g.addEdge("X","G",3);


        //g.display();
//         System.out.print(g.countVertices());
//        System.out.print(g.countEdge());
        //g.removeEdge("A","B");
//        g.removeVertex("A");
//        System.out.println(g.containEdges("A","G"));
//        g.display();
//        g.printAllPath("A","F");
//        System.out.println(g.hasPath("F","X"));
//        System.out.println(g.dfs("A","G"));
//          g.display();
//          System.out.println(g.haspath("P","A"));
        g.dfs();
        System.out.println();
          g.display();
    }
}
