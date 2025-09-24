import java.util.HashMap;
import java.util.Map;

class AppConfig {
    public static void main(String[] args) {
        Map<String,String> mainConfig= new HashMap<>();
        mainConfig.put("Gateway","192.168.1.1");
        mainConfig.put("DNS","8.8.8.8");
        mainConfig.put("Proxy","proxy.local");

        Map<String,String> updatedConfig= new HashMap<>();
        updatedConfig.put("Gateway","10.0.0.1");
        updatedConfig.put("DNS","8.8.8.8");

        System.out.println(mergeConfigurations(mainConfig,updatedConfig));

    }

    public static Map<String, String> mergeConfigurations(Map<String, String> mainConfig, Map<String, String> updatedConfig) {
        mainConfig.putAll(updatedConfig);
        return mainConfig;
        }
    }
