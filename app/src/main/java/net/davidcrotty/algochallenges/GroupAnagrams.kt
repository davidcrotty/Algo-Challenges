package net.davidcrotty.algochallenges

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val scoredCollection1 = mutableListOf<MutableMap<Char, Int>>()

        for (word in strs) {
            val comparitor1 = mutableMapOf<Char, Int>()
            for(char in word) {
                if (comparitor1.containsKey(char)) {
                    // accounts for multiple words
                    comparitor1[char] = comparitor1[char]!!.plus(1)
                } else {
                    comparitor1[char] = 0
                }
            }

            scoredCollection1.add(comparitor1)
        }

        val scoredCollection2 = mutableListOf<MutableMap<Char, Int>>()

        for (word in strs) {
            val comparitor2 = mutableMapOf<Char, Int>()
            for(char in word) {
                if (comparitor2.containsKey(char)) {
                    // accounts for multiple words
                    comparitor2[char] = comparitor2[char]!!.plus(1)
                } else {
                    comparitor2[char] = 0
                }
            }

            scoredCollection2.add(comparitor2)
        }

        val results = mutableListOf(mutableListOf<String>())

        // for each see if equal
        for (compare1 in scoredCollection1) {
            val matches = mutableListOf<String>()

            for (compare2 in scoredCollection2) {
                if (compare1 == compare2) {
                    matches.add(compare2.keys.toString())
                }
            }

            results.add(matches)
        }

        return results
    }

}