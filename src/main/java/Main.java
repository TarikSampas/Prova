import org.example.Paciente;

import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {
            Paciente paciente1 = new Paciente(22, "Fernanda", "123456", "Rua X", "123-456", LocalDate.of(2001, 5, 10), "Médico");
            Paciente paciente2 = new Paciente(21, "Tarik", "789012", "Rua Y", "789-012", LocalDate.of(2002, 8, 15), "Engenheiro");

            Exame exame1 = new Exame(101, "Hemograma", LocalDate.now(), 100.0);
            Exame exame2 = new Exame(102, "Raio-X", LocalDate.now(), 150.0);

            System.out.println("Informações do Paciente 1:");
            System.out.println(paciente1);

            System.out.println("\nInformações do Paciente 2:");
            System.out.println(paciente2);

            System.out.println("\nInformações do Exame 1:");
            System.out.println(exame1);

            System.out.println("\nInformações do Exame 2:");
            System.out.println(exame2);
        }
    }


