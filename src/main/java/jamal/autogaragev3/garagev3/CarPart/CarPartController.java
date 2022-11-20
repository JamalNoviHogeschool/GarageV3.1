package jamal.autogaragev3.garagev3.CarPart;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CarParts")
public class CarPartController {

    private CarPartRepository carPartRepository;

    CarPartController(CarPartRepository carPartRepository) {
        this.carPartRepository = carPartRepository;
    }

    @PostMapping("/newCarPart")
    CarPart newCarPart(@RequestBody CarPart newCarPart) {
        return carPartRepository.save(newCarPart);
    }

    @GetMapping("/AllCarParts")
    private @ResponseBody
    Iterable<CarPart> getAllCarPart() {
        return carPartRepository.findAll();
    }
    @GetMapping("/CarParts/{id}")
    CarPart getOnePart(@PathVariable Long id) {
        return carPartRepository.findById(id)
                .orElseThrow(() -> new CarPartNotFoundException(id));
    }

    @PutMapping("/CarParts/{id}")
    CarPart replacePart(@RequestBody CarPart newCarPart, @PathVariable Long id) {
        return carPartRepository.findById(id)
                .map(part -> {
                    part.setName(part.getName());
                    part.setModel(part.getModel());
                    part.setVersionYear(part.getVersionYear());
                    part.setBrand(part.getBrand());
                    part.setPrice(part.getPrice());
                    part.setStock(part.getStock());
                    return carPartRepository.save(part);
                })
                .orElseGet(() -> {
                    newCarPart.setId(id);
                    return carPartRepository.save(newCarPart);
                });
    }

    @DeleteMapping("/CarParts/{id}")
    void deletePart(@PathVariable Long id) {carPartRepository.deleteById(id);
    }

}
