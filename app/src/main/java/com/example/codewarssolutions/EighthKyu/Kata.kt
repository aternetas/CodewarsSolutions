package com.example.codewarssolutions.EighthKyu

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

    /* Complete the solution so that it reverses all of the words within the string passed in.
    Words are separated by exactly one space and there are no leading or trailing spaces.
    E.g.: "The greatest victory is that which requires no battle" -->
            "battle no requires which that is victory greatest The"
    21.01.2023
    */
    fun reverseWords(str:String):String = str.split(" ").reversed().joinToString(" ")

    /* I have a cat and a dog.
    I got them at the same time as kitten/puppy. That was {humanYears} years ago.
    Return their respective ages now as [humanYears,catYears,dogYears].
    Notes: humanYears >= 1, humanYears are whole numbers only.
    Cat years: 15 for first year, +9 for second year, +4 for each year after that.
    Dog years: 15 for first year, +9 for second year, +5 for each year after that.
    21.01.2023
     */
    fun calculateYears(years: Int): Array<Int> {
        var catYears = if (years == 1) 15 else if (years == 2) 24 else 24 + (years - 2) * 4
        var dogYears = if (years == 1) 15 else if (years == 2) 24 else 24 + (years - 2) * 5
        return arrayOf(years, catYears, dogYears)
    }

    /* Write a program that finds the summation of every number from 1 to num.
    The number will always be a positive integer greater than 0.
    21.01.2023
     */
    fun summation(n:Int):Int {
        var res = 0
        (1..n).forEach {
            res += it
        }
        return res
    }
}