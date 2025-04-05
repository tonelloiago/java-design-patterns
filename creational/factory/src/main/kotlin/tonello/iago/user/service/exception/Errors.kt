package tonello.iago.user.service.exception

enum class Errors(val code: String, val message: String) {
    ERROR_ON_CREATE_USER("USR-0001", "Failed to create user")
}