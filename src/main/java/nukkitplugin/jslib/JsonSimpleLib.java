package nukkitplugin.jslib;

import cn.nukkit.plugin.PluginBase;
import static cn.nukkit.utils.TextFormat.YELLOW;

public class JsonSimpleLib extends PluginBase {
    @Override
    public void onEnable() {
	this.getLogger().notice(YELLOW + "JsonSimple was enabled");
    }
}
