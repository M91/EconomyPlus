package menu;

import me.itswagpvp.economyplus.EconomyPlus;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Withdraw {

    private static EconomyPlus plugin = EconomyPlus.getInstance();

    public static void openMenu(Player p, int Size) {

        String title = plugin.getConfig().getString("Bank.GUI.Withdraw.Title")
                .replaceAll("&", "§");

        Inventory gui = Bukkit.getServer().createInventory(p, Size, title);
        gui.setItem(0, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(1, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(2, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(3, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(4, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(5, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(6, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(7, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(8, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(17, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(26, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(35, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(44, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(53, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(52, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(51, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(50, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(49, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(48, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(47, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(46, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(45, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(36, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(27, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(18, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        gui.setItem(9, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));

        ItemStack RemoveItem = new ItemStack(Material.RED_WOOL);
        ItemMeta RemoveItem_meta = RemoveItem.getItemMeta();
        ItemStack AddItem = new ItemStack(Material.GREEN_WOOL, 1);
        ItemMeta AddItem_meta = RemoveItem.getItemMeta();
        ItemStack AmountItem = new ItemStack(Material.PAPER, 1);
        ItemMeta AmountItem_meta = AmountItem.getItemMeta();
        ItemStack ConfirmItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE, 1);
        ItemMeta ConfirmItem_meta = ConfirmItem.getItemMeta();

        //-------

        RemoveItem_meta.setDisplayName("-1000");

        RemoveItem.setItemMeta(RemoveItem_meta);
        gui.setItem(10, RemoveItem);

        RemoveItem_meta.setDisplayName("-100");
        RemoveItem.setItemMeta(RemoveItem_meta);
        gui.setItem(19, RemoveItem);

        RemoveItem_meta.setDisplayName("-10");
        RemoveItem.setItemMeta(RemoveItem_meta);
        gui.setItem(28, RemoveItem);

        RemoveItem_meta.setDisplayName("-1");
        RemoveItem.setItemMeta(RemoveItem_meta);
        gui.setItem(37, RemoveItem);

        //-------

        AmountItem_meta.setDisplayName(String.valueOf(10));
        AmountItem.setItemMeta(AmountItem_meta);
        gui.setItem(22, AmountItem);

        //-------

        AddItem_meta.setDisplayName("+1");
        AddItem.setItemMeta(AddItem_meta);
        gui.setItem(16, AddItem);

        AddItem_meta.setDisplayName("+10");
        AddItem.setItemMeta(AddItem_meta);
        gui.setItem(25, AddItem);

        AddItem_meta.setDisplayName("+100");
        AddItem.setItemMeta(AddItem_meta);
        gui.setItem(34, AddItem);

        AddItem_meta.setDisplayName("+1000");
        AddItem.setItemMeta(AddItem_meta);
        gui.setItem(43, AddItem);

        //--------

        ConfirmItem_meta.setDisplayName("Conferma");
        ConfirmItem.setItemMeta(ConfirmItem_meta);
        gui.setItem(31, ConfirmItem);

        //--------
        p.openInventory(gui);
    }
}