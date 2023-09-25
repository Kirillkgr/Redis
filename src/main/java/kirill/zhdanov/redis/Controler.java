package kirill.zhdanov.redis;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Controler {
    @Autowired
    ModelRepository modelRepository;

    @GetMapping("/wrte")
    public List<Model> write(@RequestParam("str") String str) {
        Model model = new Model();
        modelRepository.save(new Model(1, "Nele", 10, "f"));
        return modelRepository.findAll();
    }

    @PostConstruct
    void writeToRedis() {
        try {
            for (int i = 0; i < 100_000_000_0; i++) {
                modelRepository.save(new Model(i, "Nele", 10, "f"));
                System.out.println(modelRepository.findById(i-1));
            }
            System.out.println(modelRepository.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
