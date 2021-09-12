public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        // System.out.println(project1.getName());
        // System.out.println(project1.getDesc());
        // System.out.println(project1.elevatorPitch());

        Project project2 = new Project("Ashley's Project");
        // System.out.println(project2.getName());
        // System.out.println(project2.getDesc());
        // System.out.println(project2.elevatorPitch());

        Project project3 = new Project("Geoff's Project", "A really cool project");
        System.out.println(project3.elevatorPitch());
        project3.setName("SpaceX");
        project3.setDesc("A new program to launch rockets");
        System.out.println(project3.getName());
        System.out.println(project3.getDesc());
    }
}