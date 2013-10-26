package ToggleSpawn;

import com.gmail.mike546378.FTBHelper.FTBHelper;

public class SpawnListener implements Listener{
	public FTBHelper plugin;
	
	public SpawnListener(FTBHelper ftbhelper){
		plugin = ftbhelper;
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onMobSpawn(CreatureSpawnEvent ev){
		if(dissableSpawnCmd.dissableSpawn == true){
			ev.setCancelled(true);
		}
		
	}
}
