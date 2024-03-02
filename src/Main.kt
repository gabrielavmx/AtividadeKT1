import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>)
{
    println(Retangulo(10,5))
    println(Circu(5))
    println(Losangulo(5,10))
    println(Trapezio(5,10,5))
    println(TEquilatero(5.0))
    println(TIsoceles(10,5))
    println(TEscaleno(9.0, 7.0, 14.0, 15.0))
}

fun Retangulo(a: Int, b: Int): Int
{
    return a * b
}

fun Circu(c: Int): Double
{
    return 2 * PI * c
}

fun Losangulo(d: Int, e: Int): Double
{
    return (d * e)/2.0
}

fun  Trapezio(f: Int, g: Int, h: Int): Double
{
    return (f + g) * h / 2.0
}

fun TEquilatero(i: Double): Double
{
    return (i.pow(2) * sqrt(3.0))/4
}

fun TIsoceles(j: Int, k: Int): Double
{
    return (j * k)/2.0
}

fun TEscaleno(l: Double, m: Double, n: Double, o: Double): Double
{
    return sqrt(o * (o - l) * (o - m) * (o - n))
}