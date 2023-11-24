package br.com.vec.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.vec.bo.UsuarioBo;
import br.com.vec.entity.Usuario;

@Path("/usuario")
public class UsuarioResource {
	
	private UsuarioBo usuarioBo;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Usuario usuario, @Context UriInfo uriInfo) throws SQLException {
	    usuarioBo = new UsuarioBo();
	    usuarioBo.cadastrar(usuario);
	    UriBuilder builder = uriInfo.getAbsolutePathBuilder();
	    builder.path(Integer.toString(usuario.getId()));
	    return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response alterar(Usuario usuario, @PathParam("id") int codigo) throws SQLException {
		usuarioBo = new UsuarioBo();
		usuarioBo.alterar(usuario);
		return Response.ok().build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario buscarPorId(@PathParam("id") int id) {
		usuarioBo = new UsuarioBo();
		return usuarioBo.buscarUsuariosPorId(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listar(){
		usuarioBo = new UsuarioBo();
		return usuarioBo.buscarUsuarios();
	}
	
	

}
