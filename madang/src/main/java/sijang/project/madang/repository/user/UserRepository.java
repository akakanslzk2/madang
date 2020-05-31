package sijang.project.madang.repository.user;


import org.springframework.data.jpa.repository.JpaRepository;
import sijang.project.madang.domain.user.Users;

public interface UserRepository extends UserMapper, JpaRepository<Users,Long> {


}
