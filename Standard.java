public class Standard extends Item {
    public Standard(String name, int sellIn, int quality) {
        super(name, sellIn, quality); 
    }
    public void qualityUpdate(){
        if(this.quality>0) this.quality--; 
        this.sellIn-=1 ;
    }
}
