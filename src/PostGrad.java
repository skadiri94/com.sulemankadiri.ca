public class PostGrad extends Student {

    private String supervisor;
    private String category;



    public PostGrad(String name, int age, String supervisor){
        super(name,age);
        setSupervisor(supervisor);
        setCategory(category);

    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return super.toString() + "\n" + String.format("Supervisor: %s\nCategory: ",getSupervisor(),getCategory());
    }
}
