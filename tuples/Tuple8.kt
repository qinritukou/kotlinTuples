package tuples

import java.io.Serializable

data class Tuple8<out A, out B, out C, out D, out E, out F, out G, out H> (
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H
) : Serializable {
    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth)"
}

fun <T> Tuple8<T, T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)