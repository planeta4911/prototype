package cars;

public class ICECar extends ConceptCar {

    public double fuelConsumption;

    public ICECar(){}

    public ICECar(int d, int ms, String n, double fc){
        this.doors=d;
        this.maxSpeed=ms;
        this.name=n;
        this.fuelConsumption=fc;
    }

    public ICECar(ICECar c){
        super(c);
        if(c!=null){
            this.fuelConsumption=c.fuelConsumption;
        }
    }

    @Override
    public ConceptCar clone(){
        return new ICECar(this);
    }
}
