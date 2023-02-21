package adventOfCodeTest.day1_2019

import adventOfCode.day1_2019.*
import org.testng.annotations.Test

class TestDay1 {

    @Test
    fun calcTotalFuelTest(){
        assert(calcTotalFuel(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) ==20.0)
        assert(calcTotalFuel(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) !=21.0)

    }
    @Test
    fun calcTotalFuelRequirementsTest(){
        assert(calcTotalFuelRequirements(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) ==22.0)
        assert(calcTotalFuelRequirements(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) !=21.0)

    }
    @Test
    fun calcTotalFuelTest2(){
        assert(calcTotalFuel2(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) ==20.0)
        assert(calcTotalFuel2(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) !=21.0)

    }
    @Test
    fun calcTotalFuelRequirementsTest2(){
        assert(calcTotalFuelRequirements2(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) ==22.0)
        assert(calcTotalFuelRequirements2(getList("src/test/kotlin/adventOfCodeTest/day1_2019/Test")) !=21.0)

    }

}