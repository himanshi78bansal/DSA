import java.util.ArrayList;;
public class Tables {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> table1 = new ArrayList<>();
        ArrayList<Integer> table2 = new ArrayList<>();
        ArrayList<Integer> table3 = new ArrayList<>();

        for(int i = 0; i<=5; i++){
            table1.add(1*i);
            table2.add(2*i);
            table3.add(3*i);
        }
        mainList.add(table1);
        mainList.add(table3);
        mainList.add(table2);

        System.out.println(mainList);
        
        for(int i = 0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
