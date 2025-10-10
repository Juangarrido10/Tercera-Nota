package semana05.actividad01;

import semana05.actividad01.clase.Student;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Student student1 = new Student("Juan", 8.5);
        Student student2 = new Student("Pedro", 11.5);
        Student student3 = new Student("María", 9.2);
        Student student4 = new Student("Carlos", 7.8);
        Student student5 = new Student("Ana", 10.0);
        
        System.out.println("=== NOTAS DE ESTUDIANTES ===");
        System.out.println(student1.name + ": " + student1.grade);
        System.out.println(student2.name + ": " + student2.grade);
        System.out.println(student3.name + ": " + student3.grade);
        System.out.println(student4.name + ": " + student4.grade);
        System.out.println(student5.name + ": " + student5.grade);
        
        System.out.println("\n=== BUSCANDO EL MEJOR ESTUDIANTE ===");
        
        // Inicializar con el primer estudiante
        Student mejorEstudiante = student1;
        
        // Comparar con cada estudiante usando IF
        if (student2.grade > mejorEstudiante.grade) {
            mejorEstudiante = student2;
        }
        
        if (student3.grade > mejorEstudiante.grade) {
            mejorEstudiante = student3;
        }
        
        if (student4.grade > mejorEstudiante.grade) {
            mejorEstudiante = student4;
        }
        
        if (student5.grade > mejorEstudiante.grade) {
            mejorEstudiante = student5;
        }
        
        // Mostrar resultado
        System.out.println("El mejor estudiante es: " + mejorEstudiante.name);
        System.out.println("Con una nota de: " + mejorEstudiante.grade);
        
        // Clasificar la nota del mejor estudiante
        if (mejorEstudiante.grade >= 10) {
            System.out.println("¡EXCELENTE! Nota sobresaliente");
        } else if (mejorEstudiante.grade >= 8) {
            System.out.println("¡MUY BUENO! Nota alta");
        } else if (mejorEstudiante.grade >= 6) {
            System.out.println("BUENO. Nota aprobatoria");
        } else {
            System.out.println("Necesita mejorar");
        }
    }
}