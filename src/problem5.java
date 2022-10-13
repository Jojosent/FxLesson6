import java.util.ArrayList;
import java.util.Comparator;

public class problem5 {
    public static void main(String[] args) {
        ArrayList<Book> BookList = new ArrayList<>();
        Book Book= new Book("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Book Book1 = new Book("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Book Book2 = new Book("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Book Book3 = new Book("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        BookList.add(Book);
        BookList.add(Book1);
        BookList.add(Book2);
        BookList.add(Book3);

        for (Book f : BookList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
//        Collections.sort(BookList, new sortNameBook());
//        System.out.println(BookList);

    }
}

class Book{
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


    public Book(String name,String surname,
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
        return "Book(" +
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

class sortNameBook implements Comparator<Book> {
    @Override
    public int compare(Book s1, Book s2){
        return s1.getName().compareTo(s2.getName());
    }
}

