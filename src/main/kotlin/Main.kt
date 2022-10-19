import kotlin.math.*

fun main()
{

    //задание 1
    val exercises: Int = 13;
    var exercisesSolved: Int = 0;
    exercisesSolved += 1;

    //задание 2
    val Age: Int = 18;

    //задание 3
    var averageAge: Double = 18.0
    averageAge = (averageAge + 30.0) / 2.0
    print(averageAge)

    //задание 4
    val testNumber: Int = 17
    val evenOdd: Int = testNumber % 2
    print(evenOdd)

    //задание 5
    var answer: Int = 0
    answer += (1 + 10) * 10 shr 3
    print(answer)

    //задание 6
    var age: Int = 16
    println(age)
    age = 30
    print(age)

    //задание 7
    val a: Int = 46
    val b: Int = 10

    //1
    val answer1: Int = (a * 100) + b
    //2
    val answer2: Int = (a * 100) + (b * 100)
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println(answer1)
    println(answer2)
    println(answer3)

    //задание 8
    (5 * 3) - ((4 / 2) * 2)

    //задание 9
    val a: Double = 6.0
    val b: Double = 17.0
    val average: Double = a + b / 2

    //задание 10
    val fahrenheit: Double = 10.0
    val celcius: Double = fahrenheit - 32.0 / 1.8
    print(celcius)

    //задание 11
    val pozicion: Int = 36
    val row: Int = pozicion / 8
    val cul: Int = pozicion % 8
    println(pozicion)
    println(row)
    println(cul)

    //задание 12
    val degrees:Double=40.0
    val radians:Double=PI*degrees/180.0
    println(radians)
    exercisesSolved += 1

}