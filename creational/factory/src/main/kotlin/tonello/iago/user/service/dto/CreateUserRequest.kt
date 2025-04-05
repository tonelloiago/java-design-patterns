package tonello.iago.user.service.dto

data class CreateUserRequest(
    val name: String,
    val document: String,
    val email: String,
    val password: String
)
