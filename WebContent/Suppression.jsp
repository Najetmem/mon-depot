<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:form>

<h:panelGrid columns="3">
<h:outputText value="idClt" />
<h:inputText id="idC" value="#{fournisseurManagedBean.fournisseur.idfrs}" required="true" requiredMessage="Id fournisseur est un champ obligatoire" />
<h:message for="idC" style="color:red"/>
<h:outputText value="nom" />
<h:inputText id="nomClt" value="#{fournisseurManagedBean.fournisseur.nomfrs}" required="true" requiredMessage="le nom est un champ obligatoire"/>
<h:message for="nomClt" style="color:red"/>
<h:outputText value="prenomClt" />
<h:inputText id="prenomClt" value="#{fournisseurManagedBean.fournisseur.mailContact}" required="true" requiredMessage="le mail est un champ obligatoire"/>
<h:message for="prenomClt" style="color:red"/>
<h:outputText value="adresseClt" />
<h:inputText id="adresseClt" value="#{fournisseurManagedBean.fournisseur.adressefrs}" required="true" requiredMessage="l adresse est un champ obligatoire"/>
<h:message for="adresseClt" style="color:red"/>
<h:commandButton  value="supprimer" actionListener="#{fournisseurManagedBean.supprimer}"/>
</h:panelGrid>
</h:form>
</f:view>
</body>
</html>