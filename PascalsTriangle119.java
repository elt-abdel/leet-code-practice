import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle119 {

    public static void main(String [] args){
        System.out.println(getRow(9));
    }

    public static List<Integer> getRow(int rowIndex){

        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        finalList.add(firstRow);

        for (int i=1; i<=rowIndex; i++){
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

        return finalList.get(finalList.size()-1);

    }

    
}
