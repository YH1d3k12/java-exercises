package School;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.regex.Pattern;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
        LocalDate birthdate,
        String cpf,
        Integer courseId,
        ArrayList<Course> courseList
    ) {
        this.id = autoIncrementId;
        this.name = name;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.birthdate = LocalDate.parse(birthdate, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Formato esperado: dd/MM/yyyy");
        }

        this.cpf = cpf;

        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).id == courseId) {
                this.course = courseList.get(i);
                break;
            }
        }

        autoIncrementId++;
    }

    public int getAge() {
        if (birthdate !== null) {
            return Period.between(birthdate, LocalDate.now()).getYears();
        }
    }

     public static boolean isValidCPF(String cpf) {
        // Remove caracteres não numéricos.
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se tem 11 dígitos.
        if (cpf.length() != 11) {
            return false;
        }
        else {
            return true;
        }
    }

    public String toString() {
        return (
            "ID: " + id +
            "\nName: " + name +
            "\nAge: " + getAge(birthdate) +
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
        String cpf;
        do {
            cpf = Utilidades.GetValues.getStringInput("Informe o CPF do aluno: ", scanner);
            if (!isValidCPF(cpf)) {
                System.out.println("CPF inválido. Tente novamente.");
            }
        } while (!isValidCPF(cpf));
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