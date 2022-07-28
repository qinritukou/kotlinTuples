package tuples

import java.io.Serializable

data class Tuple6<out A, out B, out C, out D, out E, out F> (
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F
) : Serializable {
    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

fun <T> Tuple6<T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth)