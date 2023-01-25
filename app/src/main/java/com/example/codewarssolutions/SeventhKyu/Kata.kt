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

    /* There is a bus moving in the city which takes and drops some people at each bus stop.
    You are provided with a list (or array) of integer pairs. Elements of each pair represent
    the number of people that get on the bus (the first item) and the number of people
    that get off the bus (the second item) at a bus stop.
    Your task is to return the number of people who are still on the bus
    after the last bus stop (after the last array). Even though it is the last bus stop,
    the bus might not be empty and some people might still be inside the bus, they are probably sleeping there :D
    Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0.
    So the returned integer can't be negative.
    The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
    23.01.2023
     */
    fun people(busStops: Array<Pair<Int, Int>>) : Int {
        var people = 0
        busStops.forEach {
            people += it.first
            people -= it.second
        }
        return people
    }

    /* Given a string {str}, reverse it and omit all non-alphabetic characters.
    E.g.: "krishan" -> "nahsirk"
          "ultr53o?n" -> "nortlu"
    23.01.2023
     */
    fun reverseLetter(str: String): String {
        val reverseStr = str.reversed()
        var res = ""
        reverseStr.forEachIndexed {index, it ->
            if (it.isLetter()){
                res += it
            }
        }
        return res
    }

    /* Simple, given a string of words, return the length of the shortest word(s).
    String will never be empty and you do not need to account for different data types.
    24.01.2023
     */
    fun findShort(s: String): Int = s.split(" ").minByOrNull { it.length }!!.length

    /* John wants to decorate the walls of a room with wallpaper. He wants a fool-proof method for getting it right.
    John knows that the rectangular room has a length of l meters, a width of w meters, a height of h meters.
    The standard width of the rolls he wants to buy is 52 centimeters. The length of a roll is 10 meters.
    He wants to buy a length 15% greater than the one he needs.
    Your function wallpaper(l, w, h) should return as a plain English word in lower case the number of rolls he must buy.
    Notes:
    all rolls (even with incomplete width) are put edge to edge;
    0 <= l, w, h (floating numbers); it can happens that w * h * l is zero;
    the integer r (number of rolls) will always be less or equal to 20;
    he number of rolls will be a positive or null integer (not a plain English word; this number can be greater than 20)
    E.g.: wallpaper(4.0, 3.5, 3.0) -> "ten", wallpaper(0.0, 3.5, 3.0) -> "zero"
    24.01.2023
     */
    fun wallpaper(l:Double, w:Double, h:Double):String {
        val numbers = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve","thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty")
        if (l * w * h == 0.0) return numbers[0]
        val sOfWallpaper = 5.2
        var sOfRoom = 2 * (l + w) * h * 1.15
        var rolls = Math.ceil(sOfRoom / sOfWallpaper).toInt()
        return numbers[rolls]
    }


}