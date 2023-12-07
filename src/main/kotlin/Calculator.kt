class Calculator {
    fun addOperation(addOp: AddOperation, x: Int, y: Int): Double {
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
    }
}