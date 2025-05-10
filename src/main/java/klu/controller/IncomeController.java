package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import klu.model.IncomeSource;
import klu.model.IncomeManager;
import java.util.List;

@RestController
@RequestMapping("/api/income")
@CrossOrigin(origins = "http://localhost:5173/")
public class IncomeController {

    @Autowired
    private IncomeManager incomeManager;

    @PostMapping("/add")
    public String addIncomeSources(@RequestBody List<IncomeSource> sources) {
        return incomeManager.addIncomeSources(sources);
    }

    @GetMapping("/all")
    public List<IncomeSource> getAllIncomeSources() {
        return incomeManager.getAllIncomeSources();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteIncomeSource(@PathVariable Long id) {
        return incomeManager.deleteIncomeSource(id);
    }

    // Additional endpoints can be added as needed
}
