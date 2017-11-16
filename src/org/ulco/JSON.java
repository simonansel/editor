package org.ulco;
import java.lang.reflect.Constructor;
public class JSON {
    static public GraphicsObject parse(String json) {
        GraphicsObject o = null;
        String str = json.replaceAll("\\s+", "");
        String type = str.substring(str.indexOf("type") + 5, str.indexOf(","));
        try {
            Class<?> classe = Class.forName("org.ulco."+type.substring(0,1).toUpperCase()+type.substring(1));
            Constructor<?> constructor = classe.getConstructor(String.class);
            o = (GraphicsObject)constructor.newInstance(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    static public Group parseGroup(String json) {
        return new Group(json);
    }

    static public Layer parseLayer(String json) {
        return new Layer(json);
    }

    static public Document parseDocument(String json) {
        return new Document(json);
    }
}
