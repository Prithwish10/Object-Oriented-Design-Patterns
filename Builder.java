class VehicleF{
    //Required paramenters
    private String engine;
    private int wheel;
    //Optional parameter
    private int airbags;

    public String getEngine(){
        return this.engine;
    }
    public int getWheel(){
        return this.wheel;
    }
    public int getAirbags(){
        return this.airbags;
    }
    private VehicleF(VehicleBuilder builder){
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    public static class VehicleBuilder{

        //Required parameters
        private String engine;
        private int wheel;
        //Optional parameter
        private int airbags;

        public VehicleBuilder(String engine, int wheel){
            this.engine = engine;
            this.wheel = wheel;
        }
        public VehicleBuilder setAirbags(int airbags){
            this.airbags = airbags;
            return this;
        }
        public VehicleF build(){
            return new VehicleF(this);
        }
    }
}
public class Builder {
    public static void main(String args[]){
        
        VehicleF car = new VehicleF.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        System.out.println("Car ...");
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());

        System.out.println("Bike ...");
        VehicleF bike = new VehicleF.VehicleBuilder("1200cc", 2).build();
        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
}
