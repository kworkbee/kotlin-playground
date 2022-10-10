import atomictest.eq

data class Computation(
    val data: Int,
    val info: String
)

fun evaluate(input: Int) = 
    if (input > 5)
        Computation(input * 2, "High")
    else
        Computation(input * 2, "Low")

fun compute(input: Int): Pair<Int, String> = 
    if (input > 5)
        Pair(input * 2, "High")
    else
        Pair(input * 2, "Low")

fun main() {
    compute(7) eq Pair(14, "High")
    compute(4) eq Pair(8, "Low")

    val result = compute(5)
    result.first eq 10
    result.second eq "Low"

    val (value, description) = evaluate(7)
    value eq 14
    description eq "High"
}