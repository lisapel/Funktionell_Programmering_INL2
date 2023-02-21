package tomteland


class Tomteland {


    var tomtar =
        mapOf(
            "Tomten" to listOf("Glader", "Butter"),
            "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
            "Trötter" to listOf("Skumtomten"),
            "Skumtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")

        )

    fun getUnderlings(currentName: String, res: MutableList<String>): List<String> {
        if (tomtar.containsKey(currentName)) {
            res+=(tomtar.getValue(currentName))
            for (value in tomtar.getValue(currentName)) {
                if (tomtar.containsKey(value)) {
                    getUnderlings(value, res)
                }
            }
        }
        return res
    }
}

fun main() {
    val tomte = Tomteland()
    val list: MutableList<String> = mutableListOf()
    println(tomte.getUnderlings("Tomten", list))

}
