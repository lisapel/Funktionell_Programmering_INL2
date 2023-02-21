package adventOfCodeTest.day1_2018

import adventOfCode.day1_2018.*
import org.testng.annotations.Test

class TestDay1 {

    @Test
    fun calcFrequencyTest(){
        assert(calcFrequency(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test")) ==21)
        assert(calcFrequency(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test")) !=22)

    }
    @Test
    fun calcFrequencyTest2(){
        assert(calcFrequency2(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test")) =="21")
        assert(calcFrequency2(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test")) !="22")
    }
    @Test
    fun findFrequencyThatHitsTwiceTest(){
        assert(findFrequencyThatHitsTwice(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test2")) ==2)
        assert(findFrequencyThatHitsTwice(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test2")) !=3)

    }
    @Test
    fun findFrequencyThatHitsTwiceTest2(){
        assert(findFrequencyThatHitsTwice2(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test2")) ==2)
        assert(findFrequencyThatHitsTwice2(getList("src/test/kotlin/adventOfCodeTest/day1_2018/Test2")) !=3)

    }
}