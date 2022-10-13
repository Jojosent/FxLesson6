import java.util.ArrayList;

public class problem1 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student student = new Student("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Student student1 = new Student("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Student student2 = new Student("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Student student3 = new Student("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student f : studentList) {
//            System.out.println(f.getFaculty()+" "+f.getGroup());
        if (f.getBirth()<=2005){
            System.out.println(f);
        }
            if (f.getBirth()>2005){
                break;
            }
        }

    }
}

class Student {
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


    public Student(String name,String surname,
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
        return "Student(" +
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

