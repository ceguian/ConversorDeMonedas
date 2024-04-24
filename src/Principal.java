import com.google.gson.JsonSyntaxException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String monedas = """
               *********************************************
                                BIENVENIDO
                Divisas disponibles:
                
                    ARS - Peso argentino
                    BOB - Boliviano boliviano
                    BRL - Real brasileño
                    CLP - Peso chileno
                    COP - Peso colombiano
                    USD - Dólar estadounidense
                    
               *********************************************
                """;

        Scanner lectura = new Scanner(System.in);

        ConversorApi conversorApi = new ConversorApi();

        System.out.println(monedas);
        while (true){
            try{
                System.out.println("Elija la moneda a convertir (Ej. MXN)");
                String divisa = lectura.next().toUpperCase();
                System.out.println("Elija la moneda objetivo (Ej. ZAR");
                String cambio = lectura.next().toUpperCase();

                System.out.println("Elija la cantidad a transformar");
                double valor = lectura.nextDouble();
                var convertido = conversorApi.convertirDivisa(divisa, cambio,valor);
                System.out.println("El valor "+ valor + " " + divisa + " es igual a " + convertido + " " + cambio);


            }catch (InputMismatchException | JsonSyntaxException e){
                System.out.println("Datos Inválidos.");
            }
            System.out.println("Escriba <<no>> para dejar de convertir  ");
            String opc = lectura.next();
            if (opc .equalsIgnoreCase("no")){
                System.out.println("Gracias por utilizar nuestros servicios.");
                break;
            }
        }



    }
}
