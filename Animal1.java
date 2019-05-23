interface Animal1 {
    public void eat();

    public void sound();
}

interface Bird1 {
    int numberOfLegs = 2;
    String outerCovering = "feather";

    public void fly();
}

class Eagle1 implements Animal1, Bird1 {
    public void eat() {
        System.out.println("Eats reptiles");
    }

    public void sound() {
        System.out.println("whistles");
    }


    public void fly() {
        System.out.println("Flies high");
    }
}

class TestEagle {
    public static void main(String[] args) {
        Eagle1 myEagel = new Eagle1();

        myEagel.eat();
        myEagel.sound();
        myEagel.fly();

        System.out.println("no. of legs " + Bird1.numberOfLegs);
        System.out.println("outer covering " + Bird1.outerCovering);
    }
}
/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=43207:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject TestEagle
Eats reptiles
whistles
Flies high
no. of legs 2
outer covering feather

Process finished with exit code 0
 */