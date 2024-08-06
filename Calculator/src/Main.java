import java.util.Scanner;
public class Main{

    public int add(int a,int b){
        return a+b;
    }

    public int multiply(int a ,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return  a / b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public void operation(){
        Scanner sc = new Scanner(System.in);
        int operation_value = 0;
        System.out.println("Enter the First Number: ");
        int first_number = sc.nextInt();

        boolean condition_to_continue_operation = true;
        while (condition_to_continue_operation){
            System.out.println("Enter the Next Number: ");
            int second_number = sc.nextInt();
            System.out.println("Select the operand '+', '-','*','/','%': ");
            String operand = sc.next();
            if(operand.equals("+")) {
                operation_value = add(first_number, second_number);
                System.out.println(operation_value);
            }
            else if(operand.equals("*")){
                operation_value = multiply(first_number,second_number);
                System.out.println(operation_value);
            }
            else if(operand.equals("-")){
                operation_value = subtract(first_number,second_number);
                System.out.println(operation_value);
            }
            else if(operand.equals("/")){
                operation_value = divide(first_number,second_number);
                System.out.println(operation_value);
            }
            else{
                System.out.println("Invalid operand");
            }
            System.out.println("Do you want to continue y/n : ");
            String continue_or_not = sc.next();

            if((continue_or_not.equals("y")) || (continue_or_not.equals("Y"))){
                condition_to_continue_operation = true;
                first_number = operation_value;
            }
            else{
                condition_to_continue_operation = false;
            }
        }
        System.out.println("Closed");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.operation();
    }
}