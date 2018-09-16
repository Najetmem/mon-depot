<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="CSS/form.css" />
</head>
<body>
<f:view>
<h:form>

<h:panelGrid columns="3">
<h:outputText value="idFrs" />
<h:inputText id="idC" value="#{fournisseurManagedBean.fournisseur.idfrs}" required="true" requiredMessage="Id fournisseur est un champ obligatoire" />
<h:message for="idC" style="color:red"/>
<h:outputText value="nom" />
<h:inputText id="nomFrs" value="#{fournisseurManagedBean.fournisseur.nomfrs}" required="true" requiredMessage="le nom est un champ obligatoire"/>
<h:message for="nomFrs" style="color:red"/>
<h:outputText value="prenomFrs" />
<h:inputText id="prenomFrs" value="#{fournisseurManagedBean.fournisseur.mailContact}" required="true" requiredMessage="le mail est un champ obligatoire"/>
<h:message for="prenomFrs" style="color:red"/>
<h:outputText value="adresseFrs" />
<h:inputText id="adresseFrs" value="#{fournisseurManagedBean.fournisseur.adressefrs}" required="true" requiredMessage="l adresse est un champ obligatoire"/>
<h:message for="adresseFrs" style="color:red"/>
<h:commandButton  value="ajouter" actionListener="#{fournisseurManagedBean.ajouter}"/>
</h:panelGrid>
</h:form>
</f:view>
</body>
</html>