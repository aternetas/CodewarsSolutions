package com.example.codewarssolutions.SeventhKyu

class Kata {
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