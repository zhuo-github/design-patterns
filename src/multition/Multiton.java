package multition;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private Multiton() { }
    private static Map<LanguageEnum, Multiton> map;
    synchronized public static Multiton newIntance(LanguageEnum language) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.containsKey(language)) {
            return map.get(language);
        }
        map.put(language, new Multiton());
        return map.get(language);
    }
}
enum LanguageEnum {
    CHINESE,
    ENGLISH,
    JAPANESE;
}
