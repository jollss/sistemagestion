package gestion

class ServiciosController {
def index(){  // [servicios:Servicios.findAll()]
         [servicios:Servicios.findAll("from Servicios where estatus='pendiente'")]
   }
   def hacerservicio(long id){  
       def servicios=Servicios.get(id )
        [servicios:servicios]
         //redirect (action:"hacerservicio",id:servicios.id)
   }
   
    def save(long id)
    {
      //println params.id
      //println params.observaciones
       //println params.estatus
     def servicios=Servicios.get(id)
       servicios.observacionesMecanico = params.observaciones
       servicios.estatus = params.estatus
            servicios.save(flush:true) 
        redirect (action:"index")
    }
  
  def crearcita(){
     
      [marcas:Marcas.findAll(),automoviles:Automovil.findAll(),tiposervicios:Tiposervicio.findAll()
          ,usuarios:Usuario.findAll(),usuariosrol:UsuarioRol.findAll("from UsuarioRol where rol_id=2")]

   }
   def guardar(){
 //println params.estatus
  //println params.comentariosUsuario
 // println params.diaServicio
  //  println params.horaServicio
    //  println params.selectmarcas
    //   println params.selectaut
      //    println params.selecttipo
       //   println params.observacionesMecanico
    //  println params.selectusu
          def p =  new Servicios()
         p.estatus = params.estatus
         p.comentariosUsuario = params.comentariosUsuario
         p.diaServicio = params.diaServicio
         p.horaServicio =  params.horaServicio
         p.marca = Marcas.get(params.selectmarcas as long)
         p.automovil = Automovil.get(params.selectaut as long)
         p.tiposervicio = Tiposervicio.get(params.selecttipo as long)
         p.observacionesMecanico = params.observacionesMecanico
         p.usuario = Usuario.get(params.selectusu as long) 
         if(p.save(flush:true)){
             println "8=======================DDDDDDDD"
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
      // println params.id
       redirect (action:"citaterminada")
   }
}

