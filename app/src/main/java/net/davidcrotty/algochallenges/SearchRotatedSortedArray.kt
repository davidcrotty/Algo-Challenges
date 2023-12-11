package net.davidcrotty.algochallenges

class SearchRotatedSortedArray {

    fun search(array: IntArray, target: Int): Int {
        var pivotP = pivot(array)

        var start = 0
        var end = array.size - 1

        while (start < end) {

            if (array[pivotP] == target) {
                return pivotP
            } else if (array[pivotP] > target) {
                pivotP++
                start = pivotP
            } else {
                pivotP--
                end = pivotP
            }
        }

        return -1
    }

    private fun pivot(array: IntArray): Int {

        var start = 0
        var end = array.size - 1

        while(start < end) {

            var midP = (start + end) / 2

            if (array[midP] > array[midP + 1] && array[midP] > array[midP - 1]) {
                return midP
            } else if (array[midP] > array[midP + 1]) {
                // move this way
                midP++
                start = midP
            } else {
                midP--
                end = midP
            }

        }

        return -1
    }
}