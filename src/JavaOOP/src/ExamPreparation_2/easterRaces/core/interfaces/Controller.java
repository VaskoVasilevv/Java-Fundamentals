package ExamPreparation_2.easterRaces.core.interfaces;
//created by J.M.

public interface Controller {

    String createDriver(String driver);

    String createCar(String type, String model, int horsePower);

    String addCarToDriver(String driverName, String carModel);

    String addDriverToRace(String raceName, String driverName);

    String startRace(String raceName);

    String createRace(String name, int laps);
}
