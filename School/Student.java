package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String name;
    public String birthdate;
    public String cpf;
    public Course course;
    // Lista.
    private static ArrayList<Student> studentList = new ArrayList<>();
    
    // Construtor.
    public Student(
        String name,
        String birthdate,
        String cpf,
        Integer courseId,
        ArrayList<Course> courseList
    ) {
        this.id = autoIncrementId;
        this.name = name;
        this.birthdate = birthdate;
        this.cpf = cpf;

        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).id == courseId) {
                this.course = courseList.get(i);
                break;
            }
        }

        autoIncrementId++;
    }

    public String toString() {
        return (
            "ID: " + id +
            "\nName: " + name +
            "\nBirthdate: " + birthdate +
            "\nCPF: " + cpf + 
            "\nCourse: " + course.name
        );
    }

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    public static void listStudentsTome() {
        for (Student student : studentList) {
            System.out.println("--------------------------\n" + student);
        }
    }

    public static Student createStudent(Scanner scanner) {
        // Captura os campos necessários.
        String name = Utilidades.GetValues.getStringInput("Informe o nome do aluno: ", scanner);
        String birthdate = Utilidades.GetValues.getStringInput("Informe a data de nascimento do aluno: ", scanner);
        String cpf = Utilidades.GetValues.getStringInput("Informe o cpf do aluno: ", scanner);
        Integer courseId = Utilidades.GetValues.getIntInput("Informe o id do curso: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Student newStudent = new Student(
            name, 
            birthdate,
            cpf,
            courseId,
            Course.getCourseList()
        );
        studentList.add(newStudent);
        return newStudent;
    }

    // Adiciona dados a lista de cursos para agilizar os testes.
    public static void mockStudentData() {
        Student newStudent;

        newStudent = new Student(
            "Loki Landrunner",
            "04/03/1984",
            "888.888.888-88",
            1,
            Course.getCourseList()
        );
        studentList.add(newStudent);

        newStudent = new Student(
            "Palpatine",
            "06/06/1966",
            "340.253.436-11",
            2,
            Course.getCourseList()
        );
        studentList.add(newStudent);

        newStudent = new Student(
            "Edward Elric",
            "03/02/1899",
            "054.283.412-10",
            3,
            Course.getCourseList()
        );
        studentList.add(newStudent);

        newStudent = new Student(
            "Ludwig van Beethoven",
            "16/12/1770",
            "961.234.563-43",
            4,
            Course.getCourseList()
        );
        studentList.add(newStudent);
    }
}