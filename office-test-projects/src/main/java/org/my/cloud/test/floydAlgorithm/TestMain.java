package org.my.cloud.test.floydAlgorithm;


/**
 * @Description
 * @Author Liq
 * @Date 2020-08-06 15:57
 */
public class TestMain {

    /**
     * @desc 弗洛伊德算法
     * @Author xw
     * @Date 2019/10/8
     */

        public static void main(String[] args) {
            char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
            int[][] matrix = new int[vertex.length][vertex.length];
            final int N = 65535;
            matrix[0] = new int[]{0, 5, 7, N, N, N, 2};
            matrix[1] = new int[]{5, 0, N, 9, N, N, 3};
            matrix[2] = new int[]{7, N, 0, N, 8, N, N};
            matrix[3] = new int[]{N, 9, N, 0, N, 4, N};
            matrix[4] = new int[]{N, N, 8, N, 0, 5, 4};
            matrix[5] = new int[]{N, N, N, 4, 5, 0, 6};
            matrix[6] = new int[]{2, 3, N, N, 4, 6, 0};
//            FloydGraph graph = new FloydGraph(vertex.length, matrix, vertex);
//            graph.floyd();
//            graph.show();
        }

}
