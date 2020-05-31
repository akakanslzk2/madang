package sijang.project.madang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "sijang.project.madang.repository")
public class MadangApplication {

	public static void main(String[] args) {
		SpringApplication.run(MadangApplication.class, args);
	}

}
