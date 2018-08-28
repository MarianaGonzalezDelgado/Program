package proyecto240817;
<<<<<<< HEAD

=======
>>>>>>> nueva
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Semilla {
	public static void main(String[] args) throws IOException {	
		ArrayList<Person> people = new ArrayList<>();
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			for(int repet=0;repet<=5;repet++) {
				try {
					//fichero = new FileWriter("/home/administrator/Documents/prueba1/archivoprueba.txt", true);
					//fichero = new FileWriter("/home/administrator/Documents/prueba1/ar4.txt", true);
					fichero = new FileWriter("/home/administrator/Documents/ACT120718/PROJECTS/txt/archivopersonas.csv", true);
					pw = new PrintWriter(fichero);
					for(int i=0;i<=10000;i++) {
						File f = new File("/home/administrator/Documents/ACT120718/PROJECTS/txt/people.txt");
						Scanner cs = new Scanner(f);
						while(cs.hasNextLine()) {
							String line = cs.nextLine();
							String[] details = line.split(",");
							i++;
				            String inicioCadenaInsert = i + ",";
							String nombre = details[0] + "," ;
							String apellido = details[1] + " " ;
							String curp = details[2] + "," ;
				            String fecNacimiento = details[3] + "," ;
				            String genero = details[4] + "" ;
							String finCadenaInsert = "\n";
							Person p = new Person( inicioCadenaInsert, nombre, apellido, curp, 
						            fecNacimiento, genero, finCadenaInsert);
							people.add(p);
							//}//fin del for ids
						}//fin del while
						pw.println(people);
						//System.out.println(people + " " + repet);
						System.out.println(repet);
					}//fin de for 10000 
					}//fin de try
					catch (Exception e) {
						e.printStackTrace();
					} //fin del catch
					finally {
						try {
							if(null!= fichero)
								fichero.close();
							}//fin del try
						catch(Exception e2) {
							e2.printStackTrace();
						}//fin del catch e2
					}//fin del finally
				}//fin del try segundo
			}//fin del primer for 5 veces
		finally {
			System.out.println("Fin");
		}
			//}//fin del try primero
	
//End of class and public void
}	
=======
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.print.attribute.standard.DateTimeAtProcessing;
public class Semilla {
	public static void main(String[] args) throws IOException {
		//declarar arraylist
        ArrayList<Person> people = new ArrayList<>();
        //archivo para personas
        FileWriter fichero = null;
        PrintWriter pw = null;
        //declarar contadores
        int Contador;
        Contador = 1;
        //declarar llaves primarias
        String llavePrimariaPeople; //llave primaria persona
        //inicia proceso
        System.out.println("Inicia proceso " );
        DateTimeFormatter dtfInicia = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime nowInicia = LocalDateTime.now();
        System.out.println(dtfInicia.format(nowInicia)); //2016/11/16 12:08:43
       try {
           //archivo nuevo para personas
    	   fichero = new FileWriter("/home/administrator/Documents/ACT120718/PROJECTS/txt/archivopersonas.csv", true);
            pw = new PrintWriter(fichero);
            for(int repeat = 1; repeat <= 80; repeat++) {
                try {
                    System.out.println("Ciclo en for 80, repeat vale =  " + repeat );
                    for(int i = 1;i <= 100; i++) { 
                    	llavePrimariaPeople = UUID.randomUUID().toString();
                    	File f = new File("/home/administrator/Documents/ACT120718/PROJECTS/txt/people.txt");
                        Scanner cs = new Scanner(f);
                        people.clear();
                        while(cs.hasNextLine()) {
                        	llavePrimariaPeople = UUID.randomUUID().toString();
                            String line = cs.nextLine();
                            String[] details = line.split(",");
                            String inicioCadenaInsert = llavePrimariaPeople + ",";
                            String nombre = details[0] + " " + Contador + "," ;
                            String apellido = details[1] + " " + Contador + "," ;
                            String curp = details[2] + "," ;
                            String fecNacimiento = details[3] + "," ;
                            String genero = details[4] + "" ;
                            String finCadenaInsert = "\n";
                            Person p = new Person( inicioCadenaInsert, nombre, apellido, curp,
                                    fecNacimiento, genero, finCadenaInsert);
                            people.add(p);
                            Contador++;
                           }//fin del while persona
                        pw.print(people);
                        cs.close();
                    	}//fin del for que repite todo el arreglo  
                    }//fin del segundo try
                    catch (Exception e) {
                        e.printStackTrace();
                    } //fin del catch
                    finally {
                        try {
                            if(null!= fichero) 
                                fichero.close();
                            }//fin del try cerrar fichero
                        catch(Exception e2) {
                            e2.printStackTrace();
                        }//fin del catch e2
                    }//fin del finally
                }//fin del or que repite todo
            }//fin del primer try
        finally {
            System.out.format("%,8d%n", Contador);    // -->  " 461,012"
            System.out.println("Finaliza proceso " );
            DateTimeFormatter dtfFin = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime nowFin = LocalDateTime.now();
            System.out.println(dtfFin.format(nowFin)); //2016/11/16 12:08:43
            System.out.println("Fin");
        }//fin del finally de impreson en consola
//End of class and public void
}   
>>>>>>> nueva
}