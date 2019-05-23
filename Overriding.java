class Mom{
    public void eat(){
        System.out.println("Own food");
    }
}

class Baby extends Mom{
    public void eat(){
        System.out.print("Eats her special food");
    }
}

public class Overriding {
    public static void main(String[] args){
        Mom me = new Mom();
        me.eat();

        Baby saha = new Baby();
        saha.eat();
    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=44679:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Overriding
Own food
Eats her special food
Process finished with exit code 0

 */