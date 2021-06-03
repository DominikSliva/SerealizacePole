package serializacePole;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
	 
		
		
		String filename = "BlokSerializace.dat";
		
		Random rd = new Random();
		
		
		
		ArrayList<ArrayList<ArrayList<Integer>>> pole = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
		    pole.add(new ArrayList<ArrayList<Integer>>());
		    
		    
		    for (int j = 0; j < 100; j++) {
		        pole.get(i).add(new ArrayList<Integer>());
		        
		    for (int e = 0; e < 100; e++) {
		    	pole.get(i).add(new ArrayList<Integer>());
		 		
		    }
		        
		    }
		}
		
		try
        {   
          
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
      
            out.writeObject(pole);
              
            out.close();
            file.close();
              
            System.out.println("Objekt byl serializován");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("Chyba pøi zápisu");
        }
		
	
	 try { 
		 
		 InputStream file = new FileInputStream("BlokSerializace.dat");
	         ObjectInputStream in = new ObjectInputStream(file);{
	         
	         SeznamZaznamu sz = (SeznamZaznamu) in.readObject(); 
	         
	    }
	 }
	 
	 catch (ClassNotFoundException e) {
	       System.out.println("Nemohu najít definici tøídy: "+e);
	    } catch (IOException e) {
	       System.out.println("Chyba pøi ètení souboru : "+e);
	    }
	 }
	 
}
