package readYml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot2 !!!";
    }


    @Autowired
    private Person person;
    @ResponseBody
    @RequestMapping("/person")
    public Person person(){
        return person;
    }


}
