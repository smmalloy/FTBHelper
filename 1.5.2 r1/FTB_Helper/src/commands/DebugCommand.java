package commands;

import com.gmail.mike546378.FTBHelper.FTBHelper;

public class DebugCommand implements CommandExecutor{
	@SuppressWarnings({ "unused" })
	private FTBHelper plugin;
	public DebugCommand(FTBHelper plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		System.out.println("Command Executed");
	if(cmd.getName().equalsIgnoreCase("Debug")){
		Player player = (Player)sender;
		String ChunkInfo;
		Chunk Chunks = player.getWorld().getChunkAt(player.getLocation());
		ChunkInfo = "X:"+Chunks.getX() * 16+", Z:"+Chunks.getZ() * 16+" Entities:"+Chunks.getEntities().length;
		sender.sendMessage(ChunkInfo);
		return true;
	}
	return true;}
}