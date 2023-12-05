package net.davidcrotty.algochallenges

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {
        val cleaned = Regex("[0-9!@#\$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/? ]").replace(s, "").lowercase()

        val reverse = cleaned.reversed()

        return cleaned == reverse
    }
}