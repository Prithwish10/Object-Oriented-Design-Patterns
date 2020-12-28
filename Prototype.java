import java.util.List;
import java.util.ArrayList;

class VehicleP implements Cloneable {
    private List<String> vehicleList;

    public VehicleP() {
        this.vehicleList = new ArrayList<>();
    }

    public VehicleP(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void insertData() {
        this.vehicleList.add("Audi A6");
        this.vehicleList.add("Lamborghini");
        this.vehicleList.add("ford mustang");
        this.vehicleList.add("jaguar XF");
    }

    public List<String> getVehiclelist() {
        return this.vehicleList;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();
        for (String car : this.getVehiclelist())
            tempList.add(car);
        return new VehicleP(tempList);
    }
}

public class Prototype {
    public static void main(String args[]) {
        VehicleP car = new VehicleP();
        car.insertData();

        VehicleP v = null;
        try {
            v = (VehicleP) car.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        List<String> carList = v.getVehiclelist();
        carList.add("Maruti Suzuki");

        System.out.println(car.getVehiclelist());
        System.out.println(carList);
    }
}
