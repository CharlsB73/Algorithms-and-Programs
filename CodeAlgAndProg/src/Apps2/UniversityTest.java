package Apps2;

import GeneralClasses2.University;

public class UniversityTest {

	public static void main(String[] args) {
		// 1. Crear la Universidad
		University miUni = new University("Aarhus University", "Nordre Ringgade 1", "8000");

		System.out.println("--- DANDO DE ALTA ALUMNOS ---");
		// 2. Dar de alta algunos alumnos
		// Parámetros: nombre, domicilio, curp, carrera, añoNac
		miUni.altaAlumno("Carlos Castillo", "Calle Falsa 123", 202505, "Data Science", 2005);
		miUni.altaAlumno("Ana Jensen", "Tordenskjoldsgade 10", 112233, "Economics", 1998);
		miUni.altaAlumno("Erik Larsen", "Park Alle 5", 445566, "Physics", 2002);

		System.out.println("Total de alumnos inscritos: " + miUni.getTotAlumnos());

		// 3. Registrar calificaciones
		System.out.println("\n--- REGISTRANDO CALIFICACIONES ---");
		miUni.altaCalificacion("Carlos Castillo", 10);
		miUni.altaCalificacion("Carlos Castillo", 9);
		miUni.altaCalificacion("Ana Jensen", 8);

		// 4. Probar cambios y reportes
		System.out.println("\n--- REPORTES Y CAMBIOS ---");

		// Cambiar domicilio
		miUni.cambiaDom("Carlos Castillo", "Ny Munkegade 116");

		// Mostrar todos los alumnos
		System.out.println(miUni.toStringDatosAlumnos());

		// Mostrar alumnos mayores a 22 años (Ana nació en 1998, tiene 25 en "2023")
		System.out.println("\n--- ALUMNOS MAYORES A 22 AÑOS ---");
		System.out.println(miUni.toStringDatosAlumnosMayores(22));

		// 5. Quitar un alumno y verificar
		System.out.println("\n--- ELIMINANDO ALUMNO (Erik Larsen) ---");
		miUni.quitarAlumno("Erik Larsen");
		System.out.println("Total de alumnos tras baja: " + miUni.getTotAlumnos());
	}

}
