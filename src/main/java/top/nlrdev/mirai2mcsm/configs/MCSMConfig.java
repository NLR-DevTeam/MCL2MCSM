package top.nlrdev.mirai2mcsm.configs;

import net.mamoe.mirai.console.data.Value;
import net.mamoe.mirai.console.data.java.JavaAutoSavePluginConfig;

public class MCSMConfig extends JavaAutoSavePluginConfig {
    public final static MCSMConfig INSTANCE = new MCSMConfig();
    public Value<String> getApiKey = value("APIKey","此处填入APIKey");
    public Value<String> getApiUrl = value("APIUrl", "127.0.0.1:23333");

    private MCSMConfig() {
        super("Config");
    }
}