class Time {
	private int hour;
	private int minute;
	private int second;
		
	public Time( ) { };
	public Time(int  hr , int  min, int  sec) {  
        hour = hr;
        minute = min;
        second = sec; 
    }
	public void setTime(int  hr , int  min, int  sec) {  
        hour = hr; 
        minute = min;
        second = sec; 
    }
	public void printTime( ) {  
        System.out.println("The current time is " + hour + ":" + minute + ":" + second);
    }
	public void tick( ) {
	  second++;
      if(second == 60){
          second = 00;
          minute++;
      }
      if(minute == 60){
          minute = 00;
          hour++;
      }
      if(hour == 24){
          hour = 00;
      }
	}
};