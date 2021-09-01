package exted;

import exted.human.Employee;
import exted.human.Human;
import exted.human.Student;

public class Extend {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本",16);
		System.out.println("Humanクラスのメソッド：名前は"+sugimoto.getName());
		
		Student sato = new Student("佐藤",17,70);
		System.out.println("Humanクラスのメソッド：名前"+sato.getName());
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します"+sato.getStudentProfile());
		
		Human human = new Employee("田中",28,"システム部");
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します"+human.getName());
		
		Employee tanaka = (Employee)human;
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します"+tanaka.getEmployeeProfile());
		
		Extend.printName(sugimoto);
		Extend.printName(sato);
		Extend.printName(tanaka);
		
		
		}
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は"+human.getName());
	}
}
