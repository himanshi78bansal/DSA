import java.util.ArrayList;

class initialize{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(6);
        list.add(8);
        System.out.println(list);

        //get elements
        System.out.println(list.get(2));

        // delete
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2,11);
        System.out.println(list);

        // contains
        System.out.println(list.contains(7));
        System.out.println(list.contains(2));

        // size
        System.out.println(list.size());
    }
}