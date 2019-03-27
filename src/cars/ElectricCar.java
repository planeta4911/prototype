package cars;

public class ElectricCar extends ConceptCar {

    public double range;

    public ElectricCar(){}

    public ElectricCar(int d, int ms, String n, double r){
        this.doors=d;
        this.maxSpeed=ms;
        this.name=n;
        this.range=r;
    }

    public ElectricCar(ElectricCar c){
        super(c);
        if(c!=null){
            this.range=c.range;
        }
    }

    @Override
    public ConceptCar clone(){
        return new ElectricCar(this);
    }
}
