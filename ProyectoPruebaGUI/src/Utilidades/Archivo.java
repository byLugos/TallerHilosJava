package Utilidades;


import java.io.*;
import java.util.ArrayList;

public class Archivo {

	public boolean SobreescribirArchivo(String ruta, String texto) {

		// Ruta relativas (Recursos/)
		// Ruta absoluta (C:\Users\CamiloBD\eclipse-workspace\Vacunacion\Recursos)

		File archivo = new File(ruta);
		boolean existe = false;
		BufferedWriter bw;

		try {
			if (archivo.exists()) {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(texto + ";\n");
				existe = true;
			} else {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(texto);
				existe = false;

			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return existe;

	}

	public void AgregarContenido(String ruta, String texto) {

		// String ruta = "Resources/" + nombre + ".txt";
		File archivo = new File(ruta);

		try {

			FileWriter fstream = new FileWriter(archivo, true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(texto + ";\n");
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String ContenidoArchivoTotal(String ruta) {

		File archivo = new File(ruta);
		String cadena = null;
		String cadenaFinal = "++";

		try {

			FileReader f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);

			while ((cadena = b.readLine()) != null) {
				cadenaFinal = cadena + "++" + cadenaFinal;
			}

			b.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return cadenaFinal;

	}

	public ArrayList<String> ContenidoArchivo(String ruta) {

		File archivo = new File(ruta);
		String cadena = null;

		ArrayList<String> finalarray = new ArrayList<String>();

		try {

			FileReader f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);

			while ((cadena = b.readLine()) != null) {
				finalarray.add(cadena);
			}

			b.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return finalarray;

	}

	public void crearDirectorio(String Ruta) {

//	 File file = new File("C:\\Users\\DJWILLIAM\\Documents\\ECLIPSE\\Vacunacion\\Recursos\\Nuevo");
		File file = new File(Ruta);
		try {
			file.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("No se pudo crear el archivo");
		}
	}

	public int ContarLineasArchivo(String Ruta) {
		File f = new File(Ruta);
		int cont = 1;
		String inf;
		if (f.exists()) {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader b = new BufferedReader(fr);
				while ((inf = b.readLine()) != null) {
					++cont;
				}
				b.close();
				--cont;

			} catch (IOException ex) {
				ex.printStackTrace();
				System.err.println(ex.getMessage());
				System.err.println("No se pudo contar las lineas de texto del archivo");
			}
		}
		return cont;
	}

}
