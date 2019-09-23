package tn.esprit.neo.rest.interfaces.recrutement;

import java.util.List;

import javax.ws.rs.core.Response;


import tn.esprit.entities.Experience;
/*
 *  Path:/experiences
 */
public interface IExperienceEndpoints {

	/*  GET : Response 
	 * 	path: /{id}	
	 *  Produces Json
	 */
	public Response findById( int id);//@PathParam("id")
	/* GET : Response 
	 * path: /{name}
	 * Produces	Json
	 */ 
	public Response findByName(String name);
	/*  GET : Response 
	 *  Produces Json
	 */
    public List<Experience> listAll() ;
}
