import java.util.*;
import java.util.LinkedList;

public class Collectionss {
    public static void main(String[] args){
        List l1 = new ArrayList();
        l1.add("Malmo");
        l1.add("Lund");
        l1.add("Hjarup");
        System.out.println("Array List elements :"+ l1);
        List l2 = new LinkedList();
        l2.add("Chennai");
        l2.add("Bglr");
        System.out.println("Linked List elements :" + l2);
        Set s1 = new HashSet();
        s1.add("India");
        s1.add("Sweden");
        System.out.println("Hash set elements :" + s1);
        Map m1 = new HashMap();
        m1.put("Java", "9");
        m1.put("Python","9");
        System.out.println("Hash Map elements :" +m1);
    }
}
/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=34169:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Collectionss
Array List elements :[Malmo, Lund, Hjarup]
Linked List elements :[Chennai, Bglr]
Hash set elements :[Sweden, India]
Hash Map elements :{Java=9, Python=9}

Process finished with exit code 0

 */