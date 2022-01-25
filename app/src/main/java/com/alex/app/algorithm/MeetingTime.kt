package com.alex.app.algorithm

object MeetingTime {

    fun autoCorrectSuggestions(input: String, destinations: Array<String>): Array<String> {

        val result = mutableListOf<Pair<String, Int>>()
        destinations.forEach {
            val inputChars = input.toCharArray()
            val desChars = it.toCharArray()

            var score = 0
            inputChars.forEach { i ->
                desChars.forEach { d ->
                    if (i == d) {
                        score++
                    }
                }
            }
            result.add(Pair(it, score))
        }

        result.sortByDescending { it.second }
        return result.map { it.first }.subList(0, 2).toTypedArray()
    }


    fun suggestedMeetingTime(
        workingHours: Pair<Int, Int>,
        meetings: List<Pair<Int, Int>>,
        currentTime: Int,
        duration: Int
    ): String {

        val workStartTime = workingHours.first
        val workEndTime = workingHours.second

        val availableScheduleTime = Pair(Math.max(workStartTime, currentTime), workEndTime)
        // from current to work end

        var startTemp = availableScheduleTime.first

        val filtered = meetings.filter {
            it.first >= startTemp
        }

        filtered.forEachIndexed { index, pair ->

            if (startTemp in pair.first..pair.second) {
                startTemp = pair.second
                return@forEachIndexed
            }

            val end = startTemp + duration

            val availableEnd = if (index != meetings.lastIndex) {
                meetings.get(index + 1).first
            } else {
                availableScheduleTime.second
            }


            if (startTemp >= pair.second && end >= availableEnd) {
                return "$startTemp-$end"
            }
        }

        return "No time available"
    }

    private fun findAvailable(
        meetings: List<Pair<Int, Int>>,
        availableScheduleTime: Pair<Int, Int>,
        start: Int,
        end: Int
    ): String? {
        meetings.forEachIndexed { index, pair ->

            val availableEnd = if (index != meetings.lastIndex) {
                meetings.get(index + 1).first
            } else {
                availableScheduleTime.second
            }

            if (start >= pair.second && end >= availableEnd) {
                return "$start-$end"
            }
        }

        return null
    }
}