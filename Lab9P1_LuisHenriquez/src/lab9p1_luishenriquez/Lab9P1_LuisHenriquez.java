package lab9p1_luishenriquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9P1_LuisHenriquez {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Libro> libros = new ArrayList();
    static Libro help;
    
    
    
    public Libro getHelp() {
        return help;
    }

    public void setHelp(Libro help) {
        this.help = help;
    }
    
    public static void main(String[] args) {

        int opc = 0;

        int Respuesta = 1;

        while (Respuesta == 1) {

            Menu();//Entrar y salir de la libreria

            opc = leer.nextInt();

            switch (opc) {
                case 1: {

                    int ciclo = 1;

                    while (ciclo == 1) {
                        Menulibro();//Entrar y salir de las opciones de la libreria

                        int OPC = leer.nextInt();

                        switch (OPC) {

                            case 1: {

                                leerCoches();

                            }
                            break;

                            case 2: {

                                imprimir();

                            }
                            break;

                            case 3: {

                            }
                            break;

                            case 4: {

                            }
                            break;

                            case 5: {

                            }
                            break;

                            case 6: {

                            }
                            break;

                            case 7: {

                            }
                            break;

                            case 8: {
                                ciclo = 2;
                            }

                            break;
                            default: {
                                if (opc != 2) {
                                    System.err.println("Numero invalido");
                                }
                            }
                            break;
                        }

                    }
                }
                break;

                case 2: {
                    Respuesta = 2;
                }
                break;

                default: {
                    if (opc != 2) {
                        System.err.println("Numero invalido");
                    }
                }
                break;
            }//fin switch

        }//fin while

    }

    public static int Menu() {

        int opc = 0;

        System.out.println("1.Libros y más Libros REMASTERED ");

        System.out.println("2. Salir");

        System.out.println("Ingrese una opcion");

        return opc;

    }//fin Menu  

    public static int Menulibro() {

        int OPC = 0;

        System.out.println("1.Agregar Libro ");

        System.out.println("2.Listar libros ");

        System.out.println("3.Modificar libro ");

        System.out.println("4.Eliminar libro ");

        System.out.println("5.Buscar libro por titulo ");

        System.out.println("6.Buscar libros según autor ");

        System.out.println("7.Búsqueda con filtro de genero ");

        System.out.println("8.Salir ");

        System.out.println("Ingrese una opcion");

        return OPC;

    }//fin Menu  

    //Método para leer coches e introducirlos en el array
    public static void leerCoches() {

        //Declaración de variables para leer los datos de los coches
        String titulo;
        String autor;
        String genero;
        int edad;
        Libro help;

        int i, j;

        //se pide por teclado el número de libros 
        do {
            System.out.print("Ingrese cuantos libros quiere ingresar ");
            j = leer.nextInt();
        } while (j < 0);
        leer.nextLine(); //limpiar el intro

        //lectura de N coches
        for (i = 1; i <= j; i++) {
            //leer datos de cada coche
            System.out.println("Libro numero: " + i);
            System.out.print("Título: ");
            titulo = leer.nextLine();
            System.out.print("Género: ");
            genero = leer.nextLine();
            System.out.print("Autor: ");
            autor = leer.nextLine();
            System.out.print("Edad mínima: ");
            edad = leer.nextInt();
            leer.nextLine();

            help = new Libro(titulo, genero, autor, edad);
           // Libro lib = new Libro(titulo, genero, autor, edad);

            //se asignan valores a los atributos del nuevo objeto
            help.setTitulo(titulo);
            help.setGenero(genero);
            help.setAutor(autor);
            help.setEdad(edad);

            //se añade el objeto al final del array
            libros.add(help);

        }
    } //fin para ingresar Libros

     static void imprimir() {
        System.out.println(help.toString());
    }
}
