class Main {
  static void main(String[] args) {
    Calculator calculator = new Calculator()
    println calculator.add(2, 6)
    println calculator.subtract(6, 1)
    println calculator.multiply(3, 7)
    println calculator.divide(10, 3)

    try {
      calculator.divide(24, 0)
    } catch (RuntimeException e) {
      assert e.getMessage() == "Cannot divide by zero! ☹️"
    }

    // Assert method
    // No output for the below since the assertion is true
    assert calculator.add(2, 6) == 8

    // With error message output since the assertion is false
    // assert calculator.add(2, 6) == 7

  }
}