import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");

        myList.add("three");

        myList.add("four");
        myList.add("five");
        myList.add("six");


        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i);
            myList.remove(i);
        }

    }

}
