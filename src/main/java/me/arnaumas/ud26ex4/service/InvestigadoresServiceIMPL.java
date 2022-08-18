package me.arnaumas.ud26ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud26ex4.dao.IInvestigadoresDAO;
import me.arnaumas.ud26ex4.dto.Investigador;


@Service
public class InvestigadoresServiceIMPL implements IInvestigadoresService{

	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;

	@Override
	public List<Investigador> listarInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigadores(Investigador Investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(Investigadores);
	}

	@Override
	public Investigador InvestigadoresXID(int id) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigador actualizarInvestigadores(Investigador Investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(Investigadores);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		// TODO Auto-generated method stub
		iInvestigadoresDAO.deleteById(id);
	}
	
}
