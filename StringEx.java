import java.util.Arrays;
public class StringEx {
    public static void main(String[] args)
    {
        String name = "Harini";
        char letter = name.charAt(0);
        System.out.println(letter);
        name = name.replace("Harini","Hani");
        System.out.println(name);
        System.out.println(Arrays.toString(args));
    }
}
/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=42211:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject StringEx
H
Hani
[]

Process finished with exit code 0

 */