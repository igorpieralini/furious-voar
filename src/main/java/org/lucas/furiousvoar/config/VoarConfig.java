package org.lucas.furiousvoar.config;

import org.lucas.furiousvoar.FuriousVoar;

import java.util.List;

public class VoarConfig extends Config{

    public VoarConfig(FuriousVoar plugin, String fileName) {
        super(plugin, fileName);
    }

    public List<String> getMundos(){
        return getCustomConfig().getStringList("mundos");
    }
}
