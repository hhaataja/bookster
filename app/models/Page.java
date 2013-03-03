package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Page extends Model{

	private static final long serialVersionUID = 4668945427223864739L;

	@Id
	public Integer id;
	
	public String title;
	
	public String text;
	
}
