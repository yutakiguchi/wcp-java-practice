package classMethod;
import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は"+yamada.name+"で年齢は"+yamada.age+"です");
		
		Human02 sato = new Human02("佐藤",25);
		System.out.println("名前は"+sato.name+"で年齢は"+sato.age+"です");
		
	}
}
