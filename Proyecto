package Proyecto;

import javax.swing.*;


public class Prueba1
{
    static int opcionprincipal;
    static int [] capitanes={1,1,1,1,1,1};//El 4 no se hace,y en el 6 no se cuentan los arbitros y el jugador el tipo de gol y el minuto.
    static String [][] Nombres  =
            {
                    {"Armando","Abel","Antonio","Andrea","Andres","Alejandro","Andreas","Adriana","Amanda","Aurora","Amparo","Aquiles","Adolfo","Alberto","Alvaro","Alfredo"},
                    {"Beatriz","Bianca","Brian","Bruno","Bautista","Barbara","Basilio","Benedicto","Blanca","Baltasar","Benjamin","Bonifacio","Boleslao","Bosco","Borja","Biron"},
                    {"Camila","Carlos","Cristina","Cristian","Claudia","Claudio","Casandra","Camilo","Carmelo","Cesar","Cristopher","Celestino","Carol","Casimiro","Calixto","Cain"},
                    {"Dante","Daniel","Daniela","Daisuke","Dylan","Danilo","Dolores","David","Dario","Diego","Dayana","Damian","Demetrio","DereK","Dionisio","Drona"},
                    {"Edgar","Eduardo","Edwin","Efrain","Edmundo","Elias","Eladio","Emma","Elena","Emili","Emilio","Erica","Esperanza","Eva","Enrique","Eren"},
                    {"Francina","Fabian","Federico","Frida","Felix","Fausto","Fermin","Federica","Felipe","Fernando","Freddy","Florentino","Francisco","Fatima","Florencia","Fidel"}
            };

    static String [][] Posicion =
            {
                    {"Arquero","Arquero","Defensa","Defensa","Defensa","Defensa","Defensa","Defensa","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Delantero","Delantero","Delantero"},
                    {"Arquero","Arquero","Defensa","Defensa","Defensa","Defensa","Defensa","Defensa","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Delantero","Delantero","Delantero"},
                    {"Arquero","Arquero","Defensa","Defensa","Defensa","Defensa","Defensa","Defensa","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Delantero","Delantero","Delantero"},
                    {"Arquero","Arquero","Defensa","Defensa","Defensa","Defensa","Defensa","Defensa","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Delantero","Delantero","Delantero"},
                    {"Arquero","Arquero","Defensa","Defensa","Defensa","Defensa","Defensa","Defensa","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Delantero","Delantero","Delantero"},
                    {"Arquero","Arquero","Defensa","Defensa","Defensa","Defensa","Defensa","Defensa","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Mediocampista","Delantero","Delantero","Delantero"}
            };

    static Boolean [][] Estado =
            {
                    {true,false,true,true,true,true,false,false,true,true,true,false,false,true,true,true},
                    {true,false,true,true,true,true,false,false,true,true,true,false,false,true,true,true},
                    {true,false,true,true,true,true,false,false,true,true,true,false,false,true,true,true},
                    {true,false,true,true,true,true,false,false,true,true,true,false,false,true,true,true},
                    {true,false,true,true,true,true,false,false,true,true,true,false,false,true,true,true},
                    {true,false,true,true,true,true,false,false,true,true,true,false,false,true,true,true}
            };
    static int [][] Tabladeposiciones =
            {
                    {5,5,0,0,18,6,12},
                    {5,3,1,1,26,9,17},
                    {5,2,1,2,21,12,9},
                    {5,2,1,2,14,19,-5},
                    {5,1,1,3,8,26,-18},
                    {5,0,0,5,6,21,-15}
            };
    static String [][] Resultadosdelajornada =
            {
                    {"1 vs 2","3 vs 4","5 vs 6"},
                    {"1 vs 3","4 vs 6","2 vs 5"},
                    {"1 vs 4","2 vs 6","3 vs 5"},
                    {"1 vs 5","2 vs 4","3 vs 6"},
                    {"1 vs 6","2 vs 3","4 vs 5"},
            };
    static String [][] Resultadosdelajornadaganados =
            {
                    {"Gano el equipo 1","Gano el equipo 3","Empatados"},
                    {"Gano el equipo 3","Gano el equipo 6","Gano el equipo 5"},
                    {"Empatados","Gano el equipo 6","Gano el equipo 3"},
                    {"Gano el equipo 1","Gano el equipo 4","Gano el equipo 3"},
                    {"Gano el equipo 1","Gano el equipo 3","Gano el equipo 4"},
            };

    public  static void main(String[] args)
    {

        {
            while (opcionprincipal!=6){
            menu();

            if (opcionprincipal==1)
            {
                Administrarunequipo();
            }else if (opcionprincipal==2)
            {
                Tabladeposiciones();
            }else if (opcionprincipal==3)
            {
                Resultadosdelajornada();
            }else if (opcionprincipal==4)
            {
                Iniciarjuego();
            }else if (opcionprincipal==5)
            {
                Simularcampeonato();
            }
            }
        }
        JOptionPane.showMessageDialog(null,"Salio del programa");
    }
    public static void menu()
    {
        opcionprincipal=Integer.parseInt(JOptionPane.showInputDialog("Digite opcion \n 1.Administrar un equipo  \n 2.Tabla de posiciones \n 3.Resultados de la jornada \n 4.Iniciar juego \n 5.Simular campeonato \n 6.Salir"));
    }
    public static void Administrarunequipo ()
    {
        int opcionadministrar=0;
        int numjug,numerodejugadorentra;
        int numeroequipo;
        String nuevaposicion;
        System.out.println("Administrar un equipo");
        //Opciones
        while (opcionadministrar!=7) {
            opcionadministrar = Integer.parseInt(JOptionPane.showInputDialog("Digite opcion \n 1.Ver jugadores y sus posiciones  \n 2.Cambiar de posicion un jugador \n 3.Ingresar un nuevo jugador \n 4.Sustituir jugadores \n 5.Elegir un capitan  \n 6.Cambiar estado \n 7.Salir"));
            //Que equipo ver
            if (opcionadministrar == 1)
            {
                System.out.println("Ver jugadores y sus posiciones");

                numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));

                System.out.println("Equipo "+numeroequipo);
                for (int i=0;i<16;i++)
                {
                    System.out.println((i+1)+" " +Nombres[numeroequipo-1][i]+" - "+Posicion[numeroequipo-1][i]);
                }


            }else if (opcionadministrar == 2)//Cambiar de posicion
            {
                System.out.println("Cambiar de posicion un jugador");

                numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));
                System.out.println("Equipo "+numeroequipo);
                for (int i=0;i<16;i++)
                {
                    System.out.println((i+1)+" "+Nombres[numeroequipo-1][i]+" - "+Posicion[numeroequipo-1][i]);
                }
                numjug=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador"));
                nuevaposicion=JOptionPane.showInputDialog("Digite la posicion");
                Posicion[numeroequipo-1][numjug-1]=nuevaposicion;


            }else if (opcionadministrar == 3)
            {
                System.out.println("Ingresar un nuevo jugador ");
                numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));
                System.out.println("Equipo "+numeroequipo);
                for (int i=0;i<16;i++)
                {
                    System.out.println((i+1)+" "+Nombres[numeroequipo-1][i]);
                }
                numjug=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador que se va"));
                Nombres[numeroequipo-1][numjug-1]=JOptionPane.showInputDialog("Digite el nuevo nombre");

            }else if (opcionadministrar == 4)
            {
                System.out.println("Sustituir  un jugadores ");
                numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));
                System.out.println("Equipo "+numeroequipo);
                System.out.println("Jugando");
                for (int i=0;i<16;i++)
                {
                    System.out.println((i+1)+" "+Nombres[numeroequipo-1][i]+" - "+Posicion[numeroequipo-1][i]);
                }
                numjug=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador que sale"));
                numerodejugadorentra=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador que entra"));
                Estado[numeroequipo-1][numjug-1]=false;
                Estado[numeroequipo-1][numerodejugadorentra-1]=true;
            }else if (opcionadministrar == 5)
            {
                System.out.println("Elegir un capitan ");

                numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));
                int c = capitanes[numeroequipo-1];
                System.out.println("El capitan actual es "+Nombres[numeroequipo-1][c-1]);
                for (int i=0;i<16;i++)
                {
                    System.out.println((i+1)+" " +Nombres[numeroequipo-1][i]+" - "+Posicion[numeroequipo-1][i]);
                }
                numjug=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador para ser el nuevo capitan"));
                capitanes[numeroequipo-1]=numjug;

            }else if (opcionadministrar == 6)
            {
                System.out.println("Cambiar estado ");
                numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));
                System.out.println("Equipo "+numeroequipo);
                System.out.println("Jugando");
                for (int i=0;i<16;i++)
                {
                    if (Estado[numeroequipo-1][i]==Boolean.TRUE)
                    {
                        System.out.println((i+1)+" "+Nombres[numeroequipo-1][i]+" - "+Posicion[numeroequipo-1][i]);
                    }
                }
                System.out.println("Jugadores en banca");
                for (int i=0;i<16;i++)
                {
                    if (Estado[numeroequipo-1][i]==Boolean.FALSE)
                    {
                        System.out.println((i+1)+" "+Nombres[numeroequipo-1][i]+" - "+Posicion[numeroequipo-1][i]);
                    }
                }
                numjug=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador que sale"));
                numerodejugadorentra=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del jugador que entra"));
                Estado[numeroequipo-1][numjug-1]=false;
                Estado[numeroequipo-1][numerodejugadorentra-1]=true;
            }
        }
        JOptionPane.showMessageDialog(null,"Salio de administrar un equipo");
    }
    public static void Tabladeposiciones ()
    {
        int numeroequipo;
        System.out.println("Leyenda\n 1.Jugados\n 2.Ganados\n 3.Empatados\n 4.Perdidos\n 5.Goles a favor\n 6.Goles en contra\n 7.Diferencia");
        numeroequipo=Integer.parseInt(JOptionPane.showInputDialog("Digite el equipo \n 1.Equipo 1\n 2.Equipo 2\n 3.Equipo 3\n 4.Equipo 4\n 5.Equipo 5\n 6.Equipo 6\n 7.Salir"));
        for (int i=0;i<7;i++)
        {
            System.out.println(Tabladeposiciones[numeroequipo-1][i]);
        }
    }
    public static void Resultadosdelajornada ()
    {
        int numjornada;
        numjornada=Integer.parseInt(JOptionPane.showInputDialog("Digite la jornada \n 1.jornada 1\n 2.jornada 2\n 3.jornada 3\n 4.jornada 4\n 5.jornada 5"));

        System.out.println("Jornada "+numjornada);
        for (int i=0;i<3;i++)
        {
            System.out.println(Resultadosdelajornada[numjornada-1][i]+" "+Resultadosdelajornadaganados[numjornada-1][i]);
        }
    }
    public static void Iniciarjuego ()
    {
        System.out.println("Iniciarjuego");
    }
    public static void Simularcampeonato ()
    {
        System.out.println("Simular campeonato");
    }
}
