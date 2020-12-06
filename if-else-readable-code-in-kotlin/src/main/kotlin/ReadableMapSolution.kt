val mappings = mapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4,
        "E" to 5,
        "F" to 6,
        "G" to 7
)

val result = mappings["A"]


val multiMappings = mapOf(
        ("A" to "A") to 1,
        ("A" to "B") to 2,
        ("A" to "C") to 3,
        ("B" to "A") to 2,
        ("B" to "B") to 4,
        ("B" to "C") to 6
)

val mulitMapResult = multiMappings["A" to "B"]

val mappingsToMethods = mapOf(
        "A" to { (0..10).random()},
        "B" to { (0..10).random()},
        "C" to { (0..10).random()},
        "D" to { (0..10).random()},
        "E" to { (0..10).random()}
)

val resultExecutedCode = mappingsToMethods["A"]?.invoke()