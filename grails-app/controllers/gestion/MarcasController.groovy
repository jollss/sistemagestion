
package gestion

class MarcasController {
   
    def index (long id) {
        //params.max=5
        //[marcas:Marcas.list(params),Marcas:Marcas.count()]
     def listadomarca = Marcas.list()
      
      return ["marcas":listadomarca]
   }
   
 def guardarmarca(){}
 
    def save() {
        def marca = new Marcas(params)
      
        marca.save()
        redirect (action:"index",id:marca.id)
    }
  
  def eliminar(long id)
  {
    
      def marca=Marcas.get(params.id as long )
    
      marca.delete(flush:true)
       //println Marcas
       redirect (action:"index")
  }
    def modificarmarca(long id)
  {
     println id 
 
      def marca=Marcas.get(id)
     [marca:marca]
  }
  def guardar(long id)
  {
      
    //println id
  println params.nombre
    println params.id
     println params
            def marca=Marcas.get(id)
       //println params.id
      marca.nombreMarca = params.nombre
       // println params.nombre
         marca.save(flush:true) 
       // println params.nombremarca
        redirect (action:"index")
    }
  
}



