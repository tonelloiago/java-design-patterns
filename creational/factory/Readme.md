🏭 Factory Method – Exception Handling
- The **Factory Method** pattern is used here to centralize and standardize the creation of exceptions throughout the application. This helps improve code readability, maintainability, and consistency in error responses.

📄 Example: [ExceptionFactory.kt](https://github.com/tonelloiago/java-design-patterns/blob/main/creational/factory/src/main/kotlin/tonello/iago/user/service/exception/ExceptionFactory.kt)

```kotlin
object ExceptionFactory {

    fun errorOnCreateUser(): BaseException {
        return BaseException(HttpStatus.UNPROCESSABLE_ENTITY, Errors.ERROR_ON_CREATE_USER)
    }

}
```

📝 Usage: [UserService.kt](https://github.com/tonelloiago/java-design-patterns/blob/main/creational/factory/src/main/kotlin/tonello/iago/user/service/service/UserService.kt)

```kotlin
  fun create(createUserRequest: CreateUserRequest): CreateUserResponse {

        try {
            ...
        }catch (e: Exception) {
            throw ExceptionFactory.errorOnCreateUser()
        }
    }
```

🎯 Why use a Factory for exceptions?
 
- ✅ Centralized logic for creating exceptions
- ✅ Ensures consistency in error codes and messages
- ✅ Avoids duplication across services and controllers
- ✅ Enables customization and easier maintenance

❌ Cons of Exception Factory Method
- Extra Abstraction Layer: For small projects or isolated error cases, this might feel like overengineering.
- Reduced Flexibility in Some Scenarios: If the factory centralizes too much logic, it might become harder to handle exceptions that require complex construction logic.
- Risk of violate Single Responsability Principle: If all exception creation is placed into one big ExceptionFactory, it may grow too large.
