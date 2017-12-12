import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by gerli on 12/12/2017.
 */
@Controller
public class Start {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
