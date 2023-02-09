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
        val sOfRoom = 2 * (l + w) * h * 1.15
        val rolls = Math.ceil(sOfRoom / sOfWallpaper).toInt()
        return numbers[rolls]
    }

    /* King Arthur and his knights are having a New Years party. Last year Lancelot was jealous of Arthur,
    because Arthur had a date and Lancelot did not, and they started a duel.
    To prevent this from happening again, Arthur wants to make sure that there are at least
    as many women as men at this year's party. He gave you a list of integers of all the party goers.
    Arthur needs you to return true if he needs to invite more women or false if he is all set.
    29.01.2023
     */
    fun inviteMoreWomen(l: List<Int>): Boolean = l.count{ it == -1 } < l.count{ it == 1 }

    /* Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
    Square all numbers k (0 <= k <= n) between 0 and n.
    Count the numbers of digits d used in the writing of all the k**2.
    E.g.: nbDig(0, 1) --> 4
            the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
            We are using the digit 1 in: 1, 16, 81, 100. The total count is then 4.
    29.01.2023
     */
    fun nbDig(n:Int, d:Int):Int = (0..n).map { it * it }.joinToString("").count {it.toString() == d.toString()}

    /* In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
    Your function receives one side of the DNA (string); you need to return the other complementary side.
    E.g.: "ATTGC" -> "TAACG"
    3.02.2023
     */
    fun makeComplement(dna: String): String = dna.map {
        when(it) {
            'A' -> 'T'
            'T' -> 'A'
            'G' -> 'C'
            'C' -> 'G'
            else -> ' '
        }
    }.joinToString("")

    /* Given a positive integer n: 0 < n < 1e6, remove the last digit until you're left with a number
    that is a multiple of three.
    Return n if the input is already a multiple of three,
    and if no such number exists, return null, a similar empty value, or -1.
    E.g.: 1 -> null, 25 -> null, 36 -> 36, 1244 -> 12
    07.02.2023
     */
    fun prevMultOfThree(n: Int): Int? {
        var res = n
        while (res % 3 != 0) {
            val r = res.toString().dropLast(1)
            if (r.isEmpty()){
                return null
            }
            res = r.toInt()
        }
        return res
    }

    /* In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.
    E.g.: "1 2 3 4 5" -> "5 1"
    08.02.2023
    */
    fun highAndLow(numbers: String): String {
        val nums = numbers.split(" ").map { it.toInt() }
        return "${nums.maxOrNull()} ${nums.minOrNull()}"
    }

    /* Create a function argsCount, that returns the count of passed arguments
    08.02.2023
     */
    fun argsCount(vararg args: Any): Int = args.count()

    /* You are given a sequence of a journey in London, UK. The sequence will contain bus numbers
    and TFL tube names as strings. Journeys will always only contain a combination of tube names
    and bus numbers. Each tube journey costs £2.40 and each bus journey costs £1.50.
    If there are 2 or more adjacent bus journeys, the bus fare is capped for sets of two
    adjacent buses and calculated as one bus fare for each set.
    Your task is to calculate the total cost of the journey and return the cost
    rounded to 2 decimal places in the format (where x is a number): £x.xx
    E.g.: 'Piccadilly', 56, 93, 243, 20, 14 -> "£6.90"
    08.02.2023
     */
    fun londonCityHacker(journey: Array<Any>): String {
        var sum = 0.0
        var isFirstBusInARow = false
        for (i in journey.indices){
            val ii = journey[i].toString()
            if (ii.all { it.isDigit() }) {
                if (isFirstBusInARow) {
                    isFirstBusInARow = false
                    continue
                } else {
                    isFirstBusInARow = true
                    sum += 1.5
                }
            }
            else {
                sum += 2.4
                isFirstBusInARow = false
            }
        }
        val res = String.format("%.2f", sum)
        return "£$res"
    }
}