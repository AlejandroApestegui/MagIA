package edu.upc.ia;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static List<Tabla> tablas = new ArrayList<Tabla>();
	public static boolean mostrarFrecuencia = false;

	public static void main(String[] args) throws IOException {

		// URL
		// https://www.saludcastillayleon.es/sanidad/cm/gallery/ENCUESTA%20REGIONAL%20DE%20SALUD%202003/Castilla%20y%20Leon/Tabla%20I.3.6.HTM

		List<Raw> datos = new ArrayList<Raw>();

		// ULCERA DE ESTOMAGO

		// 1 MASCULINO
		// 2 FEMENINO

		// EDAD X SEXO

		// 10 DE 0 A 4 AÑOS
		// 11 DE 5 A 15 AÑOS
		// 12 DE 16 A 24 AÑOS
		// 13 DE 25 A 34 AÑOS
		// 14 DE 35 A 44 AÑOS
		// 15 DE 45 A 54 AÑOS
		// 16 DE 55 A 64 AÑOS
		// 17 DE 65 A 74 AÑOS
		// 18 DE 75 Y MÁS AÑOS

		datos.add(new Raw(1, 10, 0, 28124));
		datos.add(new Raw(1, 11, 0, 132131));
		datos.add(new Raw(1, 12, 1933, 134824));
		datos.add(new Raw(1, 13, 2451, 186582));
		datos.add(new Raw(1, 14, 2932, 186674));
		datos.add(new Raw(1, 15, 4629, 159467));
		datos.add(new Raw(1, 16, 8227, 122225));
		datos.add(new Raw(1, 17, 5669, 126741));
		datos.add(new Raw(1, 18, 4164, 97089));

		datos.add(new Raw(2, 10, 0, 30382));
		datos.add(new Raw(2, 11, 0, 121337));
		datos.add(new Raw(2, 12, 488, 128713));
		datos.add(new Raw(2, 13, 328, 178643));
		datos.add(new Raw(2, 14, 1617, 181335));
		datos.add(new Raw(2, 15, 2715, 149915));
		datos.add(new Raw(2, 16, 3475, 127525));
		datos.add(new Raw(2, 17, 8064, 150461));
		datos.add(new Raw(2, 18, 6097, 137552));

		Tabla tabla = new Tabla();
		tabla.nombre = "EDAD X SEXO";
		tabla.clases = datos;
		tablas.add(tabla);

		// ESTUDIOS X SEXO

		// 20 ANALFABETOS O SIN ESTUDIOS
		// 21 PRIMARIOS Y SECUNDARIOS DE PRIMER CICLO
		// 22 SECUNDARIOS DE SEGUNDO CICLO Y POST-SECUNDARIOS
		// 23 UNIVERSITARIOS
		tabla = new Tabla();
		datos = new ArrayList<Raw>();

		datos.add(new Raw(1, 20, 8423, 118456));
		datos.add(new Raw(1, 21, 19078, 705903));
		datos.add(new Raw(1, 22, 0, 203659));
		datos.add(new Raw(1, 23, 2504, 145839));

		datos.add(new Raw(2, 20, 2789, 128460));
		datos.add(new Raw(2, 21, 14421, 684112));
		datos.add(new Raw(2, 22, 2594, 230700));
		datos.add(new Raw(2, 23, 2980, 162591));

		tabla = new Tabla();
		tabla.nombre = "ESTUDIOS X SEXO";
		tabla.clases = datos;
		tablas.add(tabla);

		// CLASESOCIAL X SEXO

		// 30 CLASE I: DIRECTIVOS DE LA ADMINISTRACIÓN PÚBLICA Y DE EMPRESAS DE 10 O MÁS
		// ASALARIADOS. PROFESIONES ASOCIADAS A TITULACIONES DE 2º Y 3ER CICLO
		// 31 CLASE II: DIRECTIVOS DE EMPRESAS DE MENOS DE 10 ASALARIADOS. PROFESIONES
		// ASOCIADAS A UNA TITULACIÓN DE 1ER CICLO UNIVERSITARIO. TÉCNICOS SUPERIORES.
		// ARTISTAS Y DEPORTISTAS
		// 32 CLASE III: EMPLEADOS DE TIPO ADMINISTRATIVO Y PROFESIONALES DE APOYO A LA
		// GESTIÓN ADMINISTRATIVA Y FINANCIERA. TRABAJADORES DE LOS SERVICIOS PERSONALES
		// Y DE SEGURIDAD. TRABAJADORES POR CUENTA PROPIA. SUPERVISORES DE TRABAJADORES
		// MANUALES
		// 33 CLASE IVa:TRABAJADORES MANUALES CUALIFICADOS
		// 34 CLASE IVb:TRABAJADORES MANUALES SEMICUALIFICADOS
		// 35 CLASE V:TRABAJADORES NO CUALIFICADOS
		// 36 CLASE VI: OTROS
		// 37 NO CONSTA
		tabla = new Tabla();
		datos = new ArrayList<Raw>();

		datos.add(new Raw(1, 30, 1319, 80597));
		datos.add(new Raw(1, 31, 946, 105309));
		datos.add(new Raw(1, 32, 7338, 379770));
		datos.add(new Raw(1, 33, 11197, 325602));
		datos.add(new Raw(1, 34, 3478, 136088));
		datos.add(new Raw(1, 35, 4826, 134190));
		datos.add(new Raw(1, 36, 491, 9982));
		datos.add(new Raw(1, 37, 410, 2319));

		datos.add(new Raw(2, 30, 1623, 86359));
		datos.add(new Raw(2, 31, 1232, 103402));
		datos.add(new Raw(2, 32, 7737, 386035));
		datos.add(new Raw(2, 33, 6079, 339091));
		datos.add(new Raw(2, 34, 2449, 139551));
		datos.add(new Raw(2, 35, 2440, 133721));
		datos.add(new Raw(2, 36, 1095, 12879));
		datos.add(new Raw(2, 37, 129, 4825));

		tabla = new Tabla();
		tabla.nombre = "CLASESOCIAL X SEXO";
		tabla.clases = datos;
		tablas.add(tabla);

		// TRABAJO X SEXO

		// 40 OCUPADO
		// 41 PARADO
		// 42 INACTIVO
		tabla = new Tabla();
		datos = new ArrayList<Raw>();

		datos.add(new Raw(1, 40, 14449, 738663));
		datos.add(new Raw(1, 41, 1483, 29467));
		datos.add(new Raw(1, 42, 14073, 405727));

		datos.add(new Raw(2, 40, 6787, 730267));
		datos.add(new Raw(2, 41, 327, 29110));
		datos.add(new Raw(2, 42, 15670, 446486));

		tabla = new Tabla();
		tabla.nombre = "TRABAJO X SEXO";
		tabla.clases = datos;
		tablas.add(tabla);

		// MUNICIPIO X SEXO

		// 50 MENOR O IGUAL A 2.000 HABITANTES
		// 51 2.001 A 50.000 HABITANTES
		// 52 MÁS DE 50.000 HABITANTES
		tabla = new Tabla();
		datos = new ArrayList<Raw>();

		datos.add(new Raw(1, 50, 7702, 364025));
		datos.add(new Raw(1, 51, 8603, 310771));
		datos.add(new Raw(1, 52, 13700, 499061));

		datos.add(new Raw(2, 50, 7785, 321928));
		datos.add(new Raw(2, 51, 5178, 329580));
		datos.add(new Raw(2, 52, 9821, 554355));

		tabla = new Tabla();
		tabla.nombre = "MUNICIPIO X SEXO";
		tabla.clases = datos;
		tablas.add(tabla);

		int encuestadosSiF = 0;
		int encuestadosNoF = 0;
		int encuestadosSiM = 0;
		int encuestadosNoM = 0;

		for (Tabla t : tablas) {

			encuestadosSiF = 0;
			encuestadosNoF = 0;
			encuestadosSiM = 0;
			encuestadosNoM = 0;

			for (Raw r : t.clases) {

				if (r.sexo == 1) {
					encuestadosSiM += r.si;
					encuestadosNoM += r.no;
				} else {
					encuestadosSiF += r.si;
					encuestadosNoF += r.no;
				}
			}

		}

		// RESULTADO

		// 1= ULCERA
		// 2= NO ULCERA

		// GENERAR ARCHIVO Attribute-Relation File Format

		List<filaProcesada> filasProcesadas = new ArrayList<filaProcesada>();

		int totalFilas = (encuestadosSiM + encuestadosNoM + encuestadosSiF + encuestadosNoF);

		for (int i = 1; i <= totalFilas; i++) {
			filaProcesada fila = new filaProcesada();
			// asignar datos a matriz

			// LLENANDO LA PRIMERA COLUMNA CON EL SEXO
			// ACA TENEMOS 2 BLOQUES
			// LLENAR LOS BLOQUES CON SI TIENE O NO ULCERA

			// MASCULINOS SI (1-1)
			// MASCULINOS NO (1-2)
			// FEMENINOS SI (2-1)
			// FEMENINOS NO (2-2)

			if (i <= (encuestadosSiM + encuestadosNoM)) {
				fila.sexo = 1;
				if (i <= encuestadosSiM) {
					fila.clase = 1;
				} else {
					fila.clase = 2;
				}
			} else {
				fila.sexo = 2;
				if (i <= (encuestadosNoM + encuestadosSiM + encuestadosSiF)) {
					fila.clase = 1;
				} else {
					fila.clase = 2;
				}
			}
			fila = llenarDatos(fila);
			filasProcesadas.add(fila);
		}

		System.out.println("ENCUESTAS PROCESADAS => " + filasProcesadas.size());

		if (mostrarFrecuencia) {
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("FRECUENCIA DE DATOS");

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("Edad");

			System.out.println("");

			System.out.println("DE 0 A 4 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 10).collect(Collectors.toList()).size());
			System.out.println("DE 5 A 15 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 11).collect(Collectors.toList()).size());
			System.out.println("DE 16 A 24 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 12).collect(Collectors.toList()).size());
			System.out.println("DE 25 A 34 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 13).collect(Collectors.toList()).size());
			System.out.println("DE 35 A 44 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 14).collect(Collectors.toList()).size());
			System.out.println("DE 45 A 54 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 15).collect(Collectors.toList()).size());
			System.out.println("DE 55 A 64 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 16).collect(Collectors.toList()).size());
			System.out.println("DE 65 A 74 AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 17).collect(Collectors.toList()).size());
			System.out.println("DE 75 Y MÁS AÑOS => "
					+ filasProcesadas.stream().filter(x -> x.Edad == 18).collect(Collectors.toList()).size());

			System.out.println("");

			System.out.println("Estudios");

			System.out.println("");

			System.out.println("PRIMARIOS Y SECUNDARIOS DE PRIMER CICLO => "
					+ filasProcesadas.stream().filter(x -> x.Estudios == 21).collect(Collectors.toList()).size());
			System.out.println("SECUNDARIOS DE SEGUNDO CICLO Y POST-SECUNDARIOS => "
					+ filasProcesadas.stream().filter(x -> x.Estudios == 22).collect(Collectors.toList()).size());
			System.out.println("UNIVERSITARIOS => "
					+ filasProcesadas.stream().filter(x -> x.Estudios == 23).collect(Collectors.toList()).size());

			System.out.println("");

			System.out.println("Clase social");

			System.out.println("");

			System.out.println("CLASE I => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 30).collect(Collectors.toList()).size());
			System.out.println("CLASE II => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 31).collect(Collectors.toList()).size());
			System.out.println("CLASE III => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 32).collect(Collectors.toList()).size());
			System.out.println("CLASE IVa => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 33).collect(Collectors.toList()).size());
			System.out.println("CLASE IVb => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 34).collect(Collectors.toList()).size());
			System.out.println("CLASE V => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 35).collect(Collectors.toList()).size());
			System.out.println("CLASE VI => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 36).collect(Collectors.toList()).size());
			System.out.println("NO CONSTA => "
					+ filasProcesadas.stream().filter(x -> x.claseSocial == 37).collect(Collectors.toList()).size());

			System.out.println("");

			System.out.println("Trabajo");

			System.out.println("");

			System.out.println("OCUPADO => "
					+ filasProcesadas.stream().filter(x -> x.Trabajo == 40).collect(Collectors.toList()).size());
			System.out.println("PARADO => "
					+ filasProcesadas.stream().filter(x -> x.Trabajo == 41).collect(Collectors.toList()).size());
			System.out.println("INACTIVO => "
					+ filasProcesadas.stream().filter(x -> x.Trabajo == 42).collect(Collectors.toList()).size());

			System.out.println("");

			System.out.println("Municipio");

			System.out.println("");

			System.out.println("MENOR O IGUAL A 2.000 HABITANTES => "
					+ filasProcesadas.stream().filter(x -> x.Municipio == 50).collect(Collectors.toList()).size());
			System.out.println("2.001 A 50.000 HABITANTES => "
					+ filasProcesadas.stream().filter(x -> x.Municipio == 51).collect(Collectors.toList()).size());
			System.out.println("MÁS DE 50.000 HABITANTES => "
					+ filasProcesadas.stream().filter(x -> x.Municipio == 52).collect(Collectors.toList()).size());
		}

		System.out.println("LOG DATOS CONSUMIDOS => ");
		System.out.println("");
		for (Tabla tt : tablas) {
			System.out.println(tt);
		}

		Path path = Paths.get(System.getProperty("user.dir") + "/data_ulcera.arff");

		try (BufferedWriter writer = Files.newBufferedWriter(path)) {

			writer.write("@relation ulcera" + System.lineSeparator());
			writer.write("@attribute edad {10,11,12,13,14,15,16,17,18}" + System.lineSeparator());
			writer.write("@attribute estudios {20,21,22,23}" + System.lineSeparator());
			writer.write("@attribute claseSocial {30,31,32,33,34,35,36,37}" + System.lineSeparator());
			writer.write("@attribute trabajo {40,41,42}" + System.lineSeparator());
			writer.write("@attribute municipio {50,51,52}" + System.lineSeparator());
			writer.write("@attribute sexo {1,2}" + System.lineSeparator());
			writer.write("@attribute class {1,2}" + System.lineSeparator());
			writer.write("@data" + System.lineSeparator());

			for (filaProcesada fila : filasProcesadas) {
				writer.write(fila.dataWeka());
			}

		}

	}

	public static filaProcesada llenarDatos(filaProcesada bean) {

		List<Raw> t0 = tablas.get(0).clases;
		List<Raw> t1 = tablas.get(1).clases;
		List<Raw> t2 = tablas.get(2).clases;
		List<Raw> t3 = tablas.get(3).clases;
		List<Raw> t4 = tablas.get(4).clases;

		for (Raw clasep : t0) {
			if (clasep.sexo != bean.sexo) {
				continue;
			}
			if (bean.clase == 1) {
				if (clasep.siUsado >= clasep.si) {
					continue;
				} else {
					bean.Edad = clasep.clase;
					clasep.siUsado++;
					break;
				}
			} else {
				if (clasep.noUsado >= clasep.no) {
					continue;
				} else {
					bean.Edad = clasep.clase;
					clasep.noUsado++;
					break;
				}
			}
		}

		for (Raw clasep : t1) {
			if (clasep.sexo != bean.sexo) {
				continue;
			}
			if (bean.clase == 1) {
				if (clasep.siUsado >= clasep.si) {
					continue;
				} else {
					bean.Estudios = clasep.clase;
					clasep.siUsado++;
					break;
				}
			} else {
				if (clasep.noUsado >= clasep.no) {
					continue;
				} else {
					bean.Estudios = clasep.clase;
					clasep.noUsado++;
					break;
				}
			}
		}

		for (Raw clasep : t2) {
			if (clasep.sexo != bean.sexo) {
				continue;
			}
			if (bean.clase == 1) {
				if (clasep.siUsado >= clasep.si) {
					continue;
				} else {
					bean.claseSocial = clasep.clase;
					clasep.siUsado++;
					break;
				}
			} else {
				if (clasep.noUsado >= clasep.no) {
					continue;
				} else {
					bean.claseSocial = clasep.clase;
					clasep.noUsado++;
					break;
				}
			}
		}

		for (Raw clasep : t3) {
			if (clasep.sexo != bean.sexo) {
				continue;
			}
			if (bean.clase == 1) {
				if (clasep.siUsado >= clasep.si) {
					continue;
				} else {
					bean.Trabajo = clasep.clase;
					clasep.siUsado++;
					break;
				}
			} else {
				if (clasep.noUsado >= clasep.no) {
					continue;
				} else {
					bean.Trabajo = clasep.clase;
					clasep.noUsado++;
					break;
				}
			}
		}

		for (Raw clasep : t4) {
			if (clasep.sexo != bean.sexo) {
				continue;
			}
			if (bean.clase == 1) {
				if (clasep.siUsado >= clasep.si) {
					continue;
				} else {
					bean.Municipio = clasep.clase;
					clasep.siUsado++;
					break;
				}
			} else {
				if (clasep.noUsado >= clasep.no) {
					continue;
				} else {
					bean.Municipio = clasep.clase;
					clasep.noUsado++;
					break;
				}
			}
		}

		return bean;
	}

}

class Tabla {
	String nombre;
	List<Raw> clases;

	@Override
	public String toString() {
		String imp = "Tabla [nombre=" + nombre + "]" + "\n" + "clases : \n";
		for (Raw raw : clases) {
			imp = imp + raw + "\n";
		}
		return imp;
	}

}

class Raw {
	int sexo;
	int clase;
	int si;
	int no;

	int siUsado;
	int noUsado;

	public Raw(int sexo, int clase, int si, int no) {
		this.siUsado = 0;
		this.noUsado = 0;

		this.sexo = sexo;
		this.clase = clase;
		this.si = si;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Raw [sexo=" + sexo + ", clase=" + clase + ", si=" + si + ", no=" + no + ", siUsado=" + siUsado
				+ ", noUsado=" + noUsado + "]";
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
		return (Edad == 0 ? "?" : Edad) + " " + (Estudios == 0 ? "?" : Estudios) + " " + (claseSocial == 0 ? "?" : claseSocial) + " " + (Trabajo == 0 ? "?" : Trabajo) + " " + (Municipio == 0 ? "?" : Municipio)
				+ " " + (sexo == 0 ? "?" : sexo) + " " + (clase == 0 ? "?" : clase) + System.lineSeparator();
	}

}
