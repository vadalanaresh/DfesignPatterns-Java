package ProtoType.ConfigurationObject;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {
    private Map<ConfigurationType, Configuration> map = new HashMap<ConfigurationType, Configuration>();

    @Override
    public void addPrototype(Configuration user) {
        if(!map.containsKey(user.getType())) {
            map.put(user.getType(), user);
        }
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return map.getOrDefault(type, null);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return map.get(type).cloneObject();
    }
}
