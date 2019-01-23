package cn.tamilin.patterns.creational.singleton.learn;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ContainerSingleton
 * @Desciption 看具体的业务场景  hashmap肯定是线程不安全的 在不考虑序列化 反射的化 还是又一定应用场景的
 * @Author summer
 * @Date 2019/1/23 20:01
 */
public class ContainerSingleton {

    private ContainerSingleton () {

    }

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if(StringUtils.isNotBlank(key) && instance != null) {
            if(!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
