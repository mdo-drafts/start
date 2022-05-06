package solved.medium.graph.g_04_684_redundant_connection;

public class Solution {
    int[] parent;
    int[] rank;

    public int[] findRedundantConnection(int[][] edges) {
        int[] res = {};
        int numComponents = edges.length + 1;
        parent = new int[numComponents];
        rank = new int[numComponents];

        for (int i = 0; i < numComponents; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        for (int[] edge : edges) {
            if (isRedundant(edge)) {
                res = edge;
            }
        }
        return res;
    }

    private boolean isRedundant(int[] edge) {
        return union(edge[0], edge[1]);
    }

    private int find(int num) {
        int res = num;
        while (res != parent[res]) {
            res = parent[res];
        }
        return res;
    }

    private boolean union(int n1, int n2) {
        int p1 = find(n1);
        int p2 = find(n2);

        if (p1 == p2) {
            return true;
        }
        if (rank[p1] > rank[p2]) {
            parent[p2] = p1;
            rank[p1]++;
        } else {
            parent[p1] = p2;
            rank[p2]++;
        }
        return false;
    }

}
