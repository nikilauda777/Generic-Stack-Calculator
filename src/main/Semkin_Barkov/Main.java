package Semkin_Barkov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Assignment3 test = new Assignment3();
        Assignment3 test1 = new Assignment3();


        ConstantArray stack = new ConstantArray();
        LinkedList nodes = new LinkedList();


        nodes.push(1.3);
        nodes.push(2.3);
        nodes.push(3.3);
        nodes.push(4.3);
        nodes.push(5.3);
        nodes.push(6.3);

        //System.out.println(nodes.lastElement());

        stack.push(2.2);
        stack.push(3.2);
        stack.push(4.2);
        stack.push(5.2);
        stack.push(6.2);
        //System.out.println(stack.lastElement());




        String[] input = new String[]{"1.5", "2", "+", "3", "4", "-", "*"}; // our input  // -3.5
        String[] input1 = new String[]{"5", "0", "/", "8", "*"};  // 80
        String[] input2 = new String[]{"3", "5", "3", "*", "-"}; // -12
        String[] input3 = new String[]{"3", "3", "5", "*", "+"}; // 18
        String[] input4 = new String[]{"2", "2", "+", "5", "*"}; // 20


        System.out.println("Example to Calculate :");

        System.out.println(Arrays.toString(input).replace("[","").replace("]"," ="));
        System.out.println(test1.calc(input, test.getArrayStack()));



    }
}
