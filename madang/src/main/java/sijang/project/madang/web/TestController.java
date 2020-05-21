package sijang.project.madang.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public TestDto main(){
        return new TestDto("value");
    }

    @AllArgsConstructor
    @Setter @Getter
    private class TestDto {
        private String key;
    }
}
