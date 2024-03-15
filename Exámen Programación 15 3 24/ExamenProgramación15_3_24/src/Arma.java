// Imports
import java.util.*;
import javax.swing.*;

public class Arma implements FortniteManager{

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Requisitos:
    // Tipo (String) (Hecho)
    // Daño (Int) (Hecho)
    // Setters y Getters (Hecho)

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Declaración de los datos

        // Variables
        private String Tipo;
        private int Daño;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->        

    // Código Clase Arma

        // Creación del constructor por defecto
        public Arma(){

        }

        // Creación del constructor parametrizado
        public Arma(String T, int D){
            T = Tipo;
            D = Daño;
        }

        // Creación de los Setters y Getters

            // Setters
            public String SetTipo(String T){
                T = Tipo;

                Tipo = JOptionPane.showInputDialog("Escribe el tipo del arma que quieras agregar");
                return Tipo;
            }

            public int SetDaño(int D){
                D = Daño;

                Daño = Integer.parseInt(JOptionPane.showInputDialog("Escribe el daño del arma que quieras agregar"));
                return Daño;
            }

             // Getters
             public String GetTipo(String T){
                T = Tipo;
                return Tipo;
            }

            public int GetDaño(int D){
                D = Daño;
                return Daño;
            }

            // Creación de la lista de elementos
            private List<Arma> Armas;

            // Creación de los métodos (Implementados por interfaz)

                // Agregar Armas
                @Override
                public void Agregar(){

                    // Armas del jugador 
                    this.Armas.add(new Arma("Fuerte", 2));
                    this.Armas.add(new Arma("Fuerte", 2));

                    // Armas nuevas
                    this.Armas.add(new Arma(SetTipo(Tipo), SetDaño(Daño)));
                }

                // Mostrar Armas
                @Override
                public void MostrarBuscar(){

                    // Comprobación
                    if (Armas.isEmpty()){
                        System.out.println("No has registrado ningún arma todavía.");
                    } 
                    else {

                        // Impresión del inventario
                        for (int i = 0; i < Armas.size(); i++){
                            JOptionPane.showInputDialog(i + ": " + Armas.get(i));
                        }
                    }
                }

                // Eliminar Armas
                @Override
                public void Eliminar(){
                    this.Armas.remove(GetTipo(Tipo));
                }
}
