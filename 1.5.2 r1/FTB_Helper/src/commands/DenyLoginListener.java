package commands;

import com.gmail.mike546378.FTBHelper.FTBHelper;


public class DenyLoginListener implements Listener{

	public FTBHelper plugin;
	
	public DenyLoginListener(FTBHelper ftbHelper){
		plugin = ftbHelper;
	}
	
//Login Denier
	@EventHandler(priority = EventPriority.HIGHEST)
		public void onPlayerLogin(PlayerLoginEvent ev){
		for(int x = 0; x < DenyLogin.denylogin.size();x++){
				if(DenyLogin.denylogin.get(x).equalsIgnoreCase(ev.getPlayer().toString())){	
					ev.disallow(null, plugin.getConfig().getString("DenyLoginMessage"));
				}
			}
		}
}