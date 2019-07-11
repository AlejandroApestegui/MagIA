package edu.upc.ia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		filaProcesada fila = new filaProcesada();

		System.out.println("ELEGIR SOLO UNA DE LAS OPCIONES");

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("1. Seleccione edad : ");

		System.out.println("10) DE 0 A 4 ");
		System.out.println("11) DE 5 A 15 ");
		System.out.println("12) DE 16 A 24 ");
		System.out.println("13) DE 25 A 34 ");
		System.out.println("14) DE 35 A 44 ");
		System.out.println("15) DE 45 A 54 ");
		System.out.println("16) DE 55 A 64 ");
		System.out.println("17) DE 65 A 74 ");
		System.out.println("18) DE 75 Y MÁS ");

		fila.Edad = in.nextInt();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("2. Seleccione Estudios : ");

		System.out.println("20) ANALFABETOS O SIN ESTUDIOS");
		System.out.println("21) PRIMARIOS Y SECUNDARIOS DE PRIMER CICLO");
		System.out.println("22) SECUNDARIOS DE SEGUNDO CICLO Y POST-SECUNDARIOS");
		System.out.println("23) UNIVERSITARIOS");

		fila.Estudios = in.nextInt();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("3. Seleccione Clase social : ");

		System.out.println(
				"30) DIRECTIVOS DE LA ADMINISTRACION PUBLICA Y DE EMPRESAS DE 10 O MAS ASALARIADOS. PROFESIONES ASOCIADAS A TITULACIONES DE 2 Y 3ER CICLO");
		System.out.println(
				"31) DIRECTIVOS DE EMPRESAS DE MENOS DE 10 ASALARIADOS. PROFESIONES ASOCIADAS A UNA TITULACION DE 1ER CICLO UNIVERSITARIO. TECNICOS SUPERIORES. ARTISTAS Y DEPORTISTAS");
		System.out.println(
				"32) EMPLEADOS DE TIPO ADMINISTRATIVO Y PROFESIONALES DE APOYO A LA GESTIÓN ADMINISTRATIVA Y FINANCIERA. TRABAJADORES DE LOS SERVICIOS PERSONALES Y DE SEGURIDAD. TRABAJADORES POR CUENTA PROPIA. SUPERVISORES DE TRABAJADORES MANUALES");
		System.out.println("33) TRABAJADORES MANUALES CUALIFICADOS	");
		System.out.println("34) TRABAJADORES MANUALES SEMICUALIFICADOS");
		System.out.println("35) TRABAJADORES NO CUALIFICADOS");
		System.out.println("36) OTROS	");
		System.out.println("37) NO CONSTA");

		fila.claseSocial = in.nextInt();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("4. Seleccione Situación laboral : ");

		System.out.println("40) OCUPADO");
		System.out.println("41) PARADO");
		System.out.println("42) INACTIVO");

		fila.Trabajo = in.nextInt();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("5. Seleccione Poblacion distrital : ");

		System.out.println("50) MENOR O IGUAL A 2.000 HABITANTES");
		System.out.println("51) 2.001 A 50.000 HABITANTES");
		System.out.println("52) MÁS DE 50.000 HABITANTES");

		fila.Municipio = in.nextInt();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("6. Seleccione Sexo : ");

		System.out.println("1) Masculino");
		System.out.println("2) Femenino");

		fila.sexo = in.nextInt();

		fila.clase = 0;

		Path path = Paths.get(System.getProperty("user.dir") + "/muestra_ulcera.arff");

		try (BufferedWriter writer = Files.newBufferedWriter(path)) {

			writer.write("@RELATION RapidMinerData" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'edad' {'12','13','14','15','16','17','18','10','11'}" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'estudios' {'20','21','23','22'}" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'claseSocial' {'30','31','32','33','34','35','36','37'}" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'trabajo' {'40','41','42'}" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'municipio' {'50','51','52'}" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'sexo' {'1','2'}" + System.lineSeparator());
			writer.write("@ATTRIBUTE 'class' {'1','2'}" + System.lineSeparator());
			writer.write("@data" + System.lineSeparator());
			writer.write(fila.dataWeka());
		}
	}

}

class filaProcesada {
	int Edad, Estudios, Trabajo, claseSocial, Municipio, sexo, clase;

	@Override
	public String toString() {
		return "filaProcesada [Edad=" + Edad + ", Estudios=" + Estudios + ", Trabajo=" + Trabajo + ", claseSocial="
				+ claseSocial + ", Municipio=" + Municipio + ", sexo=" + sexo + ", clase=" + clase + "]";
	}

	public String dataWeka() {
		return (Edad == 0 ? "?" : "'" + Edad + "'") + " " + (Estudios == 0 ? "?" : "'" + Estudios + "'") + " "
				+ (claseSocial == 0 ? "?" : "'" + claseSocial + "'") + " " + (Trabajo == 0 ? "?" : "'" + Trabajo + "'")
				+ " " + (Municipio == 0 ? "?" : "'" + Municipio + "'") + " " + (sexo == 0 ? "?" : "'" + sexo + "'")
				+ " " + (clase == 0 ? "?" : "'" + clase + "'") + System.lineSeparator();
	}

}
