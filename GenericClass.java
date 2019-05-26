public class GenericClass<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args){
        GenericClass<Integer> intvalues = new GenericClass<Integer>();
        GenericClass<String> strvalues = new GenericClass<String>();
        intvalues.add(10);
        strvalues.add("Hi I am here");
        System.out.printf("Int value : %d \n",intvalues.get());
        System.out.printf("String value : %s \n",strvalues.get());
    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=42217:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject GenericClass
Int value : 10
String value : Hi I am here

Process finished with exit code 0
 */