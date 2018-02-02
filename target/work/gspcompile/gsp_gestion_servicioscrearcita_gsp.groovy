import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestion_servicioscrearcita_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/servicios/crearcita.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('hiddenField','g',12,['name':("estatus"),'value':("pendiente")],-1)
printHtmlPart(6)
invokeTag('textField','g',14,['name':("comentariosUsuario")],-1)
printHtmlPart(7)
invokeTag('textField','g',17,['name':("diaServicio")],-1)
printHtmlPart(8)
invokeTag('textField','g',20,['name':("horaServicio")],-1)
printHtmlPart(9)
for( marca in (marcas) ) {
printHtmlPart(10)
expressionOut.print(marca.id)
printHtmlPart(11)
expressionOut.print(marca.nombreMarca)
printHtmlPart(12)
}
printHtmlPart(13)
for( aut in (automoviles) ) {
printHtmlPart(10)
expressionOut.print(aut.id)
printHtmlPart(11)
expressionOut.print(aut.nombreAuto)
printHtmlPart(12)
}
printHtmlPart(14)
for( tipo in (tiposervicios) ) {
printHtmlPart(10)
expressionOut.print(tipo.id)
printHtmlPart(11)
expressionOut.print(tipo.nombreServicio)
printHtmlPart(12)
}
printHtmlPart(15)
invokeTag('actionSubmit','g',47,['value':("Save")],-1)
printHtmlPart(1)
})
invokeTag('form','g',48,['controller':("Servicios"),'action':("guardarcita")],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1516911581000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
