package towdium.je_characters;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

import java.util.Collections;

/**
 * Author: Towdium
 * Date:   2016/9/4.
 */
public class ModContainer extends DummyModContainer {
    public ModContainer() {
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = "je_characters";
        meta.name = "Just Enough Characters";
        meta.version = "0.1.0";
        meta.authorList = Collections.singletonList("Towdium");
        meta.description = "Help JEI read Pinyin";
        //meta.url = "http://www.hahathisisareallycooldomainnamebuthowitberemembered.com/";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }
}
