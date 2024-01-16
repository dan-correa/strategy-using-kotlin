import com.demo.repository.userRepository.UserRepository
import com.demo.service.NewUserDetails
import com.demo.service.UserService
import com.demo.utils.passwordUtils.WeakPasswordException
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import jakarta.validation.Valid
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.io.IOException
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

@SpringBootTest(classes = [UserServiceTest::class])
class UserServiceTest {
    private val userRepository: UserRepository = mockk(relaxed = true)
    private val userService = UserService(userRepository)
    @BeforeEach
    fun setUp() {
        clearAllMocks()
    }
    @AfterEach
    fun tearDown() {
        clearAllMocks()
    }
    @Test
    fun newUserShouldSaveUserAndReturnSuccessMessage() {

        every { userRepository.save(any()) } returns mockk()
        val newUserDetails = NewUserDetails("JohnDoe", "john.doe@example.com", "password")
        val result = userService.newUser(newUserDetails)

    }

    @Test
    fun newUserWeakPasswordException() {

        every { userRepository.save(any()) } returns mockk()
        val newUserDetails = NewUserDetails("JohnDoe", "john.doe@example.com", "password")
        val exception = assertFailsWith<WeakPasswordException> {
            userService.newUser(newUserDetails)
        }

        val expectedMessage = "Weak PassWord"
        assertEquals(expectedMessage,exception.message)

    }
}