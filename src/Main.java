import FuelStation.*;

import java.time.Instant;
import java.util.Random;

public class Main {
    //static int vehicleSpawnChance = 30;
    static int vehicleSpawnChance = 15; // adjusted to compensate for lack of multithreading

    public static void main(String[] args) {
        FuelStation fuelStation = new FuelStation();
        Random r = new Random();

        Instant timeInstant = Instant.now();
        while(true){
            if (Instant.now().isAfter(timeInstant)){
                //add new vehicles
                timeInstant = Instant.now().plusMillis(1000+r.nextInt(2000));
                if(r.nextInt(100)<vehicleSpawnChance){ //chance to spawn new vehicles
                    addVehicles(fuelStation, r.nextInt(3)+1); //1-3 new Vehicles
                }
               fuelStation.processWaitingVehicle();
                System.out.println(fuelStation.getWaitingArea().getTotalVehicles() + " vehicles waiting");
                System.out.println();
            }
        }
    }

    private static void addVehicles(FuelStation fuelStation, int amount) {
        int numberNewVehicles = amount;
        System.out.print("+added : ");
        for (; numberNewVehicles>0; numberNewVehicles--) {
            IVehicle v = Vehicle.getRandomVehicle();
            fuelStation.addVehicle(v);
            System.out.print(v.getVehicleType()+" ");
        }
        System.out.println();
    }

}
