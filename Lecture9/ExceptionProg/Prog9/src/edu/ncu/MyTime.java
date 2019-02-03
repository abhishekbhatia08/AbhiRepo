import java.lang.*;

class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public MyTime(int hour, int minute, int second)
	{ 
		if ( (hour <=23 &&  hour>=0) &&( minute<59 && minute>=0) && (second<=59 && second>=0)){
			setTime(hour,minute,second);
		}
		else {
			
				throw new IllegalArgumentException("Invalid Hour, Minute or Seconds");
		}
	}

	public void setTime(int hour, int minute, int second) {
		
			
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		
		
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}



	public void setHour(int hour) {

		
			if (hour>23)
				{
					this.hour=0;
				}
				if (hour="0")
		{
this.hour=23;
		}
				else {
					this.hour = hour;
		      }
		}
	
	

	public void setMinute(int minute) {
		if(minute>59)
		{
			this.minute=0;
		}
		if (minute="0")
		{
this.minute=59;
		}
		else {
			this.minute=minute;
		}
		
	}

	public void setSecond(int second) {
		if(second>59)
		{
			this.second=0;
		}
		if (second<0)
		{
this.second=59;
		}
		else {
			this.second=second;
		}

		
	}

	public String toString() {
		String time = String.format("%02d:%02d:%02d",hour,minute,second);
		return time;
	}

	public MyTime nextSecond() {
		MyTime m = new MyTime();
		if(getSecond()==59&&getMinute()==59)
		{m.setHour(this.getHour()+1);
		m.setMinute(this.getMinute()+1);
		m.setSecond(this.getSecond()+1);

		}
		else if(getSecond()==59)
		{
			m.setHour(this.getHour());
		m.setMinute(this.getMinute()+1);
		m.setSecond(this.getSecond()+1);
		}
		else{
			m.setHour(this.getHour());
		m.setMinute(this.getMinute());
		m.setSecond(this.getSecond()+1);
		}
		return m;
	}

	public MyTime nextMinute() {
		MyTime m = new MyTime();
		if(getMinute()==59)
		{m.setHour(this.getHour()+1);
		m.setMinute(this.getMinute()+1);
		m.setSecond(this.getSecond());

		}
		else{
			m.setHour(this.getHour());
		m.setMinute(this.getMinute()+1);
		m.setSecond(this.getSecond());
		}
		return m;
	}

	public MyTime nextHour() {
		MyTime m = new MyTime();
		m.setHour(this.getHour()+1);
		m.setMinute(this.getMinute());
		m.setSecond(this.getSecond());
		return m;
	}

	public MyTime previousSecond() {
		MyTime m = new MyTime();
		if(getSecond()==0&&getMinute()==0)
		{m.setHour(this.getHour()-1);
		m.setMinute(this.getMinute()-1);
		m.setSecond(this.getSecond()-1);

		}
		else if(getSecond()==0)
		{
			m.setHour(this.getHour());
		m.setMinute(this.getMinute()-1);
		m.setSecond(this.getSecond()-1);
		}
		else{
			m.setHour(this.getHour());
		m.setMinute(this.getMinute());
		m.setSecond(this.getSecond()-1);
		}
		return m;
	}

	public MyTime previousMinute() {
		MyTime m = new MyTime();
		if(getMinute()==0)
		{m.setHour(this.getHour()-1);
		m.setMinute(this.getMinute()-1);
		m.setSecond(this.getSecond());

		}
		else{
			m.setHour(this.getHour());
		m.setMinute(this.getMinute()-1);
		m.setSecond(this.getSecond());
		}
		return m;
	}

	public MyTime previousHour() 
	{
		MyTime m = new MyTime();
		m.setHour(this.getHour()-1);
		m.setMinute(this.getMinute());
		m.setSecond(this.getSecond());
		return m;
	}


	

}