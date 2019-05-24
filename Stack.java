public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

    public void push(long val){
        stackArray[++top] = val;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public static void main(String[] args){
        Stack myStack = new Stack(10);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        while(!myStack.isEmpty())
        {
            long num = myStack.pop();
            System.out.print(num + " ");
        }
    }
}
/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=37907:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Stack
40 30 20 10
Process finished with exit code 0
*/
