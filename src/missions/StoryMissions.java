package missions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class StoryMissions {
	public void runStoryMission(Screen screenObject,Pattern whichStage) throws FindFailed, InterruptedException{
		Pattern daily_biometrics_0 = new Pattern("src/img/daily_biometrics_0.png");
		Pattern daily_biometrics_5 = new Pattern("src/img/daily_biometrics_5.png");
		Pattern daily_biometrics_1 = new Pattern("src/img/daily_biometrics_1.png");
		Pattern daily_biometrics_2 = new Pattern("src/img/daily_biometrics_2.png");
		Pattern daily_biometrics_3 = new Pattern("src/img/daily_biometrics_3.png");
		Pattern daily_biometrics_4 = new Pattern("src/img/daily_biometrics_4.png");
		Pattern start_button = new Pattern("src/img/start_button.png");
		Pattern repeat_mission_button = new Pattern("src/img/repeat_mission_button.png");
		//Pattern in_mission_setting_button = new Pattern("src/Images/in_mission_setting_button.png");
		Pattern mission_finish_bar = new Pattern("src/img/mission_finish_bar.png");
		Pattern test = new Pattern("src/img/test.png");
		Boolean isPlaying = false; 
		
		
		screenObject.click(whichStage);
		screenObject.wait(daily_biometrics_5); 
				
		screenObject.click(start_button); 
		System.out.println("The mission has started.");
		isPlaying = true; 
		
		Thread.sleep(2000);
			while (find(screenObject, mission_finish_bar) == false) {
				isPlaying = true; 
				System.out.println("Still playing the mission...");
				
				if (screenObject.exists(mission_finish_bar) != null){
					System.out.println("The mission has finished.");
					break; 
				}
				
			}
		System.out.println("Wait for 5 Seconds");
		Thread.sleep(5000);
		System.out.println("Click repeat button");
		screenObject.doubleClick(repeat_mission_button); 
		
	}
	
	public static boolean find(Screen screen, Pattern pattern)
	{
		if (screen.exists(pattern) != null) {
			return true;
		} 
		else {
			return false;
		}
	}

}
