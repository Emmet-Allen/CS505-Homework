public class SpeakerTest{

	public static void main(String[] args){
	
	Host joe = new Host();
	VoiceActor tiffany = new VoiceActor();
	SportsCaster stephen = new SportsCaster();
	
	String joeSay = "This is Joe Rogan, from the Joe Rogan Podcast.";
	String tiffanySay = "This is Tiffany Haddish, and I play CoCo in the new Pets Movie.";
	String stephenSay = "This is Stephen A. Smith I am a Basketball Sports Caster."; 
	
	
	joe.speak();
	tiffany.speak();
	stephen.speak();
	
	joe.announce(joeSay);
	tiffany.announce(tiffanySay);
	stephen.announce(stephenSay);
	
	}

}