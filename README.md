We have a very simple XML-RPC service setup. This service has a single method called getImage that returns the binary contents of a TIFF image.
 
Write code that will connect to this service and download the image to disk. You’ll know it worked if you can open the TIF file.
 
The following information can be used to call the XML-RPC service.
 
- URL:                 http://office3.docuvantage.com:8080/optixapi/demo1
- Method:            getImage(String fileName)                       
- Arguments:       1. String fileName. This is a string that should equal “image1”. If you ask for anything but “image1” an error will be returned.
- Returns:            An XML RPC Base64 that is the contents of the file. It is converted to a byte array on most platforms.
 
