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
        var end = possibleKValues.size - 1

        var currentK = 0

        while((end + 1) > start) {

            val mid = (start + end) / 2

            val hours = checkBananaHours(pile, possibleKValues[mid])
            // grab mid, brute force array, is it too fast or too slow? (== h?)

            if (hours <= h) {
                if (possibleKValues[mid] > currentK) {
                    currentK = possibleKValues[mid]
                }
            }

            if (hours > h) {
                // left
                end = mid - 1
            } else {
                // right
                start = mid + 1
            }
        }


        return currentK
    }

    private fun checkBananaHours(pile: IntArray, k: Int): Int {

        var totalHours = 0

        for (i in pile.indices) {
            var hoursInPile = pile[i] / k
            totalHours = totalHours + hoursInPile
        }

        return totalHours
    }
}