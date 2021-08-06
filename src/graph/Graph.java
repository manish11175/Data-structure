package graph;

import java.lang.reflect.Array;
import java.util.*;


import java.util.ArrayList;

public class Graph {
    HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();

    private boolean containsVertice(String vname) {
        return graph.containsKey(vname);
    }

    public void addVertice(String vname) {
        if (containsVertice(vname) == false) {
            graph.put(vname, new HashMap<>());
        }
    }

    public void addEdge(String vname1, String vname2, int w) {
        if (containsVertice(vname1) && containsVertice(vname2)) {
            graph.get(vname1).put(vname2, w);
            graph.get(vname2).put(vname1, w);


        }
    }

    public void display() {
        ArrayList<String> vertices = new ArrayList<>(graph.keySet());
        for (String s : vertices) {
            System.out.println(s + " -> " + graph.get(s));
        }
    }

    public boolean containEdges(String vname1, String vname2) {
        if (containsVertice(vname1) == false || containsVertice(vname2) == false) {

            return false;
        }
        return graph.get(vname1).containsKey(vname2);
    }

    public int countVertices() {
        return graph.size();
    }

    public int countEdge() {
        ArrayList<String> vertices = new ArrayList<>(graph.keySet());
        if (vertices.size() > 0) {
            int count = 0;
            for (String v : vertices) {
                count += graph.get(v).size();
            }
            return count / 2;
        }
        return 0;
    }

    public void removeEdge(String vname1, String vname2) {

        if (containEdges(vname1, vname2)) {
            graph.get(vname1).remove(vname2);
            graph.get(vname2).remove(vname1);
        }
    }

    public void removeVertex(String vname) {
        if (containsVertice(vname)) {
            ArrayList<String> vertices = new ArrayList<>(graph.keySet());
            for (String v : vertices) {
                removeEdge(v, vname);
            }

            graph.remove(vname);
        }
    }


    public void printAllPath(String source, String destination) {

        HashSet<String> visited = new HashSet<>();
        printPath(source, destination, "", visited);

    }

    private void printPath(String source, String destination, String ans, HashSet<String> visited) {


        if (source.equals(destination)) {
            System.out.println(ans + " -> " + destination);
            return;
        }

        visited.add(source);

        for (String v : graph.get(source).keySet()) {
            if (!visited.contains(v))
                printPath(v, destination, ans + "->" + source, visited);
        }
        visited.remove(source);
    }


    public boolean hasPath(String source, String destination) {
        HashSet<String> visited = new HashSet<>();
        return hasPath(source, destination, visited);
    }

    private boolean hasPath(String source, String destination, HashSet<String> visited) {
        if (source.equals(destination)) {
            return true;
        }
        visited.add(source);
        for (String v : graph.get(source).keySet()) {
            if (!visited.contains(v)){
                boolean ans= hasPath(v, destination, visited);
                if(ans==true){
                    return true;
                }
            }

        }
        visited.remove(source);
        return false;
    }


    private static String smallestPath;
    private static int smallestWt;
    public void printSmallestPW(String source,String destination){
        HashSet<String> visited = new HashSet<>();
        smallestPath = "";
        smallestWt = Integer.MAX_VALUE;
        printSmallestPW(source, destination,visited,source,0);
        System.out.println(smallestPath+"->"+smallestWt);
    }


    private void printSmallestPW(String vname,String destination,HashSet<String> visited,String asf,int wt){

        if(vname.equals(destination)){
            if(smallestWt>wt){
                smallestWt = wt;
                smallestPath = asf;
            }
            return ;
        }

        visited.add(vname);
        ArrayList<String> nbrs = new ArrayList<>(graph.get(vname).keySet());

        for(String nbr:nbrs){
            if(visited.contains(nbr)){
                continue;
            }
            printSmallestPW(nbr,destination,visited,asf+nbr,wt+graph.get(vname).get(nbr));
        }
        visited.remove(vname);
    }

    private class Tpair {
        String v;
        String p;
        int w;

        public Tpair(String v,String p,int w){
            this.v = v;
            this.p = p;
            this .w = w;
        }
    }
    public boolean bfs(String s,String d){
        Tpair pair = new Tpair(s,s,0);

        HashSet<String> visited = new HashSet<>();
        LinkedList<Tpair> q = new LinkedList<>();
        q.addLast(pair);
        while(q.size()>0){
            Tpair rem = q.removeFirst();
            visited.add(rem.v);
            System.out.println(rem.v+"@"+rem.p);
            if(rem.v.equals(d)){
                return true;
            }
            for(String n:graph.get(rem.v).keySet()){
                if(visited.contains(n)==false){
                    Tpair npair = new Tpair(n,rem.p+n,rem.w+graph.get(rem.v).get(n));
                    q.addLast(npair);
                }
            }
        }

        return false;
    }
    public boolean dfs(String s,String d){
        Tpair pair = new Tpair(s,s,0);

        HashSet<String> visited = new HashSet<>();
        Stack<Tpair> q = new Stack<>();
        q.push(pair);
        while(q.size()>0){
            Tpair rem = q.pop();
            visited.add(rem.v);
            System.out.println(rem.v+"@"+rem.p);
            if(rem.v.equals(d)){
                return true;
            }
            for(String n:graph.get(rem.v).keySet()){
                if(visited.contains(n)==false){
                    Tpair npair = new Tpair(n,rem.p+n,rem.w+graph.get(rem.v).get(n));
                    q.push(npair);
                }
            }
        }

        return false;
    }


//    public static void getConnect(String s,String d){
//        Tpair pair = new Tpair(s,d,0);
//        String path=" ";
//        HashSet<String> visited = new HashSet<>();
//        LinkedList<Tpair> q = new LinkedList<>();
//        q.addLast(pair);
//        while(q.size()>0){
//            Tpair rem = q.removeFirst();
//            visited.add(rem.v);
////            System.out.println(rem.v+"@"+rem.p);
//            if(rem.v.equals(d)){
//                continue;
//            }
//            for(String n:graph.get(rem.v).keySet()){
//                if(visited.contains(n)==false){
//                    Tpair npair = new Tpair(n,rem.p+n,rem.w+graph.get(rem.v).get(n));
//                    q.addLast(npair);
//                }
//            }
//        }
//
//        return false;
//    }

    public  boolean haspath(String source,String destination){
        HashSet<String>visited=new HashSet<>();
        return haspath(source,destination,visited);
    }
    private boolean haspath(String source,String destination,HashSet<String>visited){
      if(source.equals(destination)){
          return true;
      }
      visited.add(source);
      ArrayList<String>vertices=new ArrayList<>(graph.get(source).keySet());
      for(String vertex:vertices){
          if(!visited.contains(vertex)){
              boolean res=haspath(vertex,destination,visited);
             if(res){
                 return res;
             }

          }
      }
        return false;
    }




    public void dfs(){
        HashSet<String>visited=new HashSet<>();
        ArrayList<String>vertices=new ArrayList<>(graph.keySet());
        for(String vertax:vertices){
            if(visited.contains(vertax)){
                continue;
            }
            dfs(vertax,visited);
        }
    }
    private void dfs(String source,HashSet<String>visited){
        visited.add(source);
        System.out.print(source+"---->");
        ArrayList<String>neighbours=new ArrayList<>(graph.get(source).keySet());
        for(String neighbour:neighbours){
            if(visited.contains(neighbour)){
               continue;
            }
            dfs(neighbour,visited);
        }
    }

    public void bfs(){
      HashSet<String>visited =new HashSet<>();
      ArrayList<String>vertices=new ArrayList<>(graph.keySet());

      for (String vertax:vertices){
           if(!visited.contains(vertax)){
               LinkedList<String>queue=new LinkedList<>();
               queue.addLast(vertax);
               while(queue.size()>0){
                   String currVertax=queue.removeFirst();
                   if(visited.contains(currVertax)){
                       continue;
                   }
                   visited.add(currVertax);

                   System.out.print(currVertax+"---->");
                   ArrayList<String> neighbours=new ArrayList<>(graph.get(vertax).keySet());
                   for (String neighbour:neighbours){
                       if(!visited.contains(neighbour)){
                           queue.addLast(neighbour);
                       }
                   }
               }
           }
      }
    }


}
