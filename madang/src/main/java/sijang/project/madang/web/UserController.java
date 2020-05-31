package sijang.project.madang.web;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sijang.project.madang.domain.user.UserResponseDto;
import sijang.project.madang.service.user.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public UserData users(){
        return new UserData(userService.getUsers());
    }

    @Getter @Setter
    @AllArgsConstructor
    private class UserData {
        private List<UserResponseDto> data;
    }
}
