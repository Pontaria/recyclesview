package br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187
import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187.Model.Carro
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.carro_item.view.*

class CarroAdapter(private val carro: List<Carro>,
                  private val context: Context,
                  val listener: (Carro) -> Unit) : Adapter<CarroAdapter.ViewHolder>() {

    //Método que recebe o ViewHolder e a posição da lista.
    //Aqui é recuperado o objeto da lista de Objetos pela posição e associado à ViewHolder.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jogo= carro[position]
        holder?.let {
            it.bindView(jogo, listener)
        }
    }

    //Método que deverá retornar layout criado pelo ViewHolder já inflado em uma view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    //Método que deverá retornar quantos itens há na lista.
    override fun getItemCount(): Int {
        return carro.size
    }

    /*
    Com o ViewHolder iremos relacionar o layout criado e adicionar os valores a ele*/
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(carro: Carro,
                     listener: (Carro) -> Unit) = with(itemView) {

            Picasso.get().load(carro.Imagem).into(ivImagem)
            tvMarca.text = carro.Marca
            tvModelo.text = carro.Modelo

            setOnClickListener { listener(carro) }
        }
    }

    /*
    * Vale ressaltar que os métodos onCreateViewHolder e onBindViewHolder não são chamados
    * para todos os itens inicialmente, eles são chamados apenas para os itens visíveis para o usuário.
    * Quando o usuário sobe e desce a lista, estes dois métodos são chamados novamente associando a view
    * reciclada ao conteúdo daquela posição que agora será visível.
    * */
}


