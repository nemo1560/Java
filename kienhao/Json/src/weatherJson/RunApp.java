package weatherJson;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new start().run();
	}
	
	public static class start implements Runnable {

		@Override
		public void run() {
			try {
				Controller control = new Controller();
				NumberFormat numFormat = new DecimalFormat("0.0");
				String doC = String.valueOf(numFormat.format((control.getcurrentTemp()-32)/1.8));
				
				System.out.println(doC);
				System.out.println(control.getCurrentWeather());
				System.out.println(control.getCurrentDate());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
