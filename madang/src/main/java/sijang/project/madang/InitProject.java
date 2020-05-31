package sijang.project.madang;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sijang.project.madang.domain.Users;
import sijang.project.madang.repository.user.UserRepository;

@Component
@RequiredArgsConstructor
public class InitProject implements ApplicationRunner {

    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
            userRepository.save(Users.builder()
                                    .username("123").
                                    password("1234")
                                    .build());
    }
}
