package fitxer2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fitxer2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String ruta = "C:\\Users\\joan\\Documents\\CFGS-DAM2\\Documents_Fitxers\\NumerosReals2.txt";

        FileReader fr = new FileReader(ruta);
        BufferedReader bf = new BufferedReader(fr);
        ArrayList Numeros = new ArrayList<Integer>();

        try {
            String line = bf.readLine();
 //bucle per recorrer un fitxer
            while (line != null) {

                String[] parts = line.split(" ");

                for (int i = 0; i < parts.length; i++) {
                    Numeros.add(Integer.parseInt(parts[i]));
                }
                line = bf.readLine();

            }
            int max = 0;
            for (int i = 0; i < Numeros.size(); i++) {
                // System.out.println(Numeros.get(i));
                if ((int) Numeros.get(i) > max) {

                    max = (int) Numeros.get(i);

                }
            }
            System.out.println("El numero mes gran de la llista es " + max);
        } catch (IOException e) {
            System.out.println("error");

        }

    }
    
}
