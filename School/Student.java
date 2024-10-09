package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    // 'Banco'.
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Integer autoIncrementId = 1;

    // Atributos.
    private Integer id;
    private Course course;
    
    // Construtor.
    public Student(
        String name,
        String birthdate,
        String cpf,
        Integer courseId,
        ArrayList<Course> courseList
    ) {
        super(name, birthdate, cpf);
        this.id = autoIncrementId;

        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).id == courseId) {
                this.course = courseList.get(i);
                break;
            }
        }

        autoIncrementId++;
    }

    // Setters.
    public void setCourse(Course course) {
        this.course = course;
    }

    // Getters.
    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Course getCourse() {
        return this.course;
    }
    
    @Override
    public String toString() {
        return "ID: " + this.id
            + "\nName: " + this.getName()
            + "\nBirthdate: " + this.getBirthDay()
            + "\nCPF: " + this.getCPF()
            + "\nCourse: " + this.course.name;
    }


    public static void listStudents() {
        for (Student student : studentList) {
            System.out.println("--------------------------\n" + student);
        }
    }

    public static Student createStudent(Scanner scanner) {
        // Captura os campos necessários.
        String name = Utilidades.GetValues.getStringInput("Informe o nome do aluno: ", scanner);
        String birthdate = Utilidades.GetValues.getStringInput("Informe a data de nascimento do aluno: ", scanner);
        String cpf;
        do {
            cpf = Utilidades.GetValues.getStringInput("Informe o CPF do aluno: ", scanner);
            if (!Utilidades.DataValidation.isValidCPF(cpf)) {
                System.out.println("CPF inválido. Tente novamente.");
            }
        } while (!Utilidades.DataValidation.isValidCPF(cpf));
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