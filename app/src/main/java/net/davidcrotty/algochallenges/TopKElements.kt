package net.davidcrotty.algochallenges

class TopKElements {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = nums.toList().groupingBy { it }.eachCount()

        val freq = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        map.forEach { key, value ->  freq[value].add(key) }

        return freq.flatMap { it }.takeLast(k).toIntArray()
    }

}