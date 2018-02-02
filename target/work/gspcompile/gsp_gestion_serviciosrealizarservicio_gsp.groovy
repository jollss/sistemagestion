import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestion_serviciosrealizarservicio_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/servicios/realizarservicio.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
for( serv in (servicios) ) {
printHtmlPart(5)
expressionOut.print(serv.observacionesMecanico)
printHtmlPart(6)
expressionOut.print(serv.estatus)
printHtmlPart(7)
expressionOut.print(serv.comentariosUsuario)
printHtmlPart(7)
expressionOut.print(serv.automovil.nombreAuto)
printHtmlPart(8)
expressionOut.print(serv.usuario.nombreUsuario)
printHtmlPart(9)
expressionOut.print(serv.estatus)
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',36,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1516907125000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
