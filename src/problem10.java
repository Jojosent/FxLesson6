import java.util.ArrayList;
import java.util.Comparator;

public class problem10 {
    public static void main(String[] args) {
        ArrayList<Train> TrainList = new ArrayList<>();
        Train Train= new Train("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Train Train1 = new Train("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Train Train2 = new Train("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Train Train3 = new Train("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        TrainList.add(Train);
        TrainList.add(Train1);
        TrainList.add(Train2);
        TrainList.add(Train3);

        for (Train f : TrainList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
//        Collections.sort(TrainList, new sortNameTrain());
//        System.out.println(TrainList);

    }
}

class Train{
    String name;
    String surname;
    String patro;
    int birth;
    String Train;
    String faculty;
    int course;
    String group;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPatro() {
        return patro;
    }
    public void setPatro(String patro) {
        this.patro = patro;
    }
    public int getBirth() {
        return birth;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    public String getTrain() {
        return Train;
    }
    public void setTrain(String Train) {
        this.Train = Train;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }


    public Train(String name,String surname,
                   String patro,int birth,
                   String Train,String faculty,
                   int course,String group) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.Train = Train;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Train(" +
                "name:" + name +
                ", age:" + surname +
                ", link:" + birth +
                ", rating:" + Train +
                ", age:" + faculty +
                ", link:" + course +
                ", rating:" + group +
                ")";

    }
}

class sortNameTrain implements Comparator<Train> {
    @Override
    public int compare(Train s1, Train s2){
        return s1.getName().compareTo(s2.getName());
    }
}

