import java.util.*;

class problem {
    public static /*List<List<Integer>>*/ void groupThePeople(int[] groupSizes) {
        List<List<Integer>> mainlst = new ArrayList<>();

        HashMap <Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i<groupSizes.length; i++){
            if(! map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }
            if(map.get(groupSizes[i]).size()>=3){
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i); 
        }

        // for(int key:map.keySet()){
        //     if(map.get(key).size()>3){

        //     }
        // }

        System.out.println(map);
    }

    public static void main(String[] args) {
        int groupSizes[] = {3,3,3,3,3,1,3};
        groupThePeople(groupSizes);
    }
}


// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> v = new ArrayList<>();
//         v.add(3);
//         v.add(3);
//         v.add(3);
//         v.add(3);
//         v.add(3);
//         v.add(3);
//         v.add(1);
//         v.add(5);

//         Map<Integer, List<Integer>> m = new HashMap<>();

//         for (int i = 0; i < v.size(); i++) {
//             int key = v.get(i);
//             if (!m.containsKey(key)) {
//                 m.put(key, new ArrayList<>());
//             }
//             m.get(key).add(i);
//         }

//         for (Map.Entry<Integer, List<Integer>> entry : m.entrySet()) {
//             System.out.print(entry.getKey() + ": ");
//             for (int k : entry.getValue()) {
//                 System.out.print(k + " ");
//             }
//             System.out.println();
//         }
//     }
// }
