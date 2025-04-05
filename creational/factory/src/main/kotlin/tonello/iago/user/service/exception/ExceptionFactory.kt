package tonello.iago.user.service.exception

import org.springframework.http.HttpStatus

object ExceptionFactory {

    fun errorOnCreateUser(): BaseException {
        return BaseException(HttpStatus.UNPROCESSABLE_ENTITY, Errors.ERROR_ON_CREATE_USER)
    }

}