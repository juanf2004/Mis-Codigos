package Proyecto;

import javax.swing.*;



public class Prueba1
{
    static int opcionprincipal;
    static int [] capitanes={1,1,1,1,1,1};
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

    static int[][] partidos = new int[6][6];
    static int[][] resultadosdelajornada= new int[6][6];
    static int[][] tabladeconteo= new int[6][5];

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
                partidosdeunajornada();

            }else if (opcionprincipal==4)
            {
                partidosporjornada();

            }else if (opcionprincipal==5)
            {
                Todoscontratodos();
                partidosporjornada();
                resultadosdelajornada();
                contadegoles();
            }
            }
        }
        JOptionPane.showMessageDialog(null,"Salio del programa");
    }
    public static void menu()
    {
        opcionprincipal=Integer.parseInt(JOptionPane.showInputDialog("Digite opcion \n 1.Administrar un equipo  \n 2.Tabla de posiciones \n 3.Resultados de la jornada \n 4.Iniciar juego\n 5.Iniciar campeonato \n 6.Salir"));
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
        int[][] tabladeposiciones = new int[6][3];
        int cotador=0,auxiliar;
        for (int i=0;i<6;i++)
        {
            tabladeposiciones[i][1]=tabladeconteo[i][0]*2+tabladeconteo[i][1];
            tabladeposiciones[i][0]=i+1;
            tabladeposiciones[i][2]=tabladeconteo[i][0];
            System.out.println();
            System.out.println("Equipo "+(i+1)+" con "+tabladeposiciones[i][1]+" puntos con "+tabladeposiciones[i][2]+" juegos ganandos");
        }
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<5;j++)
            {
                if (tabladeposiciones[j][1]<tabladeposiciones[j][1])
                {
                    
                }else if (tabladeposiciones[j][1]==tabladeposiciones[j][1])
                {
                    
                }
            }
        }


    }
    public static void Todoscontratodos()
    {
        int jornada;
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                if (i==j)
                {
                    partidos[i][j]=-1;
                }else{
                    partidos[i][j]=0;
                }
            }
        }
        for (jornada=1;jornada<=5;jornada++)
        {
            for (int i=0;i<3;i++)
            {
                int e1=(int) (Math.random() * 6 + 0);
                int e2=(int) (Math.random() * 6 + 0);
                if (partidos[e1][e2] != 0)
                {
                    while (partidos[e1][e2] != 0)
                    {
                        e1 = (int) (Math.random() * 6 + 0);
                        e2 = (int) (Math.random() * 6 + 0);
                    }
                }
                partidos[e1][e2]=jornada;
                partidos[e2][e1]=jornada;
            }
        }
        for (int i=0;i<6;i++)
        {
            System.out.println(" ");
            for (int j=0;j<6;j++)
            {
                System.out.print(partidos[i][j]+" ");
            }
        }
    }
    public static void partidosporjornada()
    {
        System.out.println();
        int jornada;
        for (jornada=1;jornada<6;jornada++)
        {
            System.out.println("Jornada"+jornada);
            for (int i=0;i<6;i++)
            {
                for (int j=i+1;j<6;j++)
                {
                    if (partidos[i][j]==jornada)
                {
                    System.out.println("Equipo"+(i+1)+" Vs "+"Equipo"+(j+1));
                    System.out.println(resultadosdelajornada[i][j]+"goles"+"Vs"+resultadosdelajornada[j][i]+"goles");
                }
                }
            }
        }
    }
    public static void resultadosdelajornada()
    {
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                if (i==j)
                {
                    resultadosdelajornada[i][j]=-1;
                }else{
                    resultadosdelajornada[i][j]=(int) (Math.random() * 4 + 0);
                }
            }
        }
        for (int i=0;i<6;i++)
        {
            System.out.println(" ");
            for (int j=0;j<6;j++)
            {
                System.out.print(resultadosdelajornada[i][j]+" ");
            }
        }
    }
    public static void partidosdeunajornada()
    {
        System.out.println();
        int jornada=Integer.parseInt(JOptionPane.showInputDialog("Digite jornada"));

            System.out.println("Jornada"+jornada);
            for (int i=0;i<6;i++)
            {
                for (int j=i+1;j<6;j++)
                {
                    if (partidos[i][j]==jornada)
                    {
                        System.out.println("Equipo "+(i+1)+" Vs "+"Equipo "+(j+1));
                        System.out.println(resultadosdelajornada[i][j]+" goles "+"Vs "+resultadosdelajornada[j][i]+" goles");
                    }
                }
            }
    }
    public static void contadegoles()
    {
        int Juegosganados=0,juegosempatados=0,juegosperdidos=0,contagoles=0,contagolescontra=0;
        for (int i=0;i<6;i++)
        {
            Juegosganados=0;
            juegosempatados=0;
            juegosperdidos=0;
            contagoles=0;
            contagolescontra=0;
            System.out.println();
            for (int j=0;j<6;j++)
            {
                if (i!=j)
                {
                    if (resultadosdelajornada[i][j]>resultadosdelajornada[j][i])
                    {
                        Juegosganados=Juegosganados+1;
                    }else if (resultadosdelajornada[i][j]==resultadosdelajornada[j][i])
                    {
                        juegosempatados=juegosempatados+1;
                    }else if (resultadosdelajornada[i][j]<resultadosdelajornada[j][i])
                    {
                        juegosperdidos=juegosperdidos+1;
                    }
                    contagoles=contagoles+resultadosdelajornada[i][j];
                    contagolescontra=contagolescontra+resultadosdelajornada[j][i];
                }
            }
            tabladeconteo[i][0]=Juegosganados;
            tabladeconteo[i][1]=juegosempatados;
            tabladeconteo[i][2]=juegosperdidos;
            tabladeconteo[i][3]=contagoles;
            tabladeconteo[i][4]=contagolescontra;

        }
        for (int i=0;i<6;i++)
        {
            System.out.println();
            for (int j=0;j<5;j++)
            {
                System.out.print(tabladeconteo[i][j]+" ");
            }
        }
    }
}


