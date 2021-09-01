package extend.animal;

public abstract class Animal {
	protected String name;
	
	public void eat() {
		System.out.println(name+"食事をしました");
	}
	public abstract void crt();
}
