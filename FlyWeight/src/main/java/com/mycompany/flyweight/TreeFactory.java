package com.mycompany.flyweight;
import java.util.HashMap;
class TreeFactory {
    private static final HashMap<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String image) {
        TreeType treeType = treeTypes.get(name);

        if (treeType == null) {
            treeType = new TreeType(name, image);
            treeTypes.put(name, treeType);
        }

        return treeType;
}
    }
