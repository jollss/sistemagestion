package gestion

class RolController {

    def index() {
    
  
    
     def roles = Rol.findAll()
        println roles.nombreRol
    
    }
}
