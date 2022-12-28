import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination || edges.length == 0) {
            return true;
        }
        ArrayList<Integer>[] graph = createGraph(n,edges);

        return search(source,destination,graph);
    }

    private ArrayList<Integer>[] createGraph(int n, int[][] edges) {
        ArrayList<Integer>[] list = (ArrayList<Integer>[]) Array.newInstance(ArrayList.class,n);

        for(int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            list[edge[0]].add(edge[1]);
            list[edge[1]].add(edge[0]);
        }
        return list;
    }

    public boolean search(Integer nodeValue, Integer searchValue, ArrayList<Integer>[] graph) {
        HashSet<Integer> visitedNodes = new HashSet<>();
        Queue<Integer> nodesToVisit = new LinkedList<>();
        
        nodesToVisit.add(nodeValue);

        while(nodesToVisit.size() > 0) {
            Integer currentNode = nodesToVisit.poll();
            visitedNodes.add(currentNode);
            for(Integer nextNode : graph[currentNode]) {
                if(!visitedNodes.contains(nextNode)) {
                    if(nextNode.equals(searchValue)) {
                        return true;
                    }
                }
                nodesToVisit.add(nextNode);
            }
        }
        return false;
    }
}