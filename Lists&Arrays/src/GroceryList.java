import java.util.ArrayList;

public class GroceryList {
    //an arraylist holds objects in this case ot type string
    //the arraylist is actually a class, hence the () after declaration
    private ArrayList<String> groceryList = new ArrayList<String>();

    //method to add items to the list
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //to avoid repeating code I will have to change the findItem method
    //check for existence of the current item and then modify
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    //made private to force the proper methods to be used
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    /*
        public int findItem(String searchItem){
            //boolean exists = groceryList.contains(searchItem);
            int position = groceryList.indexOf(searchItem);
            if (position>=0){
                return  groceryList.get(position);
            }
            return null;
        }
        */
    private int findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);

        return position >= 0;

    }
}
