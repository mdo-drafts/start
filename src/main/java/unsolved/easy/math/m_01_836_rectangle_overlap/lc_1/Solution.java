package unsolved.easy.math.m_01_836_rectangle_overlap.lc_1;

public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
}


/*
Before we do it in 2D plane, let's try it in 1D.
Given 2 segment (left1, right1), (left2, right2), how can we check whether they overlap?
If these two intervals overlap, it should exist an number x,

left1 < x < right1 && left2 < x < right2

left1 < x < right2 && left2 < x < right1

left1 < right2 && left2 < right1

This is the sufficient and necessary condition for two segments overlap.

Explanation:

For 2D, if two rectancle overlap both on x and y, they overlap in the plane.



 */