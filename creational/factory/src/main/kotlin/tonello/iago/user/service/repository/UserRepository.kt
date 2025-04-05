package tonello.iago.user.service.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tonello.iago.user.service.domain.User

@Repository
interface UserRepository : JpaRepository<User, Int> {

}
