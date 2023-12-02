package net.davidcrotty.algochallenges

import java.util.PriorityQueue

class TopKElements {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()

        // gives sorted buckets of frequency (bucket sort)
        for(num in nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1)
        }

        val queue = PriorityQueue<Int> { a, b ->
            freqMap[b]!! - freqMap[a]!!
        }

        for (pair in freqMap) {
            queue.offer(pair.key)
        }

        val result = IntArray(k)

        for (index in 0 until k) {
            result[index] = queue.poll()
        }

        return result
    }

}