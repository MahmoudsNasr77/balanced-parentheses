// balanced-parentheses


import java.util.Scanner;
import java.util.Stack;

public class Hello {
    public static boolean ArePair(char open ,char close){
        if (open=='('&&close==')'){
            return true;
        }else if (open=='{'&&close=='}'){
            return true;
        }else if (open=='['&&close==']'){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isTrue(String exp){
        Stack<Character> stk= new Stack<>(); 
        for (int i=0;i<exp.length();i++){
            if (exp.charAt(i)=='('||exp.charAt(i)=='{'||exp.charAt(i)=='['){
                stk.push(exp.charAt(i));
            }else if(exp.charAt(i)==')'||exp.charAt(i)=='}'||exp.charAt(i)==']') {
                if (stk.empty()||!ArePair(stk.lastElement(), exp.charAt(i))){
                    return false;
                }else {
                    stk.pop();
                }
            }
        }
        
            if (stk.empty()){
                return true;
            }else return false;
    }

    static int b=0;
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       
        String str= s.nextLine();
       if (isTrue(str)){
           System.out.println("Yes");
       }else {
           System.out.println("No");
       }
        
 
    }

   
    

}
