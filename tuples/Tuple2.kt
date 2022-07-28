package tuples

import java.io.Serializable

data class Tuple2<out A, out B> (
    val first: A,
    val second: B
) : Serializable {
    override fun toString() = "($first, $second)"
}

fun <T> Tuple2<T, T>.toList(): List<T> = listOf(first, second)