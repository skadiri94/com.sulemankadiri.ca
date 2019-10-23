public abstract class Student implements Categorizable {

    private String name;
    private int age;

    public Student(){

        this("Unknon Name",0);
    }

    public Student(String name, int age){

        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return String.format("Name: %s\nAge: %d",getName(),getAge());
    }

    public abstract void  setCategory(String category);



    public abstract String getCategory();
}
