# Java_Servlet

Pour utiliser javax, j'ai telecharge tomcat 9.0.58. 
Directories:
  web.xml se trouve dans "D:\App_Dist\apache-tomcat-9.0.58-windows-x64\apache-tomcat-9.0.58\webapps\examples\WEB-INF"
  PremierServlet.html se trouve dans "D:\App_Dist\apache-tomcat-9.0.58-windows-x64\apache-tomcat-9.0.58\webapps\examples"
 
1- Il faut tou d'abord apres avoir telecharger apache tomcat 9.0.58, ajuster les environment variables. 
 
2- Creer et compiler le fichier SalutationsServlet.java dans "D:\App_Dist\apache-tomcat-9.0.58-windows-x64\apache-tomcat-9.0.58\webapps\examples\WEB-INF\classes"
 
3- Ajuster le fichier web.xml en ajoutant: 

![Servlet-web](https://user-images.githubusercontent.com/80248505/153864913-084a5394-2349-4797-b5ae-96fdee8e0e3d.png)

4- Creation du fichier PremierServlet.html qui contient une reference a /SalutationsServlet

5- Demarrer Startup.bat (""D:\App_Dist\apache-tomcat-9.0.58-windows-x64\apache-tomcat-9.0.58\bin")

6- Ouvrir PremierServlet.html et tester


![Servlet_Hello](https://user-images.githubusercontent.com/80248505/153865275-5b102bb6-daf9-4cb6-b5de-c1b0bf3b91f6.png)
