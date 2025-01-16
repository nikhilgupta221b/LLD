package UML;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors() {
        for (Professor p : professors) {
            System.out.println(p.getName());
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Professor p1 = new Professor("John");
        Professor p2 = new Professor("Jane");

        List<Professor> professors = new ArrayList<Professor>();
        professors.add(p1);
        professors.add(p2);

        Department department = new Department("CSE", professors);

        department.showProfessors();
    }

}
