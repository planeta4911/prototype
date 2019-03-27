package cars;

public abstract class ConceptCar {

    public int doors;
    public int maxSpeed;
    public String name;

    public ConceptCar(){}

    public ConceptCar(ConceptCar c){
        if(c!=null){
            this.doors=c.doors;
            this.maxSpeed=c.maxSpeed;
            this.name=c.name;
        }
    }

    public abstract ConceptCar clone();


}
