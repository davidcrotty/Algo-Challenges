package net.davidcrotty.algochallenges

class ContainerWithMostWater {

    fun containerWithMostWater(verticalLines: IntArray): Int {

        var bestArea = 0

        for (line in verticalLines.withIndex()) {
            val startP = line.index
            var endP = line.index + 1

            while(endP < verticalLines.size) {

                var startHeight = verticalLines[startP]
                var endHeight = verticalLines[endP]

                // tallestpointP, compare pointers
                val smallestpointP = if (startHeight == endHeight) {
                    startP
                } else if(startHeight < endHeight) {
                    startP
                } else {
                    endP
                }

                val area = if (smallestpointP == startP) {
                    verticalLines[startP] * (endP - 1)
                } else {
                    verticalLines[endP] * (endP - startP)
                }

                if (area > bestArea) {
                    bestArea = area
                }

                endP++
            }
        }

        return bestArea
    }
}