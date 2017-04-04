package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import datos.GestorBDSQLite;
import datos.Plantacion;

public class GestorPlantacionesBBDD implements IGestorPlantaciones {
	GestorBDSQLite gbd = new GestorBDSQLite();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	

	@Override
	public void plantar(Plantacion plant) {
		String sql = "INSERT INTO PLANTACIONES VALUES(" + plant.getParcela() + ",'" + sdf.format(plant.getFechaPlan())
				+ "','" + sdf.format(plant.getFechaRec()) + "','" + plant.getEspecie() + "'," + plant.getCantPlant()
				+ ",0);";
		gbd.updateSQL(sql);

	}

	@Override
	public void recolectar(int parcela, Date fechaRec, int cantRec) {
		// TODO Auto-generated method stub
		String sql = "UPDATE PLANTACIONES SET CANT_REC= " + cantRec +
				" WHERE PARCELA =" + parcela+
				" AND FECHA_REC ='" + sdf.format(fechaRec) + "';";
		gbd.updateSQL(sql);
	}

	@Override
	public Plantacion getPlantacion(int parcela, Date fechaPlan) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void eliminar(int parcela, Date fechaPlan){
		String sql = "DELETE FROM PLANTACIONES WHERE PARCELA =" +parcela+
				" AND FECHA_PLAN ='" + sdf.format(fechaPlan) + "';";
		gbd.updateSQL(sql);
	}
	public void updatePlant(Plantacion p){
		Date fechaPlan= p.getFechaPlan();
		int parcela= p.getParcela();
		String sql = "UPDATE PLANTACIONES SET PARCELA=" + p.getParcela() +
					",FECHA_PLAN='" + sdf.format(p.getFechaPlan())
					+ "',FECHA_REC='" + sdf.format(p.getFechaRec()) +
					"',ESPECIE='" + p.getEspecie() +
					"',CANT_PLANT=" + p.getCantPlant()+
					" WHERE PARCELA =" + parcela+
					" AND FECHA_PLAN ='" + sdf.format(fechaPlan)
					+ ";";
		gbd.updateSQL(sql);
	}

	@Override
	public ArrayList<Plantacion> getPlantaciones() {
		ArrayList<Plantacion> lstPlant = new ArrayList<Plantacion>();
		String sql = "SELECT * FROM PLANTACIONES";
		// pedir a la base de datos todas las plantaciones.
		ResultSet rs = gbd.executeSQL(sql);
		try {
			while (rs.next()) {
				int parcela = rs.getInt("PARCELA");
				Date fechaPlan = null;
				try {
					fechaPlan = sdf.parse(rs.getString("FECHA_PLAN"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String especie = rs.getString("ESPECIE");
				Date fechaRec = null;
				try {
					fechaRec = sdf.parse(rs.getString("FECHA_REC"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int cantPlant = rs.getInt("CANT_PLANT");
				int cantRec = rs.getInt("CANT_REC");
				// crear plantación
				Plantacion plant = new Plantacion(parcela, fechaPlan, fechaRec, especie, cantPlant);
				plant.setCantRec(cantRec);
				lstPlant.add(plant);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstPlant;
	}

	@Override
	public ArrayList<Plantacion> getPlanRecoger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getParcelas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getEspecies() {
		// TODO Auto-generated method stub
		return null;
	}

}