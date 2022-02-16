package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.team12_hw1.R
import model.Animal

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Animal>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //gets the text view and image view rescource
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val qNumber: TextView = view.findViewById(R.id.q_number)
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
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
    }

    override fun getItemCount() = dataset.size
}