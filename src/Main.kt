

fun main(args: Array<String>) {
    val friendship = Friendship()
    var sentence: String = ""

    /**
     * This is closure example
     *
     * @param firstPeople - it's filled by "Sofian" string
     * @param secondPeople - it's filled by "Andika" string
     * @param someFunction - it's filled by all activities inside "{ }"
     *
     */
    friendship.addFriends("Sofian", "Andika") { a, b ->
        sentence = a + " is " + b + " enemy. "
        println(sentence)
    }

    friendship.addFriends("Sofian", "Andika") { c, d ->
        println("===============================")
        sentence = c + " is " + d + " friend."
        println(sentence)
        var temp = "They are same high school"
        sentence = sentence + " " + temp
        println("New Sentence : " + sentence)
    }
}

class Friendship {

    fun addFriends(firstPeople: String, secondPeople: String, someFunction: (String, String) -> Unit) {
        someFunction(firstPeople, secondPeople)
    }
}
