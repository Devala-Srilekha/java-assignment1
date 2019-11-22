package omniwyse.Assignments;
import java.util.Stack;
class Main {

	public static void main(String[] args) {
        Stack<String> animals= new Stack();
        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
       
        int position= animals.search("horse");
        System.out.println("position of horse:"+position);
    }
}
