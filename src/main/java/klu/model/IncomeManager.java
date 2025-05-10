package klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import klu.repository.IncomeSourceRepository;
import java.util.List;

@Service
public class IncomeManager {

    @Autowired
    private IncomeSourceRepository incomeSourceRepository;

    public String addIncomeSources(List<IncomeSource> sources) {
        incomeSourceRepository.saveAll(sources);
        return "200::Income sources saved successfully";
    }

    public List<IncomeSource> getAllIncomeSources() {
        return incomeSourceRepository.findAll();
    }

    public String deleteIncomeSource(Long id) {
        if (incomeSourceRepository.existsById(id)) {
            incomeSourceRepository.deleteById(id);
            return "200::Income source deleted successfully";
        } else {
            return "404::Income source not found";
        }
    }

    // Additional methods can be added as needed
}
