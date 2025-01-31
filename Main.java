import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Postfix postfix = new Postfix();

        // Solicitar la expresión al usuario
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingrese el nombre del Archivo (Asegurese que está dentro del directorio):");
            String fileName = scanner.nextLine();
            System.out.println("Expresion ingresada: '" + fileName + "'...");
            String file = fileName;
    
            if (!Files.exists(Paths.get(file))){
                System.out.println("El archivo '" + fileName + "' no se encuentra en el directorio.");
                    return; 
            }
             // Operar la expresión
        int result = postfix.operateFile(file);

        // Mostrar el resultado
        System.out.println("Resultado de la expresión postfija: " + result);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            scanner.close(); // Cerrar el scanner
        }
        }
    }