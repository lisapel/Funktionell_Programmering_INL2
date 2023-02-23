package adventOfCode.day1_2022

import java.io.File

//Day 1 2022 BEFORE
const val file = "src/INL_2/kotlin/adventOfCode/day1_2022/Input"


fun readFileToIntList(file: String): List<List<Int>> {
    val resultList = mutableListOf<MutableList<String>>()
    var subList = mutableListOf<String>()
    val inputList = file.let { File(it).bufferedReader().readLines() }
    for (i in inputList) {
        if (i.isNotEmpty()) {
            subList.add(i)
        } else {
            resultList.add(subList)
            subList = mutableListOf()
        }
    }
    resultList.add(subList)
    return resultList.map { list->list.map { it.toInt() } }
}

//A-DEL BEFORE
fun findMaxValue(list: List<List<Int>>): Int {
    return list.asSequence().map { it.sum() }.max()
}
//A-DEL AFTER
//->https://todd.ginsberg.com/post/advent-of-code/2022/day1/
fun findMaxValue2(list:List<List<Int>>):Int{
    return list.asSequence().map{ it.sum() }.sortedDescending().first()
}

//B-DEL BEFORE
fun sumTopThreeValues(list: List<List<Int>>): Int { //LÖSNING PÅ B-DEL
    return list.map { it.sum() }.sortedDescending().take(3).sum()
}

//B-DEL AFTER
//-> https://github.com/snowe2010/advent-of-code/blob/master/kotlin_aoc/src/main/kotlin/aoc2022/day1.kt
fun sumTopThreeValues2(list: List<List<Int>>):Int{
    return list.map { it.sum() }.sortedDescending().map { it }.subList(0,3).sum()
}

fun main() {
    println(findMaxValue(readFileToIntList(file)))
    println(findMaxValue2(readFileToIntList(file)))
    println(sumTopThreeValues(readFileToIntList(file)))
    println(sumTopThreeValues2(readFileToIntList(file)))

}
