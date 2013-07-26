package com.ipi.zk.pertama.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipi.zk.pertama.bean.Surah;

/** @author Saifi Ahmada Jul 26, 2013 10:51:41 AM  **/
@Repository
public class SurahDaoImpl implements SurahDao {

	@Autowired
	private SessionFactory sesfac;
	@Transactional(readOnly=false)
	public void save(Surah surah) {
		sesfac.getCurrentSession().save(surah);
	}
	@Transactional(readOnly=false)
	public void update(Surah surah) {
		sesfac.getCurrentSession().update(surah);
	}
	@Transactional(readOnly=false)
	public void delete(Surah surah) {
		sesfac.getCurrentSession().delete(surah);
	}
	@Transactional(readOnly=true)
	public Surah findById(int noSurah) {
		return (Surah) sesfac.getCurrentSession().get(Surah.class, noSurah); 
	}
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<Surah> findAll() {
		return sesfac.getCurrentSession().createQuery("from Surah").list();
	}
	
	
	
}

