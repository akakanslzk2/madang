package sijang.project.madang.repository.user;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@RequiredArgsConstructor
@Repository
public class UserMapperImpl implements UserMapper {

    private final SqlSession sqlSession;


    @Override
    public String selectUsername() {
        return sqlSession.selectOne("sijang.project.madang.repository.user.UserMapper.selectUsername");
    }
}
