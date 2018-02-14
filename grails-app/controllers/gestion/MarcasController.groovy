
package gestion
import grails.plugin.springsecurity.annotation.Secured


@Secured(['ROLE_MECANICO'])
class MarcasController {

   
    def index (long id) {
      
     def listadomarca = Marcas.list()
      
      return ["marcas":listadomarca]
   }
   
 def guardarmarca(){}
 
    def save() {
        def marca = new Marcas(params)
      
        marca.save()
        redirect (action:"index")
    }
  
  def eliminar(long id)
  {
    
      def marca=Marcas.get(params.id as long )
    
      marca.delete(flush:true)
       
       redirect (action:"index")
  }
    def modificarmarca(long id)
  {
  
def marca=Marcas.get(id)
     [marca:marca]
     
  }
  def guardar(long id)
  {
       def marca=Marcas.get(id)
    
      marca.nombreMarca = params.nombre
     
         marca.save(flush:true) 
   
        redirect (action:"index")
    }
 
  
}



