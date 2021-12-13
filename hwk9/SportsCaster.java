public class SportsCaster implements Speaker{

	SportsCaster(){};
	
	public void speak(){
	System.out.println("I am a Sports Caster.");
	}
	
	public void announce(String str){
	System.out.println(str);
	}

}