import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner         sn             = new Scanner(System.in);
		Scanner         sc             = new Scanner(System.in);
		AirController[] airControllers = new AirController[5];
		Airline[]       airlines       = new Airline[5];
		Airplane[]      airplanes      = new Airplane[5];
		Flight[]        flights        = new Flight[5];
		
		int    passengers, opt = 0;
		double tankCapacity;
		String name, country, license, brand, model;
		
		Main.fillAirControllers(airControllers);
		Main.fillAirlines(airlines);
		Main.fillAirplanes(airplanes);
		Main.fillFlights(flights);
		
		do {
			System.out.print("1. Buscar (Aerolíneas, airplanes, flights, airControllers)\n" +
			                 "2. Modificar (Aerolíneas, airplanes, flights, airControllers)\n" +
			                 "3. Mostrar datos (Aerolíneas, airplanes, flights, airControllers)\n" +
			                 "4. Aumentar capacidad de depósito a Avión.\n" +
			                 "5. Sumar puntos de experiencia a controlador.\n" +
			                 "6. Aumentar capacidad de pasajeros de un Avión.\n" + "7. Salir.\n" +
			                 "Elige una opción: ");
			switch (opt = sn.nextInt()) {
				case 1:
					System.out.print("1. Aerolíneas.\n" + "2. Aviones.\n" + "3. Vuelos.\n" + "4. Controladores.\n" +
					                 "Elige una opción: ");
					switch (opt = sn.nextInt()) {
						case 1:
							System.out.print("Introduce un nombre: ");
							name = sc.nextLine();
							if (Main.checkAirline(airlines, name) != -1) {
								System.out.println(airlines[Main.checkAirline(airlines, name)].toString());
							} else {
								Main.printError();
							}
							break;
						case 2:
							System.out.print("Introduce una matrícula: ");
							license = sc.nextLine();
							for (Airplane airplane : airplanes) {
								if (airplane.getLicense().equalsIgnoreCase(license)) {
									System.out.println(airplane.toString());
								} else {
									Main.printError();
								}
							}
							break;
						case 3:
							System.out.print("Introduce un nº de vuelo: ");
							int idFlight = sn.nextInt();
							for (Flight flight : flights) {
								if (flight.getIdFlight() == idFlight) {
									System.out.println(flight.toString());
								} else {
									Main.printError();
								}
							}
							break;
						case 4:
							System.out.print("Introduce un DNI: ");
							String dni = sc.nextLine();
							for (AirController airController : airControllers) {
								if (airController.getDni().equalsIgnoreCase(dni)) {
									System.out.println(airController.toString());
								} else {
									Main.printError();
								}
							}
							break;
						default:
							Main.printError();
							break;
						
					}
					break;
				case 2:
					System.out.print("1. Aerolíneas.\n" + "2. Aviones.\n" + "3. Vuelos.\n" + "4. Controladores.\n" +
					                 "Elige una opción: ");
					switch (opt = sn.nextInt()) {
						case 1:
							System.out.print("Introduce el nombre de la aerolínea que quieres cambiar: ");
							name = sc.nextLine();
							if (Main.checkAirline(airlines, name) != -1) {
								System.out.print("1. Nombre.\n" + "2. País de origen.\n" + "Elige una opción: ");
								switch (opt = sn.nextInt()) {
									case 1:
										if (Main.checkAirline(airlines, name) != -1) {
											System.out.print("Introduce nuevo nombre: ");
											name = sc.nextLine();
											airlines[Main.checkAirline(airlines, name)].setName(name);
										}
										break;
									case 2:
										if (Main.checkAirline(airlines, name) != -1) {
											System.out.print("Introduce nuevo país: ");
											country = sc.nextLine();
											airlines[Main.checkAirline(airlines, name)].setCountry(country);
										}
										break;
									default:
										Main.printError();
										break;
								}
							} else {
								Main.printError();
							}
							break;
						case 2:
							System.out.print("Introduce la matrícula del avión que quieres cambiar: ");
							license = sc.nextLine();
							if (Main.checkAirplane(airplanes, license) != -1) {
								System.out.print("1. Marca.\n" + "2. Modelo.\n" + "3. Capacidad depósito.\n" +
								                 "4. Capacidad pasajeros.\n" + "5. Matrícula.\n" +
								                 "Elige una opción: ");
								switch (opt = sn.nextInt()) {
									case 1:
										if (Main.checkAirplane(airplanes, license) != -1) {
											System.out.print("Introduce nueva marca: ");
											brand = sc.nextLine();
											airplanes[Main.checkAirplane(airplanes, license)].setBrand(brand);
										}
										break;
									case 2:
										if (Main.checkAirplane(airplanes, license) != -1) {
											System.out.print("Introduce nuevo modelo: ");
											model = sc.nextLine();
											airplanes[Main.checkAirplane(airplanes, license)].setModel(model);
										}
										break;
									case 3:
										if (Main.checkAirplane(airplanes, license) != -1) {
											System.out.print("Introduce nueva capacidad depósito: ");
											tankCapacity = sn.nextDouble();
											airplanes[Main.checkAirplane(airplanes, license)].setTankCapacity(tankCapacity);
										}
										break;
									case 4:
										if (Main.checkAirplane(airplanes, license) != -1) {
											System.out.print("Introduce nuevo modelo: ");
											model = sc.nextLine();
											airplanes[Main.checkAirplane(airplanes, license)].setModel(model);
										}
										break;
									default:
										System.out.println("Valor incorrecto");
										break;
								}
							}
							break;
					}
					break;
				
			}
		} while (opt != 0);
		
	}
	
	public static void fillAirControllers(AirController[] airControllers) {
		airControllers[0] = new AirController("Juan", "Pérez", "12345678a", 1990, 3, 46);
		airControllers[1] = new AirController("Paco", "Sanz", "16589779e", 1998, 9, 90);
		airControllers[2] = new AirController("Pepe", "Reina", "16876482w", 2000, 0, 16);
		airControllers[3] = new AirController("Amancio", "Ortega", "99999999u", 1810, 99, 99);
		airControllers[4] = new AirController("Santi", "Abascal", "14141414f", 1512, 0, 0);
	}
	
	public static void fillAirlines(Airline[] airlines) {
		airlines[0] = new Airline("Iberia", "España");
		airlines[1] = new Airline("AirEuropa", "Francia");
		airlines[2] = new Airline("EasyJet", "Reino Unido");
		airlines[3] = new Airline("Turkish Airlines", "Turquía");
		airlines[4] = new Airline("Fly Emirates", "Emiratos Árabes");
	}
	
	public static void fillAirplanes(Airplane[] airplanes) {
		airplanes[0] = new Airplane("Boeing", "747", 4500, 250, "UP-C8504");
		airplanes[1] = new Airplane("Lockheed Martin", "F-22", 2000, 2, "ZA-R3424");
		airplanes[2] = new Airplane("Airbus", "A380", 4325, 266, "PC-X8475");
		airplanes[3] = new Airplane("Airbus", "A370", 4000, 250, "PC-J4504");
		airplanes[4] = new Airplane("Boeing", "777", 3800, 300, "XS-Q8994");
	}
	
	public static void fillFlights(Flight[] flights) {
		flights[0] = new Flight(321, "Valencia", 90.3);
		flights[1] = new Flight(350, "Medellin", 700);
		flights[2] = new Flight(123, "Almería", 50.35);
		flights[3] = new Flight(322, "Bilbo", 130.80);
		flights[4] = new Flight(389, "Oporto", 150.3);
	}
	
	public static int checkAirline(Airline[] airlines, String name) {
		int airlinePos = -1;
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getName().equalsIgnoreCase(name)) {
				airlinePos = i;
			}
		}
		return airlinePos;
	}
	
	public static int checkAirplane(Airplane[] airplanes, String license) {
		int airplanePos = -1;
		for (int i = 0; i < airplanes.length; i++) {
			if (airplanes[i].getLicense().equalsIgnoreCase(license)) {
				airplanePos = i;
			}
		}
		return airplanePos;
	}
	
	public static void printError() {
		System.out.println("Valor incorrecto");
	}
}
