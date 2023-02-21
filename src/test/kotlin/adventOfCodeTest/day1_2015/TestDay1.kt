package adventOfCodeTest.day1_2015

import adventOfCode.day1_2015.*
import org.testng.annotations.Test

class TestDay1 {

    @Test
    fun getFloorTest(){
        assert(getFloor(getList("src/test/kotlin/adventOfCodeTest/day1_2015/Test")) == -1)
        assert(getFloor(getList("src/test/kotlin/adventOfCodeTest/day1_2015/Test")) != 2)
    }
    @Test
    fun getFloorTest2(){
        assert(getFloor2(getList("src/test/kotlin/adventOfCodeTest/day1_2015/Test")) ==-1)
        assert(getFloor2(getList("src/test/kotlin/adventOfCodeTest/day1_2015/Test")) !=2)
    }
    @Test
    fun getToBasementTest(){
        assert(getToBasement(getList("src/test/kotlin/adventOfCodeTest/day1_2015/Test")) ==11)
        assert(getToBasement(getList("src/test/kotlin/adventOfCodeTest/day1_2015/Test")) !=10)
    }
    @Test
    fun getToBasementTest2(){
        assert(getToBasement2("src/test/kotlin/adventOfCodeTest/day1_2015/Test") ==11)
        assert(getToBasement2("src/test/kotlin/adventOfCodeTest/day1_2015/Test") !=10)
    }

}