package semana05.actividad03.clase;

public class Employee {
    public String role;

    public Employee(String role) {
        this.role = role;
    }

    public void ShowResponsibilities() {
        switch (role) {
            case "Manager":
                System.out.println("Maneja el equipo");
                break;
            case "Developer":
                System.out.println("Programa y testea");
                break;
            case "Designer":
                System.out.println("Diseña y UX");
                break;
            default:
                System.out.println("No conocido");
                break;
        }
    }
}
