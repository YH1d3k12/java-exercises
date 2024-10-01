package School;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;

// Meu Código.
import Utilidades.GetValues;

// Classes.
import School.Teacher;
import School.Course;
import School.Student;


public class SchoolSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = 0;

        // Mockando os dados nas listas para agilizar os testes.
        Teacher.mockTeacherData();
        Course.mockCourseData();
        Student.mockStudentData();


        System.out.println("Bem vindo ao Sistema Escolar!");
        do {
            action = GetValues.getIntInput("Escolha uma opção do menu: \n[1] - Cadastrar Professor\n[2] - Cadastrar Curso\n[3] - Cadastrar Aluno\n[4] - Listar Professores\n[5] - Listar Cursos\n[6] - Listar Alunos\n[7] - Encerrar o Programa.", scanner);
            switch (action) {
                case 1:
                    clearTerminalGambiarra();
                    Teacher.createTeacher(scanner);
                    System.out.println("\n");
                    break;
                case 2:
                    clearTerminalGambiarra();
                    Course.createCourse(scanner);
                    System.out.println("\n");
                    break;
                case 3:
                    clearTerminalGambiarra();
                    Student.createStudent(scanner);
                    System.out.println("\n");
                    break;
                case 4:
                    clearTerminalGambiarra();
                    Teacher.listTeachersToMe();
                    System.out.println("\n");
                    break;
                case 5:
                    clearTerminalGambiarra();
                    Course.listCoursesToMe();
                    System.out.println("\n");
                    break;
                case 6:
                    clearTerminalGambiarra();
                    Student.listStudentsTome();
                    System.out.println("\n");
                    break;
                default:
                    break;
            }
        } while (action != 7);
    }

    // O único proposito desta função é de limpar o terminal dando um monte de espaçamento :V
    public static void clearTerminalGambiarra() {
        for (int i = 0; i < 10; i++) {
            System.out.println(".");
        }
    }
}