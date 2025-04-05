package tonello.iago.user.service.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Timestamp

@Entity
@Table(name = "users")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    val name: String,

    val document: String,

    @Column(unique = true)
    val username: String,

    @Column(unique = true)
    val email: String,

    @Column(name = "password_hash")
    val passwordHash: String,

    @Column(name = "face_recognition_hash")
    val faceRecognitionHash: String? = null,

    @Column(name = "created_at")
    val createdAt: Timestamp
)
