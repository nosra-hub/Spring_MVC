package tn.enig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tn.eng.model.Affectation;
import tn.eng.model.Enseignant;
import tn.eng.model.Matiere;
@Repository
public class GestionImp  implements  Igestion{
	@Autowired
	@Qualifier("dataSource")
DataSource base;
	
	@Override
	public List<Matiere> getallMatiere() {
		List<Matiere> lm = new ArrayList<Matiere>() ;
		try {
			Connection conn =  base.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from Matiere ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Matiere m = new Matiere();
				m.setId(rs.getInt("id"));
				m.setTitre(rs.getString("titre"));
				m.setNiv(rs.getInt("niv"));
				m.setNbreH(rs.getInt("nbreH"));
				
				
				lm.add(m);
			}
			
		}
		catch(Exception ex) {ex.printStackTrace();}
		return lm;
	}


	@Override
	public List<Enseignant> getallEnseignant() {
		List<Enseignant> lens = new ArrayList<Enseignant>() ;
		try {
			Connection conn =  base.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from Enseignant ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Enseignant ens=new Enseignant();
				ens.setId(rs.getInt("id"));	
				ens.setChargeH(rs.getInt("ChargeH"));
				ens.setNom(rs.getString("nom"));
   				ens.setPrenom(rs.getString("prenom"));
	   		lens.add(ens);
			}
			
		}
		catch(Exception ex) {ex.printStackTrace();}
		return lens;
	}

	@Override
	public List<Affectation> getallAffectation() {
		List<Affectation> aff= new ArrayList<Affectation>() ;
		try {
			Connection conn =  base.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from Affectation ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Affectation af=new Affectation();
				af.setId(rs.getInt("id"));	
				
	   		aff.add(af);
			}
			
		}
		catch(Exception ex) {ex.printStackTrace();}
		return aff;
	}


	@Override
	public void deleteAff(int id) {
		  String sql="delete from Affectation where id="+id+""; 
		  try {
				Connection conn =  base.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.executeUpdate();}
		  catch(Exception ex) {ex.printStackTrace();}
	}
	

}
