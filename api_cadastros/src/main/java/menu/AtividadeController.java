package menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @PostMapping
    public Atividade create(@RequestBody Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    @GetMapping
    public List<Atividade> readAll() {
        return atividadeRepository.findAll();
    }

    @PutMapping("/{id}")
    public Atividade update(@PathVariable String id, @RequestBody Atividade atividade) {
        atividade.setId(id);
        return atividadeRepository.save(atividade);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        atividadeRepository.deleteById(id);
    }
}