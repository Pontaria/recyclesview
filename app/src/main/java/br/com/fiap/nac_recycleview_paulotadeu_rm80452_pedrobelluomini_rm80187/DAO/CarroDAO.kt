package br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187.DAO

import br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187.Model.Carro

class CarroDAO{

    fun carrinho(): List<Carro>{
        return listOf(
                hondacivic(),
                opala(),
                camaro()
        )
    }
    private fun hondacivic(): Carro{
        return Carro(
                "Honda",
                "Civic",
                "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201811/20181113/honda-civic-1.8-exs-16v-flex-4p-automatico-wmimagem19450709075.jpg?s=fill&w=1920&h=1440&q=75")
    }

    private fun opala(): Carro{
        return Carro(
                "GM",
                "Opala",
                "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2019/201901/20190130/chevrolet-opala-4.1-diplomata-se-12v-alcool-4p-automatico-wmimagem1805595559.jpg?s=fill&w=1920&h=1440&q=75")
    }

    private fun camaro(): Carro{
        return Carro(
                "Chevrolet",
                "Camaro",
                "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2019/201905/20190510/chevrolet-camaro-6.2-v8-gasolina-ss-automatico-wmimagem18414393929.jpg?s=fill&w=1920&h=1440&q=75")
    }
}

