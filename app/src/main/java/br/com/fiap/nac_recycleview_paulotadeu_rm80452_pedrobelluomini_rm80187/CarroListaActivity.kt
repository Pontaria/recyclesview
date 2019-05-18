package br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.GridLayout
import br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187.DAO.CarroDAO
import kotlinx.android.synthetic.main.activity_carro_lista.*

class CarroListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carro_lista)

        val carroDAO = CarroDAO()
        val carros = carroDAO.carrinho()

        rvCarro.adapter = CarroAdapter(carros,this,{
            val intent = Intent(this,DetalheActivity::class.java)
            intent.putExtra("CARRO",it)
            startActivity(intent)

        })

        rvCarro.layoutManager = GridLayoutManager(this,1)
    }
}
