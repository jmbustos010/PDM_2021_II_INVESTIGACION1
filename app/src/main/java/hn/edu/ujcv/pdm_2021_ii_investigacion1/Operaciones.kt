package hn.edu.ujcv.pdm_2021_ii_investigacion1

class Operaciones {

    fun CalcularSubTotal(cantidad:String, valor: String ) : String{
        var result : Int = Integer.valueOf(cantidad) * Integer.valueOf(valor)
        return result.toString()
    }

    fun CalcularTotal(subTotal: String, isv: String): String{
        var imp = Integer.valueOf(isv)
        var calcIsv: Double = imp.toDouble()/ 100
        var calcSub : Double = Integer.valueOf(subTotal) * calcIsv
        var result : Double = Integer.valueOf(subTotal) + calcSub
        return result.toString()
    }
}