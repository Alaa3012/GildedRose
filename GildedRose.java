class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                items[i] = new Backstage(items[i].name, items[i].sellIn, items[i].price);
                b.qualityUpdate();
            } else if (this.items[i].name.equals("Aged Brie")) {
                items[i] = new Brie(items[i].name, items[i].sellIn, items[i].price);
                b.qualityUpdate();
            } else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            } else {
                items[i] = new Standard(items[i].name, items[i].sellIn, items[i].price);
                b.qualityUpdate();
        }
    }
}