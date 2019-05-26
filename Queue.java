import java.util.*;
public class Queue {
    private int arr[];
    private int front, rear, capacity, count;

    Queue(int size){
        front = 0;
        rear = -1;
        count = 0;
        capacity = size;
        arr = new int[size];
    }

    public int size(){
        return count;
    }

    public Boolean isEmpty(){
        return (size() == 0);

    }
    public Boolean isFull(){
        return (size() == capacity);
    }

    public void enqueue(int element){
        if (isFull()) {
            System.out.println("Cannot insert item. Queue is full");
            System.exit(1);
        }
        System.out.println("Inserting "+ element);
        rear++;
        arr[rear] = element;
        count++;
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Cannot remove elements in an empty Queue");
            System.exit(1);
        }
        System.out.println("Removing "+arr[front]);
        front ++;
        count--;
    }

    public int peek(){

        if (isEmpty()){
            System.out.println("Accessing Empty Queue");
            System.exit(1);
        }
        return arr[front];
    }

    public static void main(String[] args){

        Queue q = new Queue(5);
        q.enqueue(3);
        q.enqueue(8);
        q.enqueue(17);

        System.out.println("Front element is "+ q.peek());
        q.dequeue();
        System.out.println("Front element is "+ q.peek());

        System.out.println("Queue size is" + q.size());

        q.dequeue();
        q.dequeue();
        if(q.isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.print("Queue is not empty");
        }

    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=45329:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Queue
Inserting 3
Inserting 8
Inserting 17
Front element is 3
Removing 3
Front element is 8
Queue size is2
Removing 8
Removing 17
Queue is empty

Process finished with exit code 
 */
