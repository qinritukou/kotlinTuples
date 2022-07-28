package tuples

import java.io.Serializable

data class Tuple5<out A, out B, out C, out D, out E> (
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E
) : Serializable {
    override fun toString() = "($first, $second, $third, $fourth, $fifth)"
}

fun <T> Tuple5<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)