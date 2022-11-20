package jamal.autogaragev3.garagev3.Car;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Cars")
public class CarController {

    private CarRepository carRepository;

    CarController(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @PostMapping("/newCar")
    Car newCar(@RequestBody Car newCar) {
        return carRepository.save(newCar);
    }

    @GetMapping(path="/allCars")
    public @ResponseBody Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("/Car/{id}")
    Car one(@PathVariable Long id) {

        return carRepository.findById(id)
                .orElseThrow(() ->new CarNotFoundException(id));
    }

    @PutMapping("/Car/{id}")
    Car ReplaceCar(@RequestBody Car newCar, @PathVariable Long id) {

        return carRepository.findById(id)
                .map(Car -> {
                    Car.setLicensePlate((Car.getLicensePlate()));
                    Car.setBrand(Car.getBrand());
                    Car.setModel(Car.getModel());
                    Car.setVersionYear(Car.getVersionYear());
                    return carRepository.save(Car);
                })
                .orElseGet(() -> {
                    newCar.setId(id);
                    return carRepository.save(newCar);
                });
    }

    @DeleteMapping("/Auto/{id}")
    void deleteCar(@PathVariable Long id) {

        carRepository.deleteById(id);
    }

}
