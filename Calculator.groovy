class Calculator {

    // Add
    int add(int a, int b) {
        a + b
    }

    // Subtract
    int subtract(int a, int b) {
        a - b
    }

    // Multiply
    int multiply(int a, int b) {
        a * b
    }

    // Divide
    float divide(int a, int b) {
        // Handle divide by zero
        if (b == 0) {
            throw new RuntimeException("Cannot divide by zero! ☹️")
        }
        a / b
    }  
}