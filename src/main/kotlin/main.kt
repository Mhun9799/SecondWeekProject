fun main() {
    val calc = Calculator()

    println("""
       ---------- 연산을 선택 해주세요 ---------
       1. 더하기 2. 빼기 3. 곱하기 4.나누기
       ---------------------------------------
       """.trimIndent())
    val select: Int? = readLine()?.toInt()

    print("첫번째 숫자를 입력 해주세요: ")
    val x: Int? = readLine()?.toInt()
    print("두번째 숫자를 입력 해주세요: ")
    val y: Int? = readLine()?.toInt()

    if (x != null && y != null) {
        when (select) {
            1 -> println("$x 더하기 ${y}의 결과는 : ${calc.addOperation(AddOperation(), x, y)} 입니다.")
            2 -> println("$x  빼기 ${y}의 결과는  ${calc.substractOperation(SubstractOperation(), x, y)} 입니다.")
            3 -> println("$x 곱하기 ${y}의 결과는 ${calc.multiplyOperation(MultiplyOperation(), x, y)} 입니다.")
            4 -> println("$x 나누기 ${y}의 결과는 ${calc.divideOperation(DivideOperation(), x, y)} 입니다.")

        }
    } else{
        println("올바른 값을 입력 해주세요!!")
    }

}