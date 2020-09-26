package background;

import java.util.HashMap;
import java.util.Map;

public class PrivateEscape {
    private Map<String, String> states;
    public PrivateEscape() {
        states = new HashMap<>();
        states.put("1", "1");
    }
    public Map<String, String > getStates() {
        return states;
    }

    public Map<String, String > getStatesImproved() {
        return new HashMap<>(states);
    }

    public static void main(String[] args) {
        PrivateEscape privateEscape = new PrivateEscape();
        Map<String, String> states = privateEscape.getStates();
        System.out.println(states.get("1"));
        states.remove("1");
        System.out.println(states.get("1"));
    }
}
