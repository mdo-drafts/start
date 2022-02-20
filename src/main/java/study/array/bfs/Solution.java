package study.array.bfs;

import java.util.*;

public class Solution {

    int h;
    int l;
    boolean[][] visited;

    int dRow[] = {-1, 0, 1, 0};
    int dCol[] = {0, 1, 0, -1};


    public List<Integer> bfs(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        h = matrix.length;
        l = matrix[0].length;
        visited = new boolean[h][l];

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));

        while (!queue.isEmpty()) {

            Pair pair = queue.poll();
            result.add(matrix[pair.i][pair.j]);

            for (int i = 0; i < dRow.length; i++) {
                int adjI = pair.i + dRow[i];
                int adjJ = pair.j + dCol[i];
                if (isValid(adjI, adjJ)) {
                    visited[adjI][adjJ] = true;
                    queue.add(new Pair(adjI, adjJ));
                }
            }
        }
        return result;
    }

    boolean isValid(int i, int j) {
        if (i < 0 || j < 0 || j >= l || i >= h) {
            return false;
        }

        if (visited[i][j]) {
            return false;
        }
        return true;
    }
}


//https://www.geeksforgeeks.org/breadth-first-traversal-bfs-on-a-2d-array/

class Pair {

    int i;

    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return i == i &&
                j == j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}

/*

Approach: Follow the steps below to solve the problem:

Initialize the direction vectors dRow[] = {-1, 0, 1, 0} and dCol[] = {0, 1, 0, -1} and a queue of pairs to store the indices of matrix cells.
Start BFS traversal from the first cell, i.e. (0, 0), and enqueue the index of this cell into the queue.
Initialize a boolean array to mark the visited cells of the matrix. Mark the cell (0, 0) as visited.
Declare a function isValid() to check if the cell coordinates are valid or not,
i.e lies within the boundaries of the given Matrix and are unvisited or not.
Iterate while the queue is not empty and perform the following operations:
Dequeue the cell present at the front of the queue and print it.
Move to its adjacent cells that are not visited.
Mark them visited and enqueue them into the queue.


 */