package ItemLimiter;

import com.gmail.mike546378.FTBHelper.FTBHelper;

public class BlockPlaceListener implements Listener{
	
	public FTBHelper plugin;
	
	public BlockPlaceListener(FTBHelper ftbhelper){
		plugin = ftbhelper;
	}
	
@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlace(BlockPlaceEvent ev){
		int id = ev.getBlock().getTypeId();
		int data = ev.getBlock().getData();
		if(ev.getPlayer().hasPermission("FTBHelper.limit."+id+"."+data)){
			
		}
	}
}
