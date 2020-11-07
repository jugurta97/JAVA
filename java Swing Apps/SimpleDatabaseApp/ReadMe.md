#hello all coders a cross the world

i'm introduce my self my name is Jugurta i'am from ALgeria , i have here a Java project
associated with a database from SQL SERVER 2008 (compatible with higher version) and i'm 
using eclipse workspace . 

if you have any issue to lauche the programe correctly, please revirify the path url in the project agaisnt your in your pc 
verify : DatabaseConnection.java and conf.properties  
if it not helping try to contact me on my Facebook : https://www.facebook.com/RSperformance.mika/

#to lauche the programe : 

make sure you have installed JDK and JRe in ur computer ! ! (try to find the folders were it's installed , normal case it's in C:\Program Files\Java\
beacause you will need that after

1.first thing you must have (or download) the JDBC driver approriate to the DBMS that you have
for example : my i downloaded it in  

#https://docs.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver15 

then extract it wherever you want open that and go to 
\auth\x64 or(x86 flw your pc spec) and then copy the authorization mssql-jdbc_auth-8.2.2.x64.dll and past it  
into the bin of  jre installation path C:\Program Files\Java\jre1.8.0_221\bin

2.When you create your project in Eclipse
	add the jar file that you already downloaded in the archive mssql-jdbc-8.2.2.jre8.jar in your projectfolder
		then rightclick on mssql-jdbc-8.2.2.jre8.jar then choose BuildPAth -> Add Build to path 


3.in the file conf.properties you will find : 

db.driver.class=com.microsoft.sqlserver.jdbc.SQLServerDriver
db.conn.url=jdbc:sqlserver://name of the your pc\\SQLExpress;databaseName=GeekyStore;
db.username=sa     // ad default is like that 
db.password=123456789  // your personal password


4.lauch the class :  AdminLogin.java    (one of the password are : skywalker luke  ; you can find it in the GeekyStoreScript.sql) 
you can also skip the password by launching directly StoreMenu.java :) 

#Put a little star if you enjoy it ! and give feedback more content will be available soon,use the program as you want to  https://github.com/jugurta97/jugurta97.github.io