class Poly1 {
    public void fly(){
        System.out.println("Bird is flying.");
    }
    public void fly(int height){
        System.out.println("Bird is flying " + height + " feets high." );
    }
    public void fly(String name,int height){
        System.out.println("The "+ name + " is flying " +height + " feets high." );
    }
}

public class Overloading{
    public static void main(String[] args){
        Poly1 polyobj = new Poly1();
        polyobj.fly();
        polyobj.fly(12);
        polyobj.fly("Eagle", 12);
    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=35947:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Overloading
Bird is flying.
Bird is flying 12 feets high.
The Eagle is flying 12 feets high.

Process finished with exit code 0

 */