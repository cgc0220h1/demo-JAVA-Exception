public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    @Override
    public String toString() {
        return "Not a triangle";
    }

    @Override
    public String getMessage() {
        return "Two side is smaller than third side";
    }
}
