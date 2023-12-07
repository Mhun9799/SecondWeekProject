class Calculator(private val operation: AbstractOperation) {
    fun operate(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }

/*fun addOperation(addOp: AddOperation, x: Int, y: Int): Double {
    return addOp.operate(x, y)
}

fun substractOperation(subOp: SubstractOperation, x: Int, y: Int): Double {
    return subOp.operate(x, y)
}

fun multiplyOperation(multiOp: MultiplyOperation, x: Int, y: Int): Double {
    return multiOp.operate(x, y)
}

fun divideOperation(divideOp: DivideOperation, x: Int, y: Int): Double {
    return divideOp.operate(x, y)
}*/
}