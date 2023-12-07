fun main() {
    println("""
       ---------- 연산을 선택 해주세요 ---------
       1.   +     2.   -     3.   *    4.   /
       ----------------------------------------
       """.trimIndent())
    val select = readln()

    print("첫번째 숫자를 입력 해주세요: ")
    val x: Int = readln().toInt()
    print("두번째 숫자를 입력 해주세요: ")
    val y: Int = readln().toInt()


   // if (x != null && y != null) {
       val operation = when (select) {
            "+" -> AddOperation()
            "-" -> SubstractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> throw IllegalArgumentException("Invalid operator")
            /*
            1 -> println("$x 더하기 ${y}의 결과는 : ${calc.addOperation(AddOperation(), x, y)} 입니다.")
            2 -> println("$x  빼기 ${y}의 결과는  ${calc.substractOperation(SubstractOperation(), x, y)} 입니다.")
            3 -> println("$x 곱하기 ${y}의 결과는 ${calc.multiplyOperation(MultiplyOperation(), x, y)} 입니다.")
            4 -> println("$x 나누기 ${y}의 결과는 ${calc.divideOperation(DivideOperation(), x, y)} 입니다.")
            */
        }
   /* } else{
        println("올바른 값을 입력 해주세요!!")
    }*/
    val calculator = Calculator(operation)
    val result = calculator.operate(x,y)
    val selString = when (select){
        "+" -> "더하기"
        "-" -> "빼기"
        "*" -> "곱하기"
        "/" -> "나누기"
        else -> throw IllegalArgumentException("Invalid operator")

    }
    println("$x $selString $y 결과는 = $result 입니다")


}