import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Footabller> footabllerList = new ArrayList<>();
        Footabller footabller = new Footabller("Ronaldo", 37, "Ronaldo@gmail.com", 92);
        Footabller footabller2 = new Footabller("Messi", 36, "Messi@gmail.com", 93);
        Footabller footabller3 = new Footabller("Zlatan", 35, "Zlatan@gmail.com", 88);
        Footabller footabller4 = new Footabller("Bale", 35, "Bale@gmail.com", 89);
        Footabller footabller5 = new Footabller("Neymar", 27, "Neymar@gmail.com", 87);
        Footabller footabller6 = new Footabller("Mbappe", 25, "Mbappe@gmail.com", 89);
        Footabller footabller7 = new Footabller("Halland", 26, "Halland@gmail.com", 90);
        Footabller footabller8 = new Footabller("Felix", 32, "Felix@gmail.com", 91);
        Footabller footabller9 = new Footabller("Aspas", 33, "Aspas@gmail.com", 85);
        Footabller footabller10 = new Footabller("Ramos", 34, "Ramos@gmail.com", 88);
        Footabller footabller11 = new Footabller("Casemiro", 28, "Casemiro@gmail.com", 91);
        Footabller footabller12 = new Footabller("Mane", 35, "Mane@gmail.com", 85);


        footabllerList.add(footabller);
        footabllerList.add(footabller2);
        footabllerList.add(footabller3);
        footabllerList.add(footabller4);
        footabllerList.add(footabller5);
        footabllerList.add(footabller6);
        footabllerList.add(footabller7);
        footabllerList.add(footabller8);
        footabllerList.add(footabller9);
        footabllerList.add(footabller10);
        footabllerList.add(footabller11);
        footabllerList.add(footabller12);
//        for (Footabller f : footabllerList) {
//            System.out.println(f);
//        }
        Collections.sort(footabllerList, new sortAge());
        System.out.println(footabllerList+"\n");

        Collections.sort(footabllerList, new sortRating());
        System.out.println(footabllerList+"\n");

        Collections.sort(footabllerList, new sortName());
        System.out.println(footabllerList+"\n");
    }
}

class Footabller {
    String name;
    int age;
    String link;
    int rating;

    public Footabller(String name, int age, String link, int rating) {
        this.name = name;
        this.age = age;
        this.link = link;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\n"+"Fotabaler(" +
                "name:" + name +
                ", age:" + age +
                ", link:" + link +
                ", rating:" + rating +
                ")";

    }
}
class sortAge implements Comparator<Footabller>{
    @Override
    public int compare(Footabller s1, Footabller s2){
        if(s1.getAge()==s2.getAge())
            return 0;
        if(s1.getAge()>s2.getAge())
            return 1;
        else
            return -1;
    }
}

class sortRating implements Comparator<Footabller>{
    @Override
    public int compare(Footabller s1, Footabller s2){
        if(s1.getRating()==s2.getRating())
            return 0;
        if(s1.getRating()>s2.getRating())
            return 1;
        else
            return -1;
    }
}
class sortName implements Comparator<Footabller>{
    @Override
    public int compare(Footabller s1, Footabller s2){
        return s1.getName().compareTo(s2.getName());
    }
}
