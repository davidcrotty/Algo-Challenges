package net.davidcrotty.algochallenges

class TimeBasedKeystore {

    private val map = mutableMapOf<String, String>()

    fun get(key: String, timestamp: Int): String? {
        return map[key]
    }

    fun set(key: String, value: String, timestamp: Int) {
        map[key] = value
    }
}