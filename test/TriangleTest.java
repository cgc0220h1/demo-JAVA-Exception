import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @DisplayName("Throw ra exception khi đối tượng Rectangle tạo ra sai kích thước")
    @Test
    void testThrowException() {
        assertThrows(IllegalTriangleException.class, () -> new Triangle(1, 1, -1));
    }

    @DisplayName("Test kết quả trả về của phương thức getMessage() của Execption")
    @Test
    void testGetMessageException() {
        try {
            Triangle triangle = new Triangle(1,1,-1);
        } catch (IllegalTriangleException e) {
            assertTrue(e.getMessage().contains("Two side is smaller than third side"));
        }
    }

}