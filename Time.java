import static java.lang.System.out;
public class Time {
    private int hour, minute;
    private double second;
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }
    public Time(int hour,int minute, double second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return String.format("%02d:%02d:%04.1f",this.hour,this.minute,this.second);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public static void main(String[] args)
    {
        Time currtime = new Time(13,20,04);
        String t = currtime.toString();
        System.out.println(t);

    }
}

/*
/usr/lib/jvm/java-12-oracle/bin/java -javaagent:/opt/idea-IC-191.7141.44/lib/idea_rt.jar=33377:/opt/idea-IC-191.7141.44/bin -Dfile.encoding=UTF-8 -classpath /home/harini/IdeaProjects/myproject/out/production/myproject Time
13:20:04.0

Process finished with exit code 0
 */