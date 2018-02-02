package gestion

class AutomovilController {

    def index() { 
        [automoviles:Automovil.findAll()]

       
    }
    def guardarauto()
    {
       // println params.nombreauto
        def auto = new Automovil(params)
      
       auto.save(flush:true)
       //redirect (action:"index")
        
    }
     def eliminar(long id)
  {
    
      def auto=Automovil.get(params.id as long )
    
      auto.delete(flush:true)
       //println Marcas
       redirect (action:"index")
  }
  def modificarauto(long id )
  {
       println id 
 
      def auto=Automovil.get(id)
     [auto:auto]
  }
   def guardar(long id)
  {
      
    //println id
 // println params.nombre
 //   println params.id
  //   println params
            def auto=Automovil.get(id)
       //println params.id
      auto.nombreAuto = params.nombre
       // println params.nombre
         auto.save(flush:true) 
       // println params.nombremarca
        redirect (action:"index")
    }
}
    