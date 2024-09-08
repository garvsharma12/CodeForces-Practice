import java.util.*;
public class GraphList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        for(int i=0 ;i<v ;i++){
            adj.add(new ArrayList<>());
        }
        int edges=sc.nextInt();
        for(int i=0;i<edges;i++){
            int l=sc.nextInt();
            int r = sc.nextInt();
            addEdge(adj, l, r);
        }
        printGraph(adj);
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v ){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0 ;i<adj.size();i++){
            System.out.print(i+"->");
            for(int j=0 ; j<adj.get(i).size() ;j++)
                System.out.print(adj.get(i).get(j)+" ");
            System.out.println();
        }
    }
}
