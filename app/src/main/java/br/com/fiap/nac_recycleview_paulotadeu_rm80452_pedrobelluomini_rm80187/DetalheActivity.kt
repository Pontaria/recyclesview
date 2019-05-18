package br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187.Model.Carro
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.carro_item.*

class DetalheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val pedrinho = intent.extras.getParcelable<Carro>("CARRO")

        tvMarca.text = pedrinho.Marca
        tvModelo.text = pedrinho.Modelo
        Picasso.get().load(pedrinho.Imagem).into(ivImagem)
    }
}
