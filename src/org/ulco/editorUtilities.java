package org.ulco;

import java.util.Vector;

public class editorUtilities {
    public static GraphicsObjects select(Point pt, double distance, Layer layer){
        GraphicsObjects list = new GraphicsObjects();
        for (GraphicsObject object : layer.getM_list()) {
            if (object.isClosed(pt, distance)) {
                list.add(object);
            }
        }
        return list;
    }

    public static GraphicsObjects select(Point pt, double distance, Document document){
        GraphicsObjects list = new GraphicsObjects();

        for (Layer layer : document.getM_layers()) {
            list.addAll(select(pt, distance, layer));
        }
        return list;
    }

}
