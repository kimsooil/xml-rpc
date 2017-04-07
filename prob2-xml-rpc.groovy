@Grab('org.codehaus.groovy:groovy-xmlrpc:0.8')
import groovy.net.xmlrpc.*

def imgUrl = 'http://office3.docuvXXXX.com:8080/optixapi/demo1' 

def imgXmlRpc = new XMLRPCServerProxy(imgUrl)

def outputReturned = 
    imgXmlRpc
        ."getImage"('image1')

//println outputReturned

new File('foo.tiff').withOutputStream { 
        it.write outputReturned

}
