package solved.medium.backtrack.bt_02_797_all_paths_from_source_to_target;

import org.junit.Test;
import unsolved.medium.backtrack.bt_02_797_all_paths_from_source_to_target.Solution;

import java.util.List;

import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};

        List<List<Integer>> actual = sut.allPathsSourceTarget(graph);

        List<List<Integer>> expected = asList(
                asList(0,4),
                asList(0,3,4),
                asList(0,1,3,4),
                asList(0,1,2,3,4),
                asList(0,1,4)
        );

        assertEquals(expected, actual);
    }
}