package net.davidcrotty.algochallenges

class Anagrams {

    fun isAnagram(s: String, t: String): Boolean {

        val comparitor1 = s.toCharArray()
        val comparitor2 = t.toCharArray()

        val comparitor1Map = mutableMapOf<Char, Int>()
        val comparitor2Map = mutableMapOf<Char, Int>()

        for (char in comparitor1) {
            if (comparitor1Map.contains(char)) {
                comparitor1Map[char + 1] = 1
            } else {
                comparitor1Map[char] = 1
            }
        }

        for (char in comparitor2) {
            if (comparitor2Map.contains(char)) {
                comparitor2Map[char + 1] = 1
            } else {
                comparitor2Map[char] = 1
            }
        }

        return comparitor1Map == comparitor2Map
    }
}