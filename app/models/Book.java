package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Book extends Model{

	private static final long serialVersionUID = 742314344141143085L;

	@Id
	public Integer id;
	
	public String name;
	
	public List<Page> pages;
}
