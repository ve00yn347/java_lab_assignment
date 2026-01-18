package com.ymsli.assignment3.Q03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		Address address = new Address("36", "wwref", "fbd", "Hry");
		Employee employee = new Employee(347, "xyz", address, 40000);
		
		File file = new File("employee.ser");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
			oos.writeObject(employee);
			System.err.println("Serialized employee object.");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			Employee emp = (Employee) ois.readObject();
			System.out.println("Deserialized employee object: ");
			emp.display();
		} catch (IOException| ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
