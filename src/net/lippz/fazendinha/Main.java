package net.lippz.fazendinha;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.lippz.fazendinha.cmd.FazendinhaCrayCray;



public class Main extends JavaPlugin{
	
	public void onEnable() {
		plugin = this;
		instance = this;
		getCommand("fazendinha").setExecutor(new FazendinhaCrayCray());
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new FazendinhaCrayCray(), this);
		Bukkit.getConsoleSender().sendMessage("§c§lMrFazendinha §8- §7Ativado!");
	}
	
	  public static Main instance;	
	  public static Plugin plugin; 
	  
	  public static Plugin getPlugin()  {
		    return plugin;
		  }		
		  public static Main getInstace() {
				return instance;
		  }

}
