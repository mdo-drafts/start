package study.union_find.uf_10_323_number_of_connected_components;

public class Solution {
    private int find(int[] parent, int n1) {
//        return parent[n1];
        int res = n1;
        while(res != parent[res]){
            //short path optimization
            parent[res] = parent[parent[res]];
            res = parent[res];
        }

        return res;
    }

    private int union(int[] parent, int[] rank, int n1, int n2) {
        n1 = find(parent, n1);
        n2 = find(parent, n2);

        if (n1 == n2) {
            return 0;
        } else {
            if (rank[n1] > rank[n2]) {
                rank[n1] += rank[n2];
                parent[n2] = n1;
            } else {
                rank[n2] += rank[n1];
                parent[n1] = n2;
            }
            return 1;
        }
    }

    public int countComponents(int n, int[][] edges) {
        int[] parent = new int[n];
        int[] size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        int components = n;
        for (int i = 0; i < edges.length; i++) {
            components -= union(parent, size, edges[i][0], edges[i][1]);
        }

        return components;
    }
}
