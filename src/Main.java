import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Controlador[] airControllers = new Controlador[5];
        Aerolinea[] airlines = new Aerolinea[5];
        Avion[] airplanes = new Avion[5];
        Vuelo[] flights = new Vuelo[5];
        int opt;

        airControllers[0] = new Controlador("Juan", "Pérez", "12345678a", 1990, 3, 46);
        airControllers[1] = new Controlador("Paco", "Sanz", "16589779e", 1998, 9, 90);
        airControllers[2] = new Controlador("Pepe", "Reina", "16876482w", 2000, 0, 16);
        airControllers[3] = new Controlador("Amancio", "Ortega", "99999999u", 1810, 99, 99);
        airControllers[4] = new Controlador("Santi", "Abascal", "14141414f", 1512, 0, 0);
        airlines[0] = new Aerolinea("Iberia", "España");
        airlines[1] = new Aerolinea("AirEuropa", "Francia");
        airlines[2] = new Aerolinea("EasyJet", "Reino Unido");
        airlines[3] = new Aerolinea("Turkish Airlines", "Turquía");
        airlines[4] = new Aerolinea("Fly Emirates", "Emiratos Árabes");
        airplanes[0] = new Avion("Boeing", "747", 4500, 250, "UP-C8504");
        airplanes[1] = new Avion("Lockheed Martin", "F-22", 2000, 2, "ZA-R3424");
        airplanes[2] = new Avion("Airbus", "A380", 4325, 266, "PC-X8475");
        airplanes[3] = new Avion("Airbus", "A370", 4000, 250, "PC-J4504");
        airplanes[4] = new Avion("Boeing", "777", 3800, 300, "XS-Q8994");
        flights[0] = new Vuelo(321, "Valencia", 90.3);
        flights[1] = new Vuelo(350, "Medellin", 700);
        flights[2] = new Vuelo(123, "Almería", 50.35);
        flights[3] = new Vuelo(322, "Bilbo", 130.80);
        flights[4] = new Vuelo(389, "Oporto", 150.3);

        do {
            System.out.print("1. Buscar (Aerolíneas, airplanes, flights, airControllers)\n" +
                    "2. Modificar (Aerolíneas, airplanes, flights, airControllers)\n" +
                    "3. Mostrar datos (Aerolíneas, airplanes, flights, airControllers)\n" +
                    "4. Aumentar capacidad de depósito a Avión.\n" +
                    "5. Sumar puntos de experiencia a controlador.\n" +
                    "6. Aumentar capacidad de pasajeros de un Avión.\n" +
                    "7. Salir.\n" +
                    "Elige una opción: ");
            switch (opt = sn.nextInt()) {
                case 1:
                    System.out.print("1. Aerolíneas.\n" +
                            "2. Aviones.\n" +
                            "3. Vuelos.\n" +
                            "4. Controladores.\n" +
                            "Elige una opción: ");
                    switch (opt = sn.nextInt()) {
                        case 1:
                            System.out.print("Introduce un nombre: ");
                            String name = sc.nextLine();
                            for (int i = 0; i < airlines.length; i++) {
                                if (airlines[i].getName().equalsIgnoreCase(name)) {
                                    System.out.println(airlines[i].toString());
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Introduce una matrícula: ");
                            String license = sc.nextLine();
                            for (int i = 0; i < airplanes.length; i++) {
                                if (airplanes[i].getLicense().equalsIgnoreCase(license)) {
                                    System.out.println(airplanes[i].toString());
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Introduce un nº de vuelo: ");
                            int idFlight = sc.nextInt();
                            for (int i = 0; i < flights.length; i++) {
                                if (flights[i].getIdFlight() == idFlight) {
                                    System.out.println(flights[i].toString());
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Introduce un DNI: ");
                            String dni = sc.nextLine();
                            for (int i = 0; i < airControllers.length; i++) {
                                if (airControllers[i].getDni().equalsIgnoreCase(dni)) {
                                    System.out.println(airControllers[i].toString());
                                }
                            }
                            break;
                        default:
                            System.out.println("Valor incorrecto.");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("1. Aerolíneas.\n" +
                            "2. Aviones.\n" +
                            "3. Vuelos.\n" +
                            "4. Controladores.\n" +
                            "Elige una opción: ");
                    switch (opt = sn.nextInt()) {
                        case 1:
                            System.out.print("1. Nombre.\n" +
                                    "2. País de origen.\n" +
                                    "Elige una opción: ");
                            switch (opt = sn.nextInt()) {
                                case 1:
                                    System.out.print("Introduce un nuevo nombre: ");
                                    String name = sc.nextLine();
                                    for (int i = 0; i < airlines.length; i++) {
                                        if (airlines[i].getName().equalsIgnoreCase(name)) {
                                            System.out.println(airlines[i].toString());
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.print("Introduce una matrícula: ");
                                    String license = sc.nextLine();
                                    for (int i = 0; i < airplanes.length; i++) {
                                        if (airplanes[i].getLicense().equalsIgnoreCase(license)) {
                                            System.out.println(airplanes[i].toString());
                                        }
                                    }
                                    break;
                            break;
                        case 2:
                            System.out.print("Introduce una matrícula: ");
                            String license = sc.nextLine();
                            for (int i = 0; i < airplanes.length; i++) {
                                if (airplanes[i].getLicense().equalsIgnoreCase(license)) {
                                    System.out.println(airplanes[i].toString());
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Introduce un nº de vuelo: ");
                            int idFlight = sc.nextInt();
                            for (int i = 0; i < flights.length; i++) {
                                if (flights[i].getIdFlight() == idFlight) {
                                    System.out.println(flights[i].toString());
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Introduce un DNI: ");
                            String dni = sc.nextLine();
                            for (int i = 0; i < airControllers.length; i++) {
                                if (airControllers[i].getDni().equalsIgnoreCase(dni)) {
                                    System.out.println(airControllers[i].toString());
                                }
                            }
                            break;
                        default:
                            System.out.println("Valor incorrecto.");
                            break;
                    }
                    break;
            }
        } while (opt != 0);

    }
}
