import com.yourapp.Role
import com.yourapp.Usuario
import com.yourapp.UsuarioRole
class BootStrap {

    def init = { servletContext ->
 /*  def user = new Usuario(username: 'joel', password: 'joel').save(flush:true)
   def admin = new Usuario(username: 'luis', password: 'luis').save(flush:true)
   def userRole = new Role(authority: "ROLE_MECANICO").save(flush:true)
   def adminRole = new Role(authority: "ROLE_USUARIO").save(flush:true)
   new UsuarioRole(user:user, role:userRole).save(flush:true)
   new UsuarioRole(user:admin, role:adminRole).save(flush:true)  */ 
    }
    def destroy = {
    }
}
