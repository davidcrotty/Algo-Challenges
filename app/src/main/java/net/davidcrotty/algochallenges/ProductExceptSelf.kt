package net.davidcrotty.algochallenges

class ProductExceptSelf {

    fun productExceptSelf(nums: IntArray): IntArray {

        val end = nums.lastIndex
        val products = IntArray(nums.size) { 1 }
        var left = 1
        var right = 1

        // loop through each in array, produce array excluding that number
        for(i in nums.indices) {
          products[i] *= left
          products[end - i] *= right

          right *= nums[end - i]
          left *= nums[i]
        }

        return products
    }
}