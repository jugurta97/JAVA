/* Reconstruction de la base de données */

CREATE DATABASE GeekyStore;
GO
USE GeekyStore; 
GO

/*Construction de la table des utilisateurs */
CREATE TABLE Admins (
	IdUser				INT		PRIMARY KEY  IDENTITY (1, 1),
	Login				VARCHAR(20)	NOT NULL,
	Password			VARCHAR(20)	NOT NULL,
	ConnectionNumber	INT		NOT NULL DEFAULT 0 );
GO	

INSERT INTO Admins (Login, Password) VALUES ( 'Anderson',	'Neo' );
INSERT INTO Admins ( Login, Password) VALUES ('Skywalker',	'Luke' );
INSERT INTO Admins ( Login, Password) VALUES ( 'Plissken',	'Snake' );
INSERT INTO Admins ( Login, Password) VALUES ( 'Ripley',  'Ellen' );
INSERT INTO Admins (Login, Password) VALUES ( 'Bond',		'James' );	

GO

--SELECT * FROM Admins;
--SELECT * FROM Admins WHERE Login='anderson' AND Password='neo';

CREATE TABLE Products (
Id_Produit				INT		PRIMARY KEY	IDENTITY(1,1),
Desc_Produit			VARCHAR(50)  NOT NULL ,
Prix_Achat_Produit		FLOAT		 NOT NULL ,
Prix_Vente_Produit		FLOAT		 NOT NULL , 
Stocke_Produit			INT			 NOT NULL DEFAULT 0 );

GO

INSERT INTO Products (desc_produit , prix_achat_produit , prix_vente_produit ) 
VALUES ('Gigabyte RX 590 8gb' , 40000 ,44000),('MSI GTX 1650 4gb', 36000 , 38000 ),('Ryzen 5 3400 g' , 21000 , 25000 ) ;
GO

--INSERT INTO Products VALUES ('' , 400,411,2);
--DELETE FROM Products WHERE Desc_Produit = '' ;

--SELECT * FROM Products;

--SELECT * FROM Products WHERE Desc_Produit LIKE '%gtx%';

--DELETE FROM Products WHERE Desc_Produit = 'asus rtx 2070 ti' ;


CREATE TABLE Clients (
Id_Client				INT		PRIMARY KEY		IDENTITY(1,1),
lastName_Client			VARCHAR(50) NOT NULL , 
FirstName_Client				VARCHAR(50)	NOT NULL , 
Adress_Client			VARCHAR(200) NULL , 
City_Client			VARCHAR(40)	NULL , 
State_Client			VARCHAR(40) NULL , 
ZipCode_Client		CHAR(5)	NULL , 
Country_Client				VARCHAR(40) NULL , 
PhoneNumber_Client			VARCHAR(35) NULL , 
Email_Client			VARCHAR(120) NULL	);

GO

INSERT INTO Clients VALUES ('Harry' , 'Poter' , '14 street black and white' ,'SinCity' , 'London', '35120','Engleterre' , '062364884' ,'harry@gmail.uk');
GO

--SELECT * FROM Clients;

--ALTER TABLE Clients DROP COLUMN Num_Fax_Client ;

--DROP TABLE Clients ;

--DELETE FROM Clients WHERE lastName_Client='david' AND FirstName_Client='coperfield';