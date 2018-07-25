package th.ac.up.se.firebase

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.card_item.view.*

class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){


    var title = itemView.cardTitle
    var message = itemView.cardMessage
    var layout =itemView.cardLayout
}
