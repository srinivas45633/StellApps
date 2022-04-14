package com.StellApps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StellApps.dao.IDairyDAO;
import com.StellApps.model.Dairy;
@Service
public class DairyServices implements IDairyServices {
	@Autowired
private IDairyDAO dairyDAO;
	@Override
	public List<Dairy> fetchAllDairyServices() {
		return dairyDAO.findAll();
	}

}
