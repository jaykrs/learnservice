# learnservice
Sakai connector as rest service in spring boot

Sakai is one of popular Learning management system , we can expose sakai service as soap but some time we are looking to work with rest service 
either web client or mobile application.

This is a spring boot project to communicate with sakai , we can get login , site and tools.

Import project into eclipse.

setadmin user name and password then login url and script url and we can get response in java bean.

setAdminUsername("jaykrs@gmail.com"); 
setAdminPassword("xxxxx");  
setLoginUrl("https://xxxxxx.xxx/sakai-ws/soap/login?wsdl"); 
setScriptUrl("https://xxxxxx.xxx/sakai-ws/soap/sakai?wsdl");  
List<Site> slist = swl.getAllSitesForUser("jaykrs@gmail.com");  

mvn clean install

java -jar targetjar-file
