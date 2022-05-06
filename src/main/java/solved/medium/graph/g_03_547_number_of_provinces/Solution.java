package solved.medium.graph.g_03_547_number_of_provinces;

public class Solution {
    int[] parent;
    int[] rank;

    public int findCircleNum(int[][] isConnected) {

        int numOfProvinces = isConnected.length;

        rank = new int[numOfProvinces];
        parent = new int[numOfProvinces];

        for (int i = 0; i < numOfProvinces; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    numOfProvinces -= union(i, j);
                    isConnected[j][i] = 0;
                }
            }
        }
        return numOfProvinces;
    }

    private int find(int num) {
        int res = parent[num];

        while (res != parent[res]) {
            res = parent[res];
        }
        return res;
    }

    private int union(int n1, int n2) {
        int p1 = find(n1);
        int p2 = find(n2);

        if (p1 == p2) {
            return 0;
        }
        if (rank[n1] > rank[n2]) {
            parent[p2] = p1;
            rank[p1]++;
        } else {
            parent[p1] = p2;
            rank[p2]++;
        }
        return 1;
    }

}
