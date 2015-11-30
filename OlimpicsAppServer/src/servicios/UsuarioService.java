package servicios;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import controladores.IUsuarioController;
import dominio.Usuario;

@Path("/UsuarioService")

// para mapearlo en la url
public class UsuarioService extends Application {

	@EJB
	private IUsuarioController iuc;

	// localhost:8080/JatrickAppServer/rest/DeportistaService/status/
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/status")	
	public Response getStatus() {
		
		return Response
				.ok("{\"status\":\"El servicio de los usuarios esta funcionando...\"}")
				.build();

	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/rol/{nick}")
	public Response darRol(@PathParam("nick") String nick)
	{
		 String rol = iuc.darRol(nick);
		 
		 
		
		 return Response.ok(rol).build();
		// return null;
		
	}
	
	// localhost:8080/JatrickAppServer/rest/UsuarioService/usuario
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/usuario")
	public Response guardarPersona(String datos) {
		System.out.println("payload - " + datos);
		boolean creado = false;
		// Create a new Gson object that could parse all passed in elements
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();

		// Obtengo el objeto book pareando los datos que me llegan (JSON string)
		Usuario usuario = gson.fromJson(datos, Usuario.class);

		String returnCode = "200";

		// Guardo el libro
		try {

			creado = this.iuc.guardarUsuario(usuario.getNick(),	usuario.getPassword()); 			

			returnCode = "{"
			+ "\"href\":\"http://localhost:8080/JatrickWebServer/rest/PersonaService/persona/"
			+ usuario.getNick() + "\","	+ "\"message\":\"New book successfully created.\"" + "}";
		} 
		catch (Exception err) {
			err.printStackTrace();
			returnCode = "{\"status\":\"500\","	+ "\"message\":\"Resource not created.\""
					+ "\"developerMessage\":\"" + err.getMessage() + "\"" + "}";
			return Response.status(500).entity(returnCode).build();
		}
		return Response.status(201).entity(creado).build();
	}
	
		
	// localhost:8080/JatrickAppServer/rest/UsuarioService/login/{username}
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/login")
		
		public Response login(String datos) {

			boolean existe = false;
			String respuesta;
			GsonBuilder gsonBuilder = new GsonBuilder();
			Gson gson = gsonBuilder.create();

			Usuario usuario = gson.fromJson(datos, Usuario.class);

			if (iuc.existeUsuario(usuario.getNick(), usuario.getPassword())) {

				existe = true;

				ArrayList<Boolean> lista = new ArrayList<Boolean>();
				lista.add(existe);
				respuesta = toJSONString(lista);
				return Response.ok().entity(respuesta).build();

			} 
			else {
				ArrayList<Boolean> lista = new ArrayList<Boolean>();
				lista.add(existe);
				respuesta = toJSONString(lista);
				return Response.status(404).entity(respuesta).build();
			}
		}
		
		
	/////////////////////////////////////delegacion//////////////////////////////////////////////////
		
	    @POST 
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/delegacion")
		public Response guardarDelegacion(String datos) {
			
			System.out.println("payload - " + datos);
			boolean creado = false;			
			GsonBuilder gsonBuilder = new GsonBuilder();
			Gson gson = gsonBuilder.create();			
			Usuario delegacion = gson.fromJson(datos, Usuario.class);
			String returnCode = "200";
			
			try {
				creado = this.iuc.guardarDelegacion(delegacion.getNick(), delegacion.getPassword()); 
				returnCode = "{" + "\"href\":\"http://localhost:8080/JatrickWebServer/rest/PersonaService/persona/"
				+ delegacion.getNick() + "\"," + "\"message\":\"New book successfully created.\"" + "}";
			} 
			catch (Exception err) {
				err.printStackTrace();
				returnCode = "{\"status\":\"500\","	+ "\"message\":\"Resource not created.\""
				+ "\"developerMessage\":\"" + err.getMessage() + "\"" + "}";
				return Response.status(500).entity(returnCode).build();
			}
			return Response.status(201).entity(creado).build();
		}
		
	
	/////////////////////////////////////fin de delegacion//////////////////////////////////////////////////
		
		
	/////////////////////////////////////organizador//////////////////////////////////////////////////	
		
		
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/organizador")
	public Response guardarOrganizador(String datos){
																																																																																																																																			
		System.out.println("payload - " + datos);
		boolean creado = false;					
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();				
		Usuario organizador = gson.fromJson(datos, Usuario.class);
		String returnCode = "200";
																																																																																																																																			
		try {
			creado = this.iuc.guardarOrganizador(organizador.getNick(), organizador.getPassword()); 
			returnCode = "{"+ "\"href\":\"http://localhost:8080/JatrickWebServer/rest/PersonaService/persona/"
			+ organizador.getNick() + "\"," + "\"message\":\"New book successfully created.\"" + "}";																																																																										
			} 
		catch (Exception err) {
			err.printStackTrace();
			returnCode = "{\"status\":\"500\","	+ "\"message\":\"Resource not created.\""
			+ "\"developerMessage\":\"" + err.getMessage() + "\"" + "}";
			return Response.status(500).entity(returnCode).build();
		}
		return Response.status(201).entity(creado).build();
	}
																																																																																																																																
		
	/////////////////////////////////////fin de organizador//////////////////////////////////////////////////	
		
			
	public String toJSONString(Object object) { // Funcion que convierte de objeto java a JSON
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();
		return gson.toJson(object);
	}

	
	
}