import java.util.LinkedList;

/*
instead of dictating how we store items, stacks dictates what operations we can do on items
so a stack is an abstract data type
LIFO-las in first out
push-adds an item as the top item to the stack
pop-removes the top item from the stack
peek-gets the top item on the stack without popping it
ideally used with linked list
 */
public class Main {

    public static void main(String[] args) {
        //stack using arrays
        //ArrayStack stack = new ArrayStack(10);
//
//        stack.push(new Employee("Jane", "Jones", 123));
//        stack.push(new Employee("John", "Doe", 4567));
//        stack.push(new Employee("Mary", "Smith", 22));
//        stack.push(new Employee("Mike", "Wilson", 3245));
//        stack.push(new Employee("Bill", "End", 78));

//code associated to using stack with arrays
//        //stack.printStack();
//
//        System.out.println(stack.peek());
//        //stack.printStack();
//
//        System.out.println("Popped: " + stack.pop());
//        System.out.println(stack.peek());

        //using stack with linked list
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 123);
        Employee spiderMan = new Employee("Spider", "Man", 123);
        Employee wonderWoman = new Employee("Wonder", "Woman", 123);
        Employee peterParker = new Employee("Peter", "Parker", 123);


        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(spiderMan);
        stack.push(wonderWoman);
        stack.push(peterParker);

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        //practical use of a stack: check if word is a palindrome
        System.out.println(checkPalindrome("radar"));
        System.out.println(checkPalindrome("plant"));
        System.out.println(checkPalindrome("I did, did I?"));

    }

    public static boolean checkPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }

        }
        //pop all the charaters off the stack and make another string builder
        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        return reverseString.toString().equals(stringNoPunctuation.toString());

    }
}
