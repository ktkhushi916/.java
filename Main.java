import java.util.Scanner;
class StackOverflowException extends Exception{
    StackOverflowException(String msg){
        super(msg);
    }
}
class StackUnderflowException extends Exception{
    StackUnderflowException(String msg){
        super(msg);
    }
}
class Stack{
    int size;
    float stk[];
    int top;
    Stack(int size){
        this.size=size;
        top=-1;
        stk=new float[size];
    }
    public void push(float value) throws StackOverflowException{
        if(top==this.size-1){
            throw new StackOverflowException("Stack is full");

        }
        else{
            stk[++top]=value;
        }
    }

    public float pop() throws StackUnderflowException{
        if(top==-1){
            throw new StackUnderflowException("Stack is empty");
        }
        else{
            return stk[top--];
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty.No elements to display");
        }
        else{
            System.out.println("Elememts are ");
            for(int i=top;i>=0;i--){
                System.out.println(stk[i]);
            }
        }
    }
}
public class Main {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elelments in the stack :");
        int n=s.nextInt();
        Stack st=new Stack(n);
        int ch;
        while(true){
            System.out.println("1.push 2.pop 3.display");
            System.out.println("Enter the choice : ");
            ch=s.nextInt();
            try{
                switch(ch){
                    case 1:System.out.println("Enter the value to push : ");
                           float val=s.nextFloat();
                           st.push(val);
                           System.out.println(val+"pushed to stack");
                           break;
                    case 2:float popped=st.pop();
                           System.out.println("Popped: "+popped); 
                           break;
                    case 3:st.display();
                           break;
                    default:System.out.println("Invalid choice ");

                }
            }
            catch(StackOverflowException | StackUnderflowException e){
                System.out.println(e.getMessage());
            }
        }

    }
    
}
