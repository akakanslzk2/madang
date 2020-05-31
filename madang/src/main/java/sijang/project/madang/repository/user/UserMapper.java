package sijang.project.madang.repository.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    String selectUsername();

}
