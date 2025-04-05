package tonello.iago.user.service.exception

data class ErrorResponse(
    val code: String,
    val message: String
) {
    constructor(errors: Errors): this(
        code = errors.code,
        message = errors.message
    )
}
