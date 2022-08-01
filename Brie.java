public class Brie extends Item {
    public Brie(String name, int sellInm, int quality){
        super(name, sellInm, quality);
    }
    public void qualityUpdate(){
        if(this.quality<50) this.quality++; 
        this.sellIn -= 1;
    }
}