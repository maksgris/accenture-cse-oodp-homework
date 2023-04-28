package carservice.carupkeep;

public class CarMaintenanceProvider implements CarMaintenance {
    @Override
    public String availableServices() {
        return "List of currently available services:";
    }
}
