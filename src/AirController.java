public class AirController {
	private String name;
	private String surname;
	private String dni;
	private int    birthdate;
	private int    experience;
	private int    lvl;
	
	public AirController() {
	}
	
	public AirController(String name, String surname, String dni, int birthdate, int experience, int lvl) {
		this.name       = name;
		this.surname    = surname;
		this.dni        = dni;
		this.birthdate  = birthdate;
		this.experience = experience;
		if (lvl >= 0 && lvl <= 100) {
			this.lvl = lvl;
		} else {
			System.out.println("Valor incorrecto.");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public void setLvl(int lvl) {
		if (lvl >= 0 && lvl <= 100) {
			this.lvl = lvl;
		} else {
			System.out.println("Valor incorrecto.");
		}
	}
	
	@Override
	public String toString() {
		return "Controlador {" + "Nombre: '" + name + '\'' + ", apellidos: '" + surname + '\'' + ", dni: '" + dni +
		       '\'' + ", Año de nacimiento: " + birthdate + ", experiencia: " + experience + ", destreza: " + lvl + '}';
	}
}
