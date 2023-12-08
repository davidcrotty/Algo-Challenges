package net.davidcrotty.algochallenges

class KokoEatsBananas {

    fun minEatingSpeed(pile: IntArray, h: Int): Int {

        val sortedPile = pile.sorted().toMutableList()

        val largest = sortedPile.last()
        val possibleKValues = mutableListOf<Int>()

        for (i in 0..largest) {
            possibleKValues.add(i)
        }

        var start = 0
        var end = possibleKValues.size

        var currentK = largest

        while(start <= end) {

            val mid = (start + end) / 2

            val hours = checkBananaHours(pile, possibleKValues[mid])
            // grab mid, brute force array, is it too fast or too slow? (== h?)

            if (hours <= h) {
                currentK = Math.min(possibleKValues[mid], currentK)
                end = mid - 1
            } else {
                start = mid + 1
            }
        }


        return currentK
    }

    private fun checkBananaHours(pile: IntArray, k: Int): Int {

        var totalHours = 0

        for (i in pile.indices) {
            var hoursInPile = Math.ceil(pile[i].toDouble() / k).toInt()
            totalHours = totalHours + hoursInPile
        }

        return totalHours
    }
}