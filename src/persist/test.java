package persist;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import antlr.collections.List;



public class test {

	public static void main(String[] args) {
		UnePersonne premier = new UnePersonne();
		premier.setNom("redouane");
		premier.setPrenom("azzouzi");
		premier.setAge(24);
		premier.setA(new adresse("rose", "paris"));
		
		
		Set<Note> notes = new HashSet<>();
		notes.add(new Note(1l, 1l, "math"));
		notes.add(new Note(2l, 11l, "français"));
		premier.setLesNotes(notes);
		
		
		createUnePersonne(premier);
		
		UnePersonne z = new UnePersonne();
		z.setNom("Marzztini1");
		z.setPrenom("lozzuis");
		z.setAge(30);
		z.setA(new adresse("hghg", "lille"));
		createUnePersonne(z);
		
		
		
		
		

	}
	
	private static void  createUnePersonne(UnePersonne personne){
		
		org.hibernate.Transaction tx = null;
		org.hibernate.Session session = HibernateUtil.currentSession();
		try {
			tx = session.beginTransaction();
			session.save(personne);
			tx.commit();
			
		} catch (HibernateException e) {
			tx.rollback();
		}
	}
	
	private static void  createNote(Note note){
		
		org.hibernate.Transaction tx = null;
		org.hibernate.Session session = HibernateUtil.currentSession();
		try {
			tx = session.beginTransaction();
			session.save(note);
			tx.commit();
			
		} catch (HibernateException e) {
			tx.rollback();
		}
	}
	
	private static java.util.List<UnePersonne> ListUnePersonne(){
		java.util.List<UnePersonne> personnes=null;
		org.hibernate.Transaction tx = null;
		org.hibernate.Session session = HibernateUtil.currentSession();
		
		try {
			
			tx = session.beginTransaction();
			personnes=session.createQuery("select z from UnePersonne as z").list();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if(tx!=null && tx.isActive()) tx.rollback(); 
			
		}
		return personnes;
		
	}
	
	

}
