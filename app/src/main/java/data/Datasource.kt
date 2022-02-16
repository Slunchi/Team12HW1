package data

import com.example.team12_hw1.R
import model.Animal

class Datasource {
    fun loadFacts() : List<Animal>{
        return listOf<Animal>(
            Animal(R.string.q1, R.string.animal1, R.drawable.monkey),
            Animal(R.string.q2, R.string.animal2, R.drawable.monkey),
            Animal(R.string.q3, R.string.animal3, R.drawable.monkey),
            Animal(R.string.q4, R.string.animal4, R.drawable.monkey),
            Animal(R.string.q5, R.string.animal5, R.drawable.monkey),
            Animal(R.string.q6, R.string.animal6, R.drawable.monkey),
            Animal(R.string.q7, R.string.animal7, R.drawable.monkey),
            Animal(R.string.q8, R.string.animal8, R.drawable.monkey),
            Animal(R.string.q9, R.string.animal9, R.drawable.monkey),
            Animal(R.string.q10, R.string.animal10, R.drawable.monkey)
        )
    }
}