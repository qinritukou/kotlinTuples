package tuples

import java.io.Serializable

data class Tuple11<out A, out B, out C, out D, out E, out F, out G, out H, out I, out J, out K> (
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H,
    val ninth: I,
    val tenth: J,
    val eleventh: K
) : Serializable {
    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth, $ninth, $tenth, $eleventh)"
}

fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh)