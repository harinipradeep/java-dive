public class Generics {
    public static < E > void printArray(E[] inputArray){
        for(E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer[] intArray = {1,2,6,4};
        Double[] doubArray = {1.6, 3.6, 4.9};
        String[] strArray = {"CHE","BLR"};
        System.out.println("Integer Array elements:");
        printArray(intArray);
        System.out.println("Double Array elements:");
        printArray(doubArray);
        System.out.println("String Array elements:");
        printArray(strArray);
    }
}
/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=36769:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Generics
Integer Array elements:
1 2 6 4
Double Array elements:
1.6 3.6 4.9
String Array elements:
CHE BLR

Process finished with exit code 0
 */