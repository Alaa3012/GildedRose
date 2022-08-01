public class Backstage extends Item {
    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void qualityUpdate() {
        if ( this.sellIn < 0 ) this.quality = 0 ;
        else if ( this.sellIn < 6 ) if(this.quality<50) this.quality++;
        else if ( this.sellIn < 11) if(this.quality<50) this.quality++;   
    }
}