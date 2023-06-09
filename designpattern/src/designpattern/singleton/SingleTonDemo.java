package designpattern.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class SingleTonDemo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.setId(15);
		System.out.println(classA.getId());
		
		ClassA classB= new ClassA();
		classB.setId(10);
		System.out.println(classB.getId());
		System.out.println(classA == classB);
		System.out.println(classA.hashCode());
		System.out.println(classB.hashCode());
		
        // SingletonClass sc = new SingletonClass();
		
		//Singleton Example
		SingletonClass singletonClass = SingletonClass.getInstance();
		SingletonClass singletonClassA = SingletonClass.getInstance();
		System.out.println(singletonClass == singletonClassA);
		System.out.println(singletonClass.hashCode());
		System.out.println(singletonClassA.hashCode());
		
		

		DBConnection dbConnection = DBConnection.getInstance();
		try {
			Connection connection =dbConnection.getConnection();
			connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
