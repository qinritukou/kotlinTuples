package tuples

import java.io.Serializable

data class Tuple3<out A, out B, out C> (
    val first: A,
    val second: B,
    val third: C
) : Serializable {
    override fun toString() = "($first, $second, $third)"
}

fun <T> Tuple3<T, T, T>.toList(): List<T> = listOf(first, second, third)