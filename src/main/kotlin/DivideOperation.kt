class DivideOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        if (num2 == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return num1/num2.toDouble()
    }
}