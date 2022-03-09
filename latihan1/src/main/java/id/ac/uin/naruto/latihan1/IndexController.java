package id.ac.uin.naruto.latihan1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping ("api")
public class IndexController {
    @GetMapping("hello")
    public String hello(@RequestParam String name){
        return"Selamat Belajar Spring Boot!"+ name +" " + LocalDateTime.now();
    }
}
