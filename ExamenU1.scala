//1 Verifique solo numero par
// a. escriba una funcion que tome un entero y devuelva un boleano que indique si es par o no.
def espar(num:Int): Boolean = {
return num%2 == 0
}
println(espar(4))
println(espar(7))

//2. Buscar numeros pares en lista.
//a. Escriba una funcion que devuelva True si hay un numero par dentro de una Lista: de lo contrario devuelva False.
def numeroPar(list:List[Int]): String ={
    for(n <- list){
        if(n%2==0){
            println(s"True")
        }else{
            println(s"False")
        }
    }
    return "echo"
}
//valores para mi lista
val l1 = List(1,2,3,4,5,6,7,8)
val l2 = List(4,3,22,55,7,8)
//comprobando valores
numeroPar(l1)
numeroPar(l2)

//3. Afortunado numero 7.
//a. Tome una lista de enteros y calcule su suma. Sin embargo, los sietes tienen suerte y deben contarse dos veces, lo que significa que su valor es 14 para la suma.
def afortunado(list:List[Int]): Int={
    var res=0
    for(n <- list){
        if(n==7){
            res = res + 14
        }else{
            res = res + n
        }
    }
    return res
}

val saf= List(1,6,7)
println(afortunado(saf))

//4. Puede equilibrar?.
//a. Dada una lista no vacia de enteros, devuelva verdadero si hay un lugar para dividir la lista de modo que la suma de los numeros en un lado sea igual a la suma de los numeros en el otro lado.
def balance(list:List[Int]): Boolean={
    var primera = 0
    var segunda = 0

    segunda = list.sum

    for(i <- Range(0,list.length)){
        primera = primera + list(i)
        segunda = segunda - list(i)

        if(primera == segunda){
            return true
        }
    }
    return false 
}

val bl = List(3,2,1)
val bl2 = List(2,3,3,2)
val bl3 = List(10,30,90)

balance(bl)
balance(bl2)
balance(bl3)
//5. Verificar palindromo:
//a. Dada una cadena, devuelva un boleano que indica si es o no un palindromo.
def palindromo(palabra:String):Boolean ={
    return (palabra == palabra.reverse)
}

val palabra = "OXXO"
val palabra2 = "ANNA"
val palabra3 = "PEDRO"

println(palindromo(palabra))
println(palindromo(palabra2))
println(palindromo(palabra3))

.


