package app;

import java.util.Scanner;

import pilasconlistas.PilasconListas;
import pilasconlistas.StackEmptyException;
import pilasconlistas.StackFullException;

public class App {
	static Scanner lector = new Scanner(System.in);
	static int dim;
	public static void main(String[] args) {

		PilasconListas<String> names = new PilasconListas<String>(); // <-- GUARDA CADENAS
		
		
		
		try {
			names.push("Abraham");
			names.push("Laura");
			names.push("Ana");
			names.push("Luis");
			names.push("Alejandro");
			names.push("Yarely");
			names.push("Ricardo");
			names.push("Angelica");
			
			System.out.println("---------POP----------");
			System.out.println(names.pop());
			System.out.println("---------POP----------");
			System.out.println(names.pop());
			System.out.println("---------Size---------");
			System.out.println(names.size());
			System.out.println("---------PEEK---------");
			System.out.println(names.peek());
			System.out.println("---------Search--------");
			System.out.println(names.search("Abraham"));
			System.out.println("----IMPRIMIR-----");
			for (String string :names) {
				System.out.println(string);
			}	
			names.clear();
			System.out.println("----IMPRIMIR despues de CLEAR-----");
			for (String string :names) {
				System.out.println(string);
			}	
		} 
		catch (StackEmptyException | StackFullException f) {
			f.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
	
	}
}


















