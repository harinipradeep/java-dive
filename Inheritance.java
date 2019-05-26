class Birds{
    public String covers = "feather";
    public String reproduce = "eggs";

    public void flyUp(){
        System.out.println("Flying upp...");
    }
}

class Sparrow extends Birds{
    public String name="sparrow";
}

public class Inheritance {
    public static void main(String[] args){
        Sparrow spa = new Sparrow();
        System.out.println("Bird "+ spa.name+ " will reproduce "+ spa.reproduce+ " and has "+ spa.covers);
        spa.flyUp();
    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=43237:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Inheritance
Bird sparrow will reproduce eggs and has feather
Flying upp...

Process finished with exit code 0
 */