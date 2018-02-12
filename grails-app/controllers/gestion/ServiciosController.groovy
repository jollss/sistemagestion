package gestion

class ServiciosController {
def index(){ 
         [servicios:Servicios.findAll("from Servicios where estatus='pendiente'")]
   }
   def hacerservicio(long id){  
       def servicios=Servicios.get(id )
        [servicios:servicios]

   }
   
    def save(long id)
    {
   
     def servicios=Servicios.get(id)
       servicios.observacionesMecanico = params.observaciones
       servicios.estatus = params.estatus
            servicios.save(flush:true) 
        redirect (action:"index")
    }
  
  def crearcita(){
     
      [marcas:Marcas.findAll(),automoviles:Automovil.findAll(),tiposervicios:Tiposervicio.findAll()
         ] 
         

   }
   def guardar(){
          def p =  new Servicios()
         p.estatus = params.estatus
      

         p.diaServicio = params.diaServicio
         p.horaServicio =  params.horaServicio
         p.marca = Marcas.get(params.selectmarcas as long)
         p.automovil = Automovil.get(params.selectaut as long)
         p.tiposervicio = Tiposervicio.get(params.selecttipo as long)
         p.observacionesMecanico = params.observacionesMecanico
    
         if(p.save(flush:true)){
             println "8====================DDDDDDDD"
         }else{
             println "No se guardo nada vale chetos la vida "
         }
   }
   def citaterminada()
   {
       
        [servicios:Servicios.findAll("from Servicios where estatus='terminado'")]
   }
   def delete(long id)
   {
       def servicios=Servicios.get(params.id as long )
    
      servicios.delete(flush:true)
    
       redirect (action:"citaterminada")
   }
}

