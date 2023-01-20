package com.example.codewarssolutions.EightKyu

class Kata {
    /* Create a function that takes an integer as an argument and returns "Even" for even numbers
    or "Odd" for odd numbers.
    17.01.2023
     */
    fun evenOrOdd(number: Int): String {
        return if (number % 2 == 0) "Even" else "Odd"
    }

    /* Clock shows h hours, m minutes and s seconds after midnight.
    Your task is to write a function which returns the time since midnight in milliseconds.
    17.01.2023
     */
    fun past(h: Int, m: Int, s: Int): Int {
        return h * 3600000 + m * 60000 + s * 1000
    }

    /* Write a function that accepts an integer n and a string s as parameters, and returns
    a string of s repeated exactly n times.
    17.01.2023
     */
    fun repeatStr(r: Int, str: String): String{
        var result = ""
        for (n in 0 until r){
            result += str
        }
        return result
    }

    /* Given a non-empty array of integers, return the result of multiplying the values
    together in order.
    17.01.2023
     */
    fun grow(arr: IntArray): Int {
        var sum = arr[0]
        var i = 1
        while (i in arr.indices){
            sum *= arr[i]
            i++
        }
        return sum
    }

    /* This kata is about multiplying a given number by eight if it is an even number
    and by nine otherwise.
    19.01.2023
     */
    fun simpleMultiplication(n: Int): Int = if (n % 2 == 0) n * 8 else n * 9

    /* Nathan loves cycling.
    Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water
    per hour of cycling.
    You get given the time in hours and you need to return the number of litres Nathan will drink,
    rounded to the smallest value.
    19.01.2023
     */
    fun litres(time: Double): Int = (time * 0.5).toInt()

    /* Given a set of numbers, return the additive inverse of each. Each positive becomes negatives,
    and the negatives become positives.
    19.01.2023
     */
    fun invert(arr: IntArray): IntArray = arr.map {it * (-1)}.toIntArray()

    /*Given the triangle of consecutive odd numbers. Calculate the sum of the numbers
    in the nth row of this triangle (starting at index 1). E.g.:
    1 -->  1
    2 --> 3 + 5 = 8
    3 --> 7 + 9 + 11 = 16
    20.01.2023
     */
    fun rowSumOddNumbers(n: Int): Int = Math.pow(n.toDouble(), 3.00).toInt()

    /*Find the total sum of internal angles (in degrees) in an n-sided simple polygon.
    N will be greater than 2.
    20.01.2023
     */
    fun angle(n: Int): Int = (n - 2) * 180

}