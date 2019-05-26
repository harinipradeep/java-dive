//Implementation of Linked List
public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node nxt;

        //Constructor
        Node(int d){
            data =d;
        }
    }

    public static LinkedList insert(LinkedList list, int data){

        Node new_node = new Node(data);
        new_node.nxt = null;

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.nxt != null){
                last = last.nxt;
            }
            last.nxt = new_node;
        }
        return  list;
    }

    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.println("Linked List : ");

        while(currNode != null){
            System.out.println(currNode.data + " ");
            currNode = currNode.nxt;
        }
    }

    public static LinkedList deleteList(LinkedList list,int index){
        Node currNode = list.head, prev = null;

        if(index==0 && currNode != null){
            list.head = currNode.nxt;
            System.out.println(index + " position element deleted");
            return list;
        }

        int counter = 0;
        while(currNode != null){
            if(counter == index){
                prev.nxt = currNode.nxt;
                System.out.println(index +" position element deleted.");
                break;
            }
            else{
                prev = currNode;
                currNode = currNode.nxt;
                counter++;
            }
        }
        if(currNode == null){
            System.out.println(index + " position cannot be found");
        }
        return list;
    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        printList(list);
        deleteList(list,0);
        printList(list);
        deleteList(list, 2);
        printList(list);
        deleteList(list,10);
        printList(list);
    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=35673:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject LinkedList
Linked List :
1
2
3
4
5
0 position element deleted
Linked List :
2
3
4
5
2 position element deleted.
Linked List :
2
3
5
10 position cannot be found
Linked List :
2
3
5

Process finished with exit code 0

 */