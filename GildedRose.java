class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                Backstage b = items[i];
                b.qualityUpdate();
            } else if (this.items[i].name.equals("Aged Brie")) {
                Brie b = items[i];
                b.qualityUpdate();
            } else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            } else {
                Standard b = items[i];
                b.qualityUpdate();
            }
        }
    }
}