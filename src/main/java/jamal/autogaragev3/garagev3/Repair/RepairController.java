package jamal.autogaragev3.garagev3.Repair;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repair")

public class RepairController {

    private RepairRepository repairRepository;

    RepairController(RepairRepository repairRepository) {this.repairRepository = repairRepository;}

    @PostMapping("/newRepair")
    Repair newRepair(@RequestBody Repair newRepair) {return repairRepository.save(newRepair);}

    @GetMapping("/allRepairs")
    public @ResponseBody
    Iterable<Repair> getAllRepairs() {return repairRepository.findAll();}

    @GetMapping("/repair/{id}")
    Repair getOneRepair(@PathVariable Long id) {
        return repairRepository.findById(id)
                .orElseThrow(() ->new RepairNotFoundException(id));
    }

    @PutMapping("Repair/{id}")
    Repair replaceRepair(@RequestBody Repair newRepair, @PathVariable Long id) {
        return repairRepository.findById(id)
                .map(Repair -> {
                    Repair.setName(Repair.getName());
                    Repair.setDamage(Repair.getDamage());
                    Repair.setPrice(Repair.getPrice());
                    return repairRepository.save(Repair);
                })
                .orElseGet(() -> {
                    newRepair.setId(id);
                    return repairRepository.save(newRepair);
                });
    }

    @DeleteMapping("/Repair/{id}")
    void deleteRepair(@PathVariable Long id) { repairRepository.deleteById(id);}

}
