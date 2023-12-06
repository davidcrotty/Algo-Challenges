package net.davidcrotty.algochallenges

class TrappingRainWater {

    fun trapRainWater(height: IntArray): Int {

        // find each occurance of highest number/peaks

        // this gives us pointers to search rainwater map between

        var peak1P = 0
        var peak2P = 1
        var match = false
        var trappedRain = 0

        for(i in height.indices) {
            if (peak1P > height.size - 1) break
            match = false

            var peak1 = height[peak1P]

            while (peak2P < height.size) {
                val peak2 = height[peak2P]

                if (peak1 >= 1 && peak2 >= peak1 && peak2P - peak1P >= 0) {
                    // match, scan for area
                    print("| peak, first: $peak1, second: $peak2 ")
                    var areaStartP = peak1P + 1
                    var areaEndP = peak2P - 1

                    val lowestPeak =  if (peak2 > peak1) {
                        peak1
                    } else {
                        peak2
                    }

                    while(areaStartP <= areaEndP) {

                        var depth = lowestPeak - height[areaStartP]
                        trappedRain = trappedRain + depth

                        areaStartP++
                    }


                    // then shift along
                    peak1P = peak2P
                    peak2P++
                    match = true
                    break
                } else {
                    peak2P++
                }
            }

            if (match) continue

            peak1P++
            peak2P = peak1P + 1
        }

        return trappedRain
    }
}