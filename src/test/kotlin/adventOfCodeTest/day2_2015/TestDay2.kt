package adventOfCodeTest.day2_2015

import adventOfCode.day2_2015.*
import org.testng.annotations.Test

class TestDay2 {

    @Test
    fun getTotalWrappingPaperTest(){
        assert(totalSumOfWrappingPaper(getList("src/test/kotlin/adventOfCodeTest/day2_2015/Test")) == 101)
        assert(totalSumOfWrappingPaper(getList("src/test/kotlin/adventOfCodeTest/day2_2015/Test")) != 102)

    }
    @Test
    fun getTotalRibbonTest(){
        assert(totalSumOfRibbon(getList("src/test/kotlin/adventOfCodeTest/day2_2015/Test")) ==48)
        assert(totalSumOfRibbon(getList("src/test/kotlin/adventOfCodeTest/day2_2015/Test"))!=49)

    }
    @Test
    fun getTotalWrappingPaperTest2(){
        assert(totalSumOfWrappingPaper2("src/test/kotlin/adventOfCodeTest/day2_2015/Test") == 101)
        assert(totalSumOfWrappingPaper2("src/test/kotlin/adventOfCodeTest/day2_2015/Test") != 102)

    }
    @Test
    fun getTotalRibbonTest2(){
        assert(totalSumOfRibbon2("src/test/kotlin/adventOfCodeTest/day2_2015/Test") ==48)
        assert(totalSumOfRibbon2("src/test/kotlin/adventOfCodeTest/day2_2015/Test") !=49)

    }
}