package codebat.maps.One;

import java.util.Map;


public class MapBully {
    /*
// Make a new empty map
Map<String, String> map = new HashMap<String, String>();
map.get(key) -- retrieves the stored value for a key, or null if that key is not present in the map.
map.put(key, value) -- stores a new key/value pair in the map. Overwrites any existing value for that key.
map.containsKey(key) -- returns true if the key is in the map, false otherwise.
map.remove(key) -- removes the key/value pair for this key if present. Does nothing if the key is not present.
 */

    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        else if (!(map.containsKey("a") && map.containsKey("b"))){
            return map;
        }
        return map;
    }
}
/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */

/*
Model answer:
public Map<String, String> mapBully(Map<String, String> map) {
  if (map.containsKey("a")) {
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}
 */


