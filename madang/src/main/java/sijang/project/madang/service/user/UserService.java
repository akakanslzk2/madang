package sijang.project.madang.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sijang.project.madang.domain.user.UserResponseDto;
import sijang.project.madang.repository.user.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserResponseDto> getUsers() {
        return userRepository.findAll().
                    stream()
                    .map(UserResponseDto::new)
                    .collect(Collectors.toList());
    }
}
