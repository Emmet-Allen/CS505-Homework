public class Host implements Speaker{
	
	Host(){};
	
	public void speak(){
	System.out.println("I am a Host.");
	}
	
	public void announce(String str){
	System.out.println(str);
	}
	
}