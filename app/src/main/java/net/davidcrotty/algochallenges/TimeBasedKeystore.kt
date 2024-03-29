package net.davidcrotty.algochallenges

class TimeBasedKeystore {

    private val map = mutableMapOf<String, MutableList<Pair<Int, String>>>()

    fun get(key: String, timestamp: Int): String {

        val value = map[key]

        if (value == null) return ""

        var left = 0
        var right = value.size - 1
        var midP: Int = -1

        while (left <= right) {
            midP = (left + right) / 2

            if (value[midP].first == timestamp) {
                return value[midP].second
            } else if (timestamp > value[midP].first) {
                midP++
                left = midP
            } else {
                midP--
                right = midP
            }
        }

        return value[value.size - 1].second
    }

    fun set(key: String, value: String, timestamp: Int) {

        val current = map[key]
        if (current == null) {
            map[key] = mutableListOf(
                Pair(timestamp, value)
            )
        } else {
            var left = 0
            var right = current.size - 1

            while (left <= right) {
                var midP = (left + right) / 2

                // if left == midP
                if (left == midP) {
                    current.add(current.size, Pair(timestamp, value))
                    break
                } else if (right == midP) {
                    current.add(0, Pair(timestamp, value))
                    break
                }

                // if we have it, replace it
                if (current[midP].first == timestamp) {
                    current[midP] = Pair(timestamp, value)
                } else if (current[midP].first < timestamp) {
                    midP++
                    left = midP
                } else {
                    midP--
                    right = midP
                }
            }
        }
    }
}