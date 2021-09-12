public class Project {
    private String name; 
    private String description;

    public String elevatorPitch() {
        return this.name + ": " + this.description;
    }
    
    public Project() {
        this.name = "Please provide a name";
        this.description = "Please provide a description";
    }

    public Project(String name) {
        this.name = name;
        this.description = "Please provide a description";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public void setDesc(String description) {
        this.description = description;
    }
}