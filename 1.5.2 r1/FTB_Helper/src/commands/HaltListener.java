package commands;

import com.gmail.mike546378.FTBHelper.FTBHelper;

public class HaltListener implements Listener{

	public FTBHelper plugin;
	
	public HaltListener(FTBHelper ftbHelper){
		plugin = ftbHelper;
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	
//Halt System
		public void onPlayerMove(PlayerMoveEvent ev){
		for(int x = 0; x < Halt.halted.size();x++){
				if(Halt.halted.get(x).equalsIgnoreCase(ev.getPlayer().toString())){	
				ev.getPlayer().teleport(ev.getPlayer());
				}
			}
		}
}