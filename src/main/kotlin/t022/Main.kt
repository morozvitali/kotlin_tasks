package t022

/*
TODO:   Напишите класс, который выводит на экран в первой строке три знака
        «+»,во второй - четыре знака«!», в третьей - два знака«?».
 */

fun main() {
    print("+", 3)
    print("!", 4)
    print("?", 2)
}

fun print(str: String, int: Int) {
    for (i in 1..int) {
        print(str)
    }
    println()
}