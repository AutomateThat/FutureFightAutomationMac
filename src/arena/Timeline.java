package arena;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Timeline {

	public void runTimeline() throws FindFailed, InterruptedException{
		//From main menu 
		Screen screen = new Screen();  
		
		Pattern arena = new Pattern("src/img/arena.png"); 
		Pattern timeline_battle = new Pattern("src/img/timeline_battle.png"); 
		Pattern get_ready = new Pattern("src/img/get_ready.png"); 
		Pattern find_opponent = new Pattern("src/img/find_opponent.png"); 
		Pattern fight = new Pattern("src/img/fight.png"); 
		Pattern timeline_finish_bar = new Pattern("src/img/timeline_finish_bar.png"); 
		
		Thread.sleep(3000);
		screen.click(arena); 
		Thread.sleep(1000);
		screen.click(timeline_battle);
		Thread.sleep(1000);
		screen.click(get_ready); 
		Thread.sleep(1000);
		screen.click(find_opponent);
		Thread.sleep(1000);
		screen.click(fight); 
		System.out.println("The timeline fight has started.");
		while (find(screen, timeline_finish_bar) == false) { 
			System.out.println("Still playing the mission...");
			
			if (screen.exists(timeline_finish_bar) != null){
				System.out.println("The mission has finished.");
				break; 
			}
			
		}
		
		
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
