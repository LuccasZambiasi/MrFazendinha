package net.lippz.fazendinha.cmd;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.lippz.fazendinha.Main;



public class FazendinhaCrayCray implements CommandExecutor, Listener{

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		Player p = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("fazendinha")) {
			if (!p.hasPermission("mr.fazendinha")) {
				p.sendMessage("§cOpss. Você não tem permissão.");
				return true;
			}
			if (args.length == 0) {
			p.sendMessage("");
			p.sendMessage("§c§lFAZENDINHA - AJUDA");
			p.sendMessage("");
			p.sendMessage("§c* §7Use /fazendinha goiaba - para pegar uma goiaba.");
			p.sendMessage("§c* §7Use /fazendinha uva - para pegar uma uva.");
			p.sendMessage("§c* §7Use /fazendinha pessego - para pegar uma maça.");
			p.sendMessage("§c* §7Use /fazendinha laranja - para pegar uma laranja.");
			p.sendMessage("");

			return true;
			}
			
			if (args[0].equalsIgnoreCase("goiaba")) {
					p.sendMessage(Main.getPlugin().getConfig().getString("Gerais.Prefix").replace("&", "§") + "§7Você pegou uma goiaba, yeeey!");					
			        ItemStack goiaba = new ItemStack(Material.APPLE, 1);
			        ItemMeta goiabameta = goiaba.getItemMeta();
			        goiabameta.setDisplayName("§2§lGOI§c§lABA");
			        String[] lore2 = new String[1];
			        lore2[0] = "§c§lGOIA§2§lBINHA! YEEEY!";
			        goiabameta.setLore(Arrays.asList(lore2));
			        goiaba.setItemMeta(goiabameta);
			        p.getInventory().addItem(goiaba);
			        }
			
			if (args[0].equalsIgnoreCase("uva")) {
				p.sendMessage(Main.getPlugin().getConfig().getString("Gerais.Prefix").replace("&", "§") + "§7Você pegou uma uva, yeeey!");					
		        ItemStack uva = new ItemStack(Material.APPLE, 1);
		        ItemMeta uvameta = uva.getItemMeta();
		        uvameta.setDisplayName("§5§lUVA");
		        String[] lore2 = new String[1];
		        lore2[0] = "§5§lUVINHA! YEEEY!";
		        uvameta.setLore(Arrays.asList(lore2));
		        uva.setItemMeta(uvameta);
		        p.getInventory().addItem(uva);
		        }
			
			if (args[0].equalsIgnoreCase("pessego")) {
				p.sendMessage(Main.getPlugin().getConfig().getString("Gerais.Prefix").replace("&", "§") + "§7Você pegou um pêssego, yeeey!");					
		        ItemStack pessego = new ItemStack(Material.GOLDEN_APPLE, 1);
		        ItemMeta pessegometa = pessego.getItemMeta();
		        pessegometa.setDisplayName("§6§lPÊSSEGO");
		        String[] lore3 = new String[1];
		        lore3[0] = "§6§lPÊSSEGO! YEEEY!";
		        pessegometa.setLore(Arrays.asList(lore3));
		        pessego.setItemMeta(pessegometa);
		        p.getInventory().addItem(pessego);
		    
		        }
			if (args[0].equalsIgnoreCase("laranja")) {
				p.sendMessage(Main.getPlugin().getConfig().getString("Gerais.Prefix").replace("&", "§") + "§7Você pegou uma laranjinha, yeeey!");					
		        ItemStack laranja = new ItemStack(Material.GOLDEN_APPLE, 1);
		        ItemMeta laranjameta = laranja.getItemMeta();
		        laranjameta.setDisplayName("§e§lLARANS§6§lJINHA");
		        String[] lore4 = new String[1];
		        lore4[0] = "§e§lLARANS§6§lJINHA! YEEEY!";
		        laranjameta.setLore(Arrays.asList(lore4));
		        laranja.setItemMeta(laranjameta);
		        p.getInventory().addItem(laranja);
		    
		        }
			}
		
		return false;
	}
	
	@EventHandler
	public void onConsume(PlayerItemConsumeEvent event) {
	        Player player = event.getPlayer();
	        ItemStack item = event.getItem();
	        
	        if (item.getType() == Material.APPLE && 
	   item.getItemMeta().getDisplayName().equalsIgnoreCase("§2§lGOI§c§lABA")){
	           player.sendMessage("§7Você comeu uma §2goia§cbinha§7! yeey.");
	        }
	        
	        if (item.getType() == Material.APPLE && 
	   item.getItemMeta().getDisplayName().equalsIgnoreCase("§5§lUVA")){
	           player.sendMessage("§7Você comeu uma §5uvinha§7! yeey.");
	        }
	        
	        if (item.getType() == Material.APPLE && 
	        		   item.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lLARANS§6§lJINHA")){
	      player.sendMessage("§7Você comeu uma §e§o§llaranS§6§l§ojinha§7! yeey.");
	  }
	        
	        if (item.getType() == Material.APPLE && 
	   item.getItemMeta().getDisplayName().equalsIgnoreCase("§6§lPÊSSEGO")){
	           player.sendMessage("§7Você comeu uma §56pessego§7! yeey.");
	        }
	}
	
	

}
