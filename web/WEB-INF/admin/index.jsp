<%-- 
    Document   : index
    Created on : 12-Febrero-2018, 10:24:59
    Author     : Christian Camilo Gámez
--%>

<%@page import="cad.Categoriacad"%>
<%@page import="jabaBeans.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Gestion de producto |  Crea e-Commerce JAVA EE con pagos Online Paypal y Payu</title>
    <%@include  file="../../WEB-INF/css.jsp" %> 
</head><!--/head-->

<body>
	
    <%@include file="../../WEB-INF/header.jsp" %>
    
        
    
	
        <section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
                                    
				</div>
				
				<div class="col-sm-10 clearfix">
				
                                    <h3>Gestionar producto</h3>
                                    <form action="controlProducto" method="post">
                                    <div class="form-one">
                                        Nombre:<br/>
                                        <input type="text" name="nombre" placeholder="Nombre producto" value="" required />
                                        <br/><hr>
                                        Precio:(USD)<br/>
                                        <input type="number" name="preciousd" placeholder="Precio" value="0" min="0" /><br/><br/>
                                        Precio Promo:(USD)<br/>
                                        <input type="number" name="precionuevousd" placeholder="Precio" value="0" min="0" /><br/><hr>
                                        Stock:<br/>
                                        <input type="number" name="cantidad" placeholder="Cantidad" value="1" min="1" /><br/><hr>
                                        
                                        Categoria:<br/>
                                        <select name="categoria">
                                            <option>Selecionar categoria</option>
                                           
                                        </select><br/><hr>
                                        Descripcion:<br/>
                                        <textarea name="descripcion" rows="4" cols="20" placeholder="Descripcion" required>
                                        </textarea><br/>
                                        Nuevo?:<input type="checkbox" name="nuevo" value="ON" checked="checked" />
                                        Recomendado?:<input type="checkbox" name="recomendado" value="ON"  />
                                        Visible?:<input type="checkbox" name="visible" value="ON" checked="checked" /><br><hr>
                                        Selecionar imagen:
                                        <input  type="file" name="imagen" value="Selecionar una imagen" required/><hr>
                                        <input class="btn btn-default" type="submit" value="Registrar" />
                                        <input class="btn btn-warning" type="submit" value="Consultar" />
                                        <input class="btn btn-danger" type="submit" value="Actualizar" />
                                        <input class="btn btn-success" type="submit" value="Borrar" />
                                    </div>	
				</form>	
					
				</div>
			</div>
		</div>
	</section>
	
                                    <%@include file="../../WEB-INF/fooster.jsp" %>
	
                                    <%@include file="../../WEB-INF/js.jsp" %>
  
    
</body>
</html>
