import java.util.Scanner;
import java.util.Arrays;
public class ArrayEx {
    public static void main(String[] args)
    {
        int len,size,i;
        String val;
        String[] name = {"peter","john","rahul"};
        len = name.length;
        for(i=0; i<len;i++)
        {
            System.out.println(name[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the city array");
        size = in.nextInt();
        in.nextLine();
        String[] cities = new String[size];
        System.out.println("enter the array elements");
        for(i=0;i<size;i++){
            val = in.nextLine();
            cities[i] = val;
        }
        System.out.println(Arrays.toString(cities));
        for(String nam: name)
        {
            System.out.println(nam);
        }

    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=38461:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject ArrayEx
peter
john
rahul
Enter the size of the city array
3
enter the array elements
hjarup
chennai
hyderabad
[hjarup, chennai, hyderabad]
peter
john
rahul

Process finished with exit code 0
 */