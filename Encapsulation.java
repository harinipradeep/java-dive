class Human {
    private String name;
    private int weight;

    //getter methods
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    //setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Human myHuman = new Human();
        myHuman.setName("Julie");
        myHuman.setWeight(50);
        System.out.println("Name is "+ myHuman.getName());
        System.out.println("weight is "+ myHuman.getWeight());

    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=36599:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Encapsulation
Name is Julie
weight is 50

Process finished with exit code 0
 */

