import java.util.Scanner;
public class Fibonnaci{
    public static void main(String[] args) {
        int first =0, second =1;
        int len, sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of elements in the Fibonacci Series");
        len = in.nextInt();
        in.nextLine();
        System.out.printf("Fibonacci series :\n%d\n%d\n",first,second);
        for(int i=0; i<(len-2); i++)
        {
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=35789:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Fibonnaci
Enter the total number of elements in the Fibonacci Series
7
Fibonacci series :
0
1
1
2
3
5
8

Process finished with exit code 0
 */
