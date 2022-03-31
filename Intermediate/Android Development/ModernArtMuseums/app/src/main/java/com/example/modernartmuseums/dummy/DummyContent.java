package com.example.modernartmuseums.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add some sample items.
        addItem(new DummyItem("1", "Barnes Museum", "https://barnesfoundation.org"));
        addItem(new DummyItem("2", "Tate Modern", "https://tate.org.uk"));
        addItem(new DummyItem("3", "Van Gogh Museum", "https://vangoghmuseum.nl/en"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String item_url;
        public final String item_name;

        public DummyItem(String id, String item_name, String item_url) {
            this.id = id;
            content = item_name;
            this.item_url = item_url;
            this.item_name = item_name;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}