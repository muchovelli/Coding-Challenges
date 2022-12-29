import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        System.out.println(validPath(6, matrix, 0, 5));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination || edges.length == 0) {
            return true;
        }
        ArrayList<ArrayList<Integer>> graph = createGraph(n, edges);

        return search(source, destination, graph);
    }

    private static ArrayList<ArrayList<Integer>> createGraph(int n, int[][] edges) {
        System.out.println("Creating graph " + Arrays.deepToString(edges));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            System.out.println("Adding edge " + Arrays.toString(edge));
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        System.out.println(list.toString());
        return list;
    }

    public static boolean search(Integer nodeValue, Integer searchValue, ArrayList<ArrayList<Integer>> graph) {
        HashSet<Integer> visitedNodes = new HashSet<>();
        Queue<Integer> nodesToVisit = new LinkedList<>();

        nodesToVisit.add(nodeValue);
        System.out.println("Searching for " + searchValue + " starting at " + nodeValue);

        while (!nodesToVisit.isEmpty()) {
            Integer currentNode = nodesToVisit.remove();
            System.out.println("Visiting " + currentNode);
            if (currentNode == searchValue) {
                return true;
            }
            visitedNodes.add(currentNode);
            for (Integer neighbor : graph.get(currentNode)) {
                if (!visitedNodes.contains(neighbor)) {
                    nodesToVisit.add(neighbor);
                }
            }
        }
        return false;
    }
}