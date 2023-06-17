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
        int revision = 0;
        int opc = 0;

        int Respuesta = 1;

        while (Respuesta == 1) {

            Menu();//Entrar y salir de la libreria

            opc = leer.nextInt();

            if (revision == 0) {
                opc = 1;
                System.out.println("Tiene que insertar unlibro antes de realizar otra accion");
            }
            switch (opc) {
                case 1: {

                    int ciclo = 1;

                    while (ciclo == 1) {
                        Menulibro();//Entrar y salir de las opciones de la libreria

                        int OPC = leer.nextInt();

                        switch (OPC) {

                            case 1: {

                                insertar();
                                revision = revision + 1;

                            }
                            break;

                            case 2: {

                                imprimir();

                            }
                            break;

                            case 3: {

                                modificar();

                            }
                            break;

                            case 4: {

                                eliminar();

                            }
                            break;

                            case 5: {

                                titulo();

                            }
                            break;

                            case 6: {
                                autor();

                            }
                            break;

                            case 7: {
                                
                                genero();

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

    public static void insertar() {

        String titulo;
        String autor;
        String genero;
        int edad;
        Libro help;

        int i, j;

        do {
            System.out.print("Ingrese cuantos libros quiere ingresar ");
            j = leer.nextInt();
        } while (j < 0);
        leer.nextLine();

        for (i = 1; i <= j; i++) {

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
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i));
        }
    }

    public static void modificar() {
        Scanner lea = new Scanner(System.in);

        imprimir();
        System.out.println("Ha ingresado la opción de modificar libros, elija el libro que modificara:");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + "# " + libros.get(i).getTitulo());
        }
        int numero = lea.nextInt();
        leer.nextLine();

        Libro libro = libros.get(numero - 1);

        System.out.println("¿que atributo desea modificar?");
        System.out.println("1. titulo");
        System.out.println("2. Autor");
        System.out.println("3. genero");
        System.out.println("4. Edad");
        int opcion = lea.nextInt();

        lea.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el titulo: ");
                String nuevoT = leer.nextLine();
                libro.setTitulo(nuevoT);
                break;
            case 2:
                System.out.print("Ingrese el autor: ");
                String nuevoA = leer.nextLine();
                libro.setAutor(nuevoA);
                break;
            case 3:
                System.out.print("Ingrese el genero: ");
                String nuevoG = leer.nextLine();
                libro.setGenero(nuevoG);
                break;
            case 4:
                System.out.print("Ingrese la edad minima: ");
                int nuevaE = leer.nextInt();
                leer.nextLine();
                libro.setEdad(nuevaE);
                break;
            default:
                System.out.println("INVALIDO");
        }

        System.out.println(
                "¡Libro modificado exitosamente!");
    }

    public static void eliminar() {
        Scanner Lea = new Scanner(System.in);
        System.out.println("Cual quiere borrar??");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + "# " + libros.get(i).getTitulo());
        }

        int num = Lea.nextInt();
        Lea.nextLine();

        if (num >= 1 && num <= libros.size()) {
            System.out.println("Ya se borro el libro");
            Libro libro = libros.get(num - 1);//-1 ya que inicia en cero dku

            libros.remove(libro);

        } else {
            System.out.println("El numero que ingreso no es valido");
        }

    }

    public static void titulo() {
        Scanner LEA = new Scanner(System.in);
        System.out.print("Ingrese el titulo del libro que quiere buscar ");
        String buscar = LEA.nextLine();

        boolean validar = false;

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(buscar)) {
                System.out.println("SE ENCONTRO");
                System.out.println("Libro");
                System.out.println("TITULO " + libro.getTitulo());
                System.out.println("edad minima " + libro.getEdad());
                System.out.println("genero " + libro.getGenero());
                System.out.println("autor " + libro.getAutor());
                System.out.println();
                validar = true;
            }
        }
        if (!validar) {
            System.out.println("Ese titulo no se ha ingresado ");
        }
    }

    public static void autor() {
        Scanner LEER = new Scanner(System.in);
        System.out.print("Ingrese el autor a buscar: ");
        String autorBuscado = LEER.nextLine();

        boolean validar = false;

        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autorBuscado)) {
                System.out.println("SE ENCONTRO");
                System.out.println("Libro");
                System.out.println("genero " + libro.getGenero());
                System.out.println("AUTOR " + libro.getAutor());
                System.out.println("edad minima " + libro.getEdad());
                System.out.println("titulo " + libro.getTitulo());
                
                System.out.println();
                validar = true;
            }
        }

        if (!validar) {
            System.out.println("Ese autor no se ha ingresado ");
        }
    }

    public static void genero() {
        Scanner ok = new Scanner(System.in);
        System.out.print("Ingrese el genero que quiere buscar ");
        String generoBuscado = ok.nextLine();

        boolean validar = false;

        for (Libro libro : libros) {
            if (libro.getGenero().equalsIgnoreCase(generoBuscado)) {
                System.out.println("SE ENCONTRO");
                System.out.println("Libro");
                System.out.println("titulo: " + libro.getTitulo());
                System.out.println("GENERO: " + libro.getGenero());
                System.out.println("autor: " + libro.getAutor());
                System.out.println("edad minima: " + libro.getEdad());
                System.out.println();
                validar = true;
            }
        }

        if (!validar) {
            System.out.println("Ese genero no se ha ingresado ");
        }
    }

}
