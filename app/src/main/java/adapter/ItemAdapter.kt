package adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.team12_hw1.MainActivity
import com.example.team12_hw1.R
import data.Datasource
import model.Animal

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Animal>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    var score: Int = 0
    val true_answers = listOf("1/10", "2/10", "3/10", "6/10", "7/10", "9/10", "10/10");

    //gets the text view and image view rescource
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val qNumber: TextView = view.findViewById(R.id.q_number)
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val trueButton: Button = view.findViewById(R.id.button)
        val falseButton: Button = view.findViewById(R.id.button2)
        val answer: TextView = view.findViewById(R.id.answer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //sets the image and strings to their holders
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.qNumber.text = context.resources.getString(item.qNumber)
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.trueButton.setOnClickListener {
            if(holder.qNumber.text in true_answers) {
                score++
                holder.answer.text = "Correct!\nThis is true."
            }
            else{
                holder.answer.text = "Incorrect.\nThis is false."
            }
            holder.trueButton.visibility = View.GONE
            holder.falseButton.visibility = View.GONE
        }
        holder.falseButton.setOnClickListener {
            if(holder.qNumber.text !in true_answers) {
                score++
                holder.answer.text = "Correct!\nThis is false."
            }
            else{
                holder.answer.text = "Incorrect.\nThis is true."
            }
            holder.trueButton.visibility = View.GONE
            holder.falseButton.visibility = View.GONE
        }
    }


    override fun getItemCount() = dataset.size

}
