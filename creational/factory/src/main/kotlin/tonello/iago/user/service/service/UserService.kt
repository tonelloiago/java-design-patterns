package tonello.iago.user.service.service

import org.mindrot.jbcrypt.BCrypt
import org.springframework.stereotype.Service
import tonello.iago.user.service.domain.User
import tonello.iago.user.service.dto.CreateUserRequest
import tonello.iago.user.service.dto.CreateUserResponse
import tonello.iago.user.service.exception.ExceptionFactory
import tonello.iago.user.service.repository.UserRepository
import java.sql.Timestamp
import java.time.Instant

@Service
class UserService(private val userRepository: UserRepository) {
    fun findById(id: Long): User? {
        TODO("Not yet implemented")
    }

    private fun getPasswordHash(password: String): String {

        var salt = BCrypt.gensalt(12)
        return BCrypt.hashpw(password, salt)
    }

    fun create(createUserRequest: CreateUserRequest): CreateUserResponse {

        try {
            val userCandidate = User(name = createUserRequest.name,
                document = createUserRequest.document,
                email = createUserRequest.email,
                username = createUserRequest.email,
                passwordHash = getPasswordHash(createUserRequest.password),
                createdAt = Timestamp.from(Instant.now())
            )

            val user = userRepository.save(userCandidate)
            return CreateUserResponse(id = user.id)

        }catch (e: Exception) {
            throw ExceptionFactory.errorOnCreateUser()
        }
    }

}
