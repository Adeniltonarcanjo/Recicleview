package adeniltonmorais.android.recicleview.adapter

import adeniltonmorais.android.recicleview.R
import adeniltonmorais.android.recicleview.model.Jogo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*

class JogosAdapter(var listaJogos: ArrayList<Jogo>) :
    RecyclerView.Adapter<JogosAdapter.JogoViewHolder>() {

   // segundo método
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val intemView= LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_jogos,parent,false)
        return JogoViewHolder(intemView)


    }
// primeiro metodoto a ser chamado
    override fun getItemCount(): Int {
        return listaJogos.size

           }

 // terceiro metodo
    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
         val jogo=listaJogos[position]
        holder.bind(jogo)

    }


    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(jogo: Jogo) {
            itemView.txtNomeDoJogo.text = jogo.nomeJogo
            itemView.txtConsole.text = jogo.console
            itemView.notaJogo.rating = jogo.notaJogo

        }
    }

}