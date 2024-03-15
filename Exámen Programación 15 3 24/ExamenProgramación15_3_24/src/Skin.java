// Imports
import java.util.*;
import javax.swing.*;

public class Skin implements FortniteManager{

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Requisitos:
    // Nombre (String) (Hecho)
    // Rareza (String) (Hecho)
    // Setters y Getters (Hecho)

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Declaración de los datos

        // Variables
        private String Nombre;
        private String Rareza;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Código Clase Arma

        // Creación del constructor por defecto
        public Skin(){

        }

        // Creación del constructor parametrizado
        public Skin(String N, String R){
            N = Nombre;
            R = Rareza;
        }

        // Creación de los Setters y Getters

            // Setters
            public String SetNombre(String N){
                N = Nombre;

                Nombre = JOptionPane.showInputDialog("Escribe el nombre de la skin que quieras agregar");
                return Nombre;
            }

            public String SetRareza(String R){
                R = Rareza;

                Rareza = JOptionPane.showInputDialog("Escribe la rareza de la skin quieras agregar");
                return Rareza;
            }

             // Getters
             public String GetNombre(String N){
                N = Nombre;
                return Nombre;
            }

            public String GetRareza(String R){
                R = Rareza;
                return Rareza;
            }

            // Creación de la lista de elementos
            private List<Skin> Skins;

            // Creación de los métodos (Implementados por interfaz)

                // Agregar Skins
                @Override
                public void Agregar(){

                    // Skins del jugador 
                    this.Skins.add(new Skin("Skin Pez", "Común"));
                    this.Skins.add(new Skin("Skin Plátano", "Épica"));

                    // Skins nuevas
                    this.Skins.add(new Skin(SetNombre(Nombre), SetRareza(Rareza)));
                }

                // Mostrar Skins
                @Override
                public void MostrarBuscar(){

                    // Comprobación
                    if (Skins.isEmpty()) {
                        System.out.println("No has registrado ninguna Skin todavía.");
                    } 
                    else {

                        // Impresión del inventario
                        for (int i = 0; i < Skins.size(); i++){
                            JOptionPane.showInputDialog(i + ": " + Skins.get(i));
                        }
                    }
                }

                // Eliminar Skins
                @Override
                public void Eliminar(){
                    this.Skins.remove(GetNombre(Nombre));
                }
}