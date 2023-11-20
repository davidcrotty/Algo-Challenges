package net.davidcrotty.algochallenges

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = listOf(listOf<String>())

        val resultMap = mutableMapOf<String, MutableList<String>>()

        for(str in strs) {

            val key = String(str.toCharArray().sortedArray())

            if(!resultMap.contains(key)) {
                resultMap[key] = mutableListOf()
            } else {
                resultMap[key]?.add(str)
            }
        }

        return resultMap.values.toList()
    }

}