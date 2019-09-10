package datastructures.stack;

public class Test {

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(2);
        stack.push(new String("saba"));
        stack.push(new String("alimamad"));
        System.out.println(stack.pop().toString());

    }

}
