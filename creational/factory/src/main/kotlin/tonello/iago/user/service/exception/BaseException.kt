package tonello.iago.user.service.exception

import org.springframework.http.HttpStatus

class BaseException(val httpStatus: HttpStatus, val errorResponse: ErrorResponse) : RuntimeException() {
        constructor(httpStatus: HttpStatus, error: Errors): this(
            httpStatus = httpStatus,
            errorResponse = ErrorResponse(error)
        )
    }