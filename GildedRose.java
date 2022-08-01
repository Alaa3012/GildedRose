class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                Backstage b = new Backstage(items[i].name, items[i].sellIn, items[i].quality);
                b.qualityUpdate();
                items[i].quality = b.quality;
            } else if (items[i].name.equals("Aged Brie")) {
                Brie b = new Brie(items[i].name, items[i].sellIn, items[i].quality);
                b.qualityUpdate();
                items[i].quality = b.quality;
            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            } else {
                Standard b = new Standard(items[i].name, items[i].sellIn, items[i].quality);
                b.qualityUpdate();
                items[i].quality = b.quality;
            }
        }   
    }
}