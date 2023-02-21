package adventOfCodeTest.day1_2022

import adventOfCode.day1_2022.*
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class TestDay1 {


    @Test
    fun getMaxValue(){
        assertEquals(444, findMaxValue(readFileToIntList("src/test/kotlin/adventOfCodeTest/day1_2022/Test")))
        assert(findMaxValue(readFileToIntList("src/test/kotlin/adventOfCodeTest/day1_2022/Test")) !=10)
    }
    @Test
    fun getMaxValue2(){
        assertEquals(444, findMaxValue2(readFileToIntList("src/test/kotlin/adventOfCodeTest/day1_2022/Test")))
        assert(findMaxValue2(readFileToIntList("src/test/kotlin/adventOfCodeTest/day1_2022/Test")) !=10)
    }

    @Test
    fun getTopThreeValuesInASum(){
        assertEquals(688, sumTopThreeValues(readFileToIntList("src/test/kotlin/adventOfCodeTest/day1_2022/Test")))
    }
    @Test
    fun getTopThreeValuesInASum2(){
        assertEquals(688, sumTopThreeValues2(readFileToIntList("src/test/kotlin/adventOfCodeTest/day1_2022/Test")))
    }
}