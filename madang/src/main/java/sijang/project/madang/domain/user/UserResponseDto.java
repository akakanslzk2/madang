package sijang.project.madang.domain.user;

import lombok.Data;

@Data
public class UserResponseDto {

    private String uesrname;


    public UserResponseDto(Users users){
        this.uesrname = users.getUsername();
    }
}
