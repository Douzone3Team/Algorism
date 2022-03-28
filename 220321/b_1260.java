package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class b_1260 {
    public static int cnt;
    public static LinkedList<Integer>[] list;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        cnt = Integer.parseInt(st.nextToken());
        int lineCnt = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());
        
        list = new LinkedList[cnt+1];
        
        for(int i=0; i <= cnt; i++) {
            list[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i < lineCnt; i++) {
            st = new StringTokenizer(br.readLine());
            
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            
            list[node1].add(node2);
            list[node2].add(node1);
            
            Collections.sort(list[node1]);
            Collections.sort(list[node2]);
        }
        
        StringBuilder dfs = new StringBuilder();
        StringBuilder bfs = new StringBuilder();
        
        boolean[] dfsVisited = new boolean[cnt+1];
        boolean[] bfsVisited = new boolean[cnt+1];
        
        dfs(startNode, dfsVisited, dfs);
        bfs(startNode, bfsVisited, bfs);
        
        System.out.println(dfs + "\n" + bfs);
    }
    
    public static void dfs(int node, boolean[] visited, StringBuilder sb) {
        if(visited[node]) return;
        
        visited[node] = true;
        sb.append(node + " ");
        for(int nextNode:list[node]) {
            dfs(nextNode, visited, sb);
        }
    }
    
    public static void bfs(int node, boolean[] visited, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.offer(node);
        
        while(!queue.isEmpty()) {
            node = queue.poll();
            
            if(visited[node]) continue;
            
            visited[node] = true;
            sb.append(node + " ");
            
            for(int nextNode:list[node]) {
                queue.add(nextNode);
            }
        }
    }
}