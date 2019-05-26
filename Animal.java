abstract class Animal {
    //abstract methods
    abstract void move();
    abstract void eat();

    //concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}

class Bird extends Animal {

    void move() {
        System.out.println("Moves by flying");
    }

    void eat() {
        System.out.println("Eats Birds food");
    }
}

class Fish extends Animal {

    void move(){
        System.out.println("Moves by swimming");
    }

    void eat() {
        System.out.println("Eats sea food");
    }
}
class TestBird {
    public static void main(String[] args) {
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
    }
}


class TestFish {
    public static void main(String[] args) {
        Animal myFish = new Fish();
        myFish.label();
        myFish.move();;
        myFish.eat();
    }
}

/*

TestBird Console:
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=36461:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject TestBird
Animal's data:
Moves by flying
Eats Birds food

Process finished with exit code 0

TestFish console:
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=43625:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject TestFish
Animal's data:
Moves by swimming
Eats sea food

Process finished with exit code 0
 */