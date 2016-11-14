import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import missions.StoryMissions;
import arena.Timeline;

public class Main {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// make sure Andy emulator is at the smallest screen size 
		//Create new Screen Object 
		Screen screen = new Screen(); 
		
		//Create a StoryMissions Object 
		StoryMissions story = new StoryMissions(); 
		//Create Arena Object 
		Timeline timeline = new Timeline(); 
		
		//Define Patterns 
		Pattern mission = new Pattern("src/img/mission.png");
		Pattern forward_arrow = new Pattern("src/img/forward_arrow.png"); 
		
		//Define Stage Patterns 
		Pattern stage_1 = new Pattern("src/img/stage_1.png"); 
		Pattern stage_4 = new Pattern("src/img/stage_4.png"); 
		
		//Run Timeline script 
		//timeline.runTimeline();
		
		
		//Start Mission Routine 
		// On Mac make sure emulator is clicked to set to active window 
		Thread.sleep(3000);
		screen.click(mission); 
		
		for (int i = 0; i<2; i++){
			screen.click(forward_arrow);
			Thread.sleep(500);
		}
		
		//Choose stage 
		story.runStoryMission(screen, stage_4); 
	}
	
	
	
}
