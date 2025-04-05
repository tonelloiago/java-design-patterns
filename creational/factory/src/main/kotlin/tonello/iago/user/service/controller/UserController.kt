package tonello.iago.user.service.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tonello.iago.user.service.domain.User
import tonello.iago.user.service.dto.CreateUserRequest
import tonello.iago.user.service.dto.CreateUserResponse
import tonello.iago.user.service.service.UserService

@RestController
@RequestMapping("/v1/api/users")
class UserController(private val userService: UserService) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = userService.findById(id)?.let { ResponseEntity.ok(it) }
        ?: ResponseEntity.notFound().build()

    @PostMapping
    fun create(@RequestBody user: CreateUserRequest): ResponseEntity<CreateUserResponse> {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user))
    }

}