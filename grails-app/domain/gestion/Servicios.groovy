package gestion

class Servicios {
String observacionesMecanico
String estatus

String diaServicio
String horaServicio
Marcas marca 
Automovil automovil

Tiposervicio tiposervicio
static mapping= {
      id generate  : 'sequence', column:'id_servicio', params:[sequence:'servicio']
    }
 
}
