package com.company;

public class Dijkstra {

    public  int minDistanceUnvisited(int dist[],Boolean b[]){
        int min = Integer.MAX_VALUE ,index = -1;
        for (int x = 0; x < 5 ;x++){
            if(b[x] == false && dist[x] <= min){
                min = dist[x];
                index = x;
            }
        }
        return index;
    }

    public void dijkstra(int graph[][], int src, int n){
        int dist[] = new int[n];
        int prev[] = new int[n];
        Boolean b[] = new Boolean[n];
        for(int i =0;i < n;i++){
            dist[i] = Integer.MAX_VALUE;
            b[i] = false;
        }
        dist[src] = 0;
        for(int count = 0; count<n;count++){
            int m = minDistanceUnvisited(dist,b);
            b[m] = true;
            System.out.println("shortest distance to "+m+" = "+dist[m]+" :previous node = "+prev[m]);
            for (int x =0;x<5;x++){
                if(graph[m][x]!=0 ){
                    dist[x] = Math.min(dist[m]+graph[m][x] , dist[x]);
                    prev[x] = m;
                }
            }
        }
    }

    public static void main(String args[]){
        int graph1[][] = new int[][] {
                                        {0,4,0,0,7},    //A=0
                                        {4,0,1,2,0},    //B=1
                                        {0,1,0,6,0},    //C=2
                                        {0,2,6,0,0},    //D=3
                                        {7,0,0,0,0}};   //E=4

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(graph1,0,graph1.length);
    }

}
