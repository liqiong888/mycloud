package org.my.cloud.test.floydAlgorithm.model;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-06 15:58
 */
public class FloydGraph {

    private int lens;

    private int[][] matrix;

    private char[] vertex;

    public FloydGraph(int lens, int[][] matrix, char[] vertex) {
        this.lens = lens;
        this.vertex = vertex;
        this.matrix = matrix;
    }

    public int getLens() {
        return lens;
    }

    public void setLens(int lens) {
        this.lens = lens;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public char[] getVertex() {
        return vertex;
    }

    public void setVertex(char[] vertex) {
        this.vertex = vertex;
    }
}
