package HIbernate;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    int mark;

    public Student () {

    }
    public Student (int id, String name, int age, String gender, int mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", gender=" + gender + ", mark=" + mark;
    }
}
