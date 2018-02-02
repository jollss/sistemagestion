package gestion

class TiposervicioController {

    def index() 
    { 
     def tiposervicios = Tiposervicio.findAll()
        println tiposervicios.nombreServicio
    }
}
