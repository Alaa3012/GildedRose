public class Standard extends Item {
    public qualityUpdate(){
        if(this.quality>0) this.quality--; 
        this.sellInt-=1 ;
    }
}
