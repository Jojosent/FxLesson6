import java.util.ArrayList;
import java.util.Comparator;

public class problem8 {
    public static void main(String[] args) {
        ArrayList<Car> CarList = new ArrayList<>();
        Car Car= new Car("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Car Car1 = new Car("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Car Car2 = new Car("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Car Car3 = new Car("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        CarList.add(Car);
        CarList.add(Car1);
        CarList.add(Car2);
        CarList.add(Car3);

        for (Car f : CarList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
//        Collections.sort(CarList, new sortNameCar());
//        System.out.println(CarList);

    }
}

class Car{
    String name;
    String surname;
    String patro;
    int birth;
    String Car;
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
    public String getCar() {
        return Car;
    }
    public void setCar(String Car) {
        this.Car = Car;
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


    public Car(String name,String surname,
                   String patro,int birth,
                   String Car,String faculty,
                   int course,String group) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.Car = Car;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Car(" +
                "name:" + name +
                ", age:" + surname +
                ", link:" + birth +
                ", rating:" + Car +
                ", age:" + faculty +
                ", link:" + course +
                ", rating:" + group +
                ")";

    }
}

class sortNameCar implements Comparator<Car> {
    @Override
    public int compare(Car s1, Car s2){
        return s1.getName().compareTo(s2.getName());
    }
}

