package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String name;
    public String department;
    // Lista.
    private static ArrayList<Teacher> teacherList = new ArrayList<>();
    
    // Construtor.
    public Teacher(
        String name,
        String department
    ) {
        this.id = autoIncrementId;
        this.name = name;
        this.department = department;

        autoIncrementId++;
    }

    public String toString() {
        return (
            "ID: " + id +
            "\nName: " + name +
            "\nDepartment: " + department +
            getTeacherCoursesAndStudents()
        );
    }

    public static ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public static void listTeachersToMe() {
        for (Teacher teacher : teacherList) {
            System.out.println("--------------------------\n" + teacher);
        }
    }

    public static Teacher createTeacher(Scanner scanner) {
        // Captura os campos necessários.
        String name = Utilidades.GetValues.getStringInput("Informe o nome professor: ", scanner);
        String department = Utilidades.GetValues.getStringInput("Informe o departamento: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Teacher newTeacher = new Teacher(
            name, 
            department
        );
        teacherList.add(newTeacher);
        return newTeacher;
    }

    public String getTeacherCoursesAndStudents() {
        ArrayList<Course> courseList = Course.getCourseList();
        ArrayList<Student> studentList = Student.getStudentList();
        // Classe para modificar cadeia de caracteres.
        StringBuilder sb = new StringBuilder();
        
        // Cada append vai concatenar na string sb o conteúdo passado.
        for (Course course : courseList) {
            if (course.teacher.id == this.id) {
                sb.append("\n\n----| Lista de Cursos Envolvidos |---\n")
                  .append(course.name);
                
                int studentCount = 0;
                for (Student student : studentList) {
                    if (student.course.id == course.id) {
                        studentCount++;
                    }
                }
                sb.append("\nStudent Count: ").append(studentCount).append("\n");
            }
        }
        
        return sb.toString();
    }

    // Adiciona dados a lista de professores para agilizar os testes.
    public static void mockTeacherData() {
        Teacher newTeacher;

        newTeacher = new Teacher(
            "Biggus Dickus",
            "Philosophy"
        );
        teacherList.add(newTeacher);

        newTeacher = new Teacher(
            "Lord Farquaad", 
            "Process Management"
        );
        teacherList.add(newTeacher);

        newTeacher = new Teacher(
            "Gaius",
            "Chemistry"
        );
        teacherList.add(newTeacher);

        newTeacher = new Teacher(
            "Squidward",
            "Music"
        );
        teacherList.add(newTeacher);
    }
}
