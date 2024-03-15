// Imports
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Enunciado:
    // Crear una aplicación para Fortninte que permita gestionar las armas y skins del juego.
    // La aplicación debe registrar las armas por tipo y las skins de cada jugador
        
    // Requisitos:
    // Menú (Hecho [CLASE MAIN])
    // Bucle (Hecho [CLASE MAIN, DO WHILE])
    // Condicionales ()
    // Clase "Arma" ()
    // Clase "Skin" ()
    // Interfaz "FortniteManager" ()

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->

    // Declaración de los datos 

        // Botones 
        double BotónPresionado;
        double BotónElección;

        // Variables del menú
        String Usuario;
        String Contraseña;

    // Declaración de las otras clases
        
        // Arma
        Arma Arma = new Arma();

        // Skin
        Skin Skin = new Skin();

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->

    // Código Main

        // Creación del mensaje inicial
        JOptionPane.showMessageDialog(null, """
        Bienvenido a Fortnite Manager!

        Fortnite Manager es una nueva aplicación que te 
        permite administrar de manera remota tus armas 
        y skins que tengas registradas a tu cuenta de 
        Epic Games.

        Vamos a empezar por iniciar sesión
        """);
        
        // Creación del sistema de inicio de sesión

            // Usuario
            Usuario = JOptionPane.showInputDialog("""
            Por favor, introduce tu usuario de Epic Games
            """);

            // Contraseña 
            Contraseña = JOptionPane.showInputDialog("""
            Ahora tu contraseña
            """);
        
        // Creación del mensaje de inicio de sesión
        JOptionPane.showMessageDialog(null, "Parece que todo está correcto, Gracias por confiar en nosotros" + "\n\nBienvenido: " + Usuario);

        // Creación del menú de funciones
        do{
            BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("""
            Usuario: """ + Usuario + "\n" + """
                
            Escribe el número de la opción que desees: 

            1- Agregar un arma o skin al inventario
            2- Mostrar y buscar armas o skins
            3- Eliminar un arma o skin del inventario

            0- Salir del programa
            """));

            // Función 1: Agregar un Arma/Skin al inventario
            if(BotónPresionado == 1){

                // Menú de elección
                BotónElección = Double.parseDouble(JOptionPane.showInputDialog("""
                Escribe que quieres añadir:

                1- Armas
                2- Skins
                """));

                // Armas
                if(BotónElección == 1){
                    Arma.Agregar();
                }

                // Skins
                if(BotónElección == 2){
                    Skin.Agregar();
                }
            }

            // Función 2: Mostrar / Buscar Armas / Skins
            if(BotónPresionado == 2){
                
                // Menú de elección
                BotónElección = Double.parseDouble(JOptionPane.showInputDialog("""
                Escribe que quieres buscar:

                1- Armas
                2- Skins
                """));

                // Armas
                if(BotónElección == 1){
                    Arma.MostrarBuscar();
                }

                // Skins
                if(BotónElección == 2){
                    Skin.MostrarBuscar();
                }
            }

            // Función 3: Eliminar Armas / Skins
            if(BotónPresionado == 3){
                
                // Menú de elección
                BotónElección = Double.parseDouble(JOptionPane.showInputDialog("""
                Escribe que quieres eliminar:

                1- Armas
                2- Skins
                """));

                // Armas
                if(BotónElección == 1){
                    Arma.Eliminar();
                }

                // Skins
                if(BotónElección == 2){
                    Skin.Eliminar();
                }
            }

            // Comprobación
            if(BotónPresionado > 3){
                JOptionPane.showMessageDialog(null, "El valor introducido no es válido, por favor vuelve a intentarlo");
            }
        }while(BotónPresionado > 0);
    }
}
