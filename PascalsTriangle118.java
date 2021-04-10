import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

    //https://leetcode.com/problems/pascals-triangle/

    public static void main(String[] args) {

        // testing our example
        // int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 7;

        System.out.println(generate(n));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        finalList.add(firstRow);

        for (int i=1; i<numRows; i++){
            List<Integer> prevRow = finalList.get(i-1);
            List<Integer> curRow = new ArrayList<>();

            //adding one to the new row because every row begins with a one
            curRow.add(1);

            for (int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j-1) + prevRow.get(j));     
            }

            //adding the last one because every row ends with a one
            curRow.add(1);
            finalList.add(curRow);
        }

        return finalList;
    }

}
