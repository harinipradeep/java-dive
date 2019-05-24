import java.io.InputStream;
import java.util.Scanner;
public class Summation {
    public static void main(String[] args){
        int n, val, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of elements :");
        n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the number to add");
            val = in.nextInt();
            in.nextLine();
            sum = sum +val;
        }
        System.out.println("The sum is " +sum);

    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=46879:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Summation
Enter the total number of elements :
4
Enter the number to add
2
Enter the number to add
3
Enter the number to add
1
Enter the number to add
5
The sum is 11

Process finished with exit code 0
 */