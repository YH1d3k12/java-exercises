package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String name;
    public Integer workload;
    public Teacher teacher;
    // Lista.
    private static ArrayList<Course> courseList = new ArrayList<>();
    
    // Construtor.
    public Course(
        String name,
        Integer workload,
        Integer teacherId,
        ArrayList<Teacher> teacherList
    ) {
        this.id = autoIncrementId;
        this.name = name;
        this.workload = workload;

        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).id == teacherId) {
                this.teacher = teacherList.get(i);
                break;
            }
        }

        autoIncrementId++;
    }

    public String toString() {
        return (
            "ID: " + id +
            "\nName: " + name +
            "\nWorkload: " + workload +
            "\nTeacher: " + teacher.name
        );
    }

    public static ArrayList<Course> getCourseList() {
        return courseList;
    }

    public static void listCoursesToMe() {
        for (Course course : courseList) {
            System.out.println("--------------------------\n" + course);
        }
    }

    public static Course createCourse(Scanner scanner) {
        // Captura os campos necessários.
        String name = Utilidades.GetValues.getStringInput("Informe o nome do curso: ", scanner);
        Integer workload = Utilidades.GetValues.getIntInput("Informe a carga horaria: ", scanner);
        Integer teacherId = Utilidades.GetValues.getIntInput("Informe o id do professor: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Course newCourse = new Course(
            name, 
            workload,
            teacherId,
            Teacher.getTeacherList()
        );
        courseList.add(newCourse);
        return newCourse;
    }

    // Adiciona dados a lista de cursos para agilizar os testes.
    public static void mockCourseData() {
        Course newCourse;

        newCourse = new Course(
            "Academy of Ideas",
            160,
            1,
            Teacher.getTeacherList()
        );
        courseList.add(newCourse);

        newCourse = new Course(
            "How to Build a kingdom from Scratch",
            420,
            2,
            Teacher.getTeacherList()
        );
        courseList.add(newCourse);

        newCourse = new Course(
            "The Hidden Power of Herbs",
            420,
            3,
            Teacher.getTeacherList()
        );
        courseList.add(newCourse);

        newCourse = new Course(
            "Clarinet Master Class",
            420,
            4,
            Teacher.getTeacherList()
        );
        courseList.add(newCourse);
    }
}