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
}