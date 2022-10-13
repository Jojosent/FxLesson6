import java.util.ArrayList;
import java.util.Comparator;

public class problem7 {
    public static void main(String[] args) {
        ArrayList<Phone> PhoneList = new ArrayList<>();
        Phone Phone= new Phone("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Phone Phone1 = new Phone("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Phone Phone2 = new Phone("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Phone Phone3 = new Phone("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        PhoneList.add(Phone);
        PhoneList.add(Phone1);
        PhoneList.add(Phone2);
        PhoneList.add(Phone3);

        for (Phone f : PhoneList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
//        Collections.sort(PhoneList, new sortNamePhone());
//        System.out.println(PhoneList);

    }
}

class Phone{
    String name;
    String surname;
    String patro;
    int birth;
    String phone;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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


    public Phone(String name,String surname,
                   String patro,int birth,
                   String phone,String faculty,
                   int course,String group) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Phone(" +
                "name:" + name +
                ", age:" + surname +
                ", link:" + birth +
                ", rating:" + phone +
                ", age:" + faculty +
                ", link:" + course +
                ", rating:" + group +
                ")";

    }
}

class sortNamePhone implements Comparator<Phone> {
    @Override
    public int compare(Phone s1, Phone s2){
        return s1.getName().compareTo(s2.getName());
    }
}

