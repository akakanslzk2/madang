package sijang.project.madang.repository.user.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sijang.project.madang.domain.Users;
import sijang.project.madang.repository.user.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserRepositoryImplTest {

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    public void initData(){
        userRepository.save(Users.builder()
                        .username("1234")
                        .password("1234")
                        .build());
    }

    @Test
    public void mybatis_link(){
        String username = userRepository.selectUsername();

        assertThat(username).isNotNull();
        assertThat(username).isEqualTo("1234");
    }
}