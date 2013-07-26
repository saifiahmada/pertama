package com.ipi.zk.pertama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.ipi.zk.pertama.bean.Surah;
import com.ipi.zk.pertama.dao.SurahDao;

/** @author Saifi Ahmada Jul 26, 2013 10:55:09 AM  **/
@Service("surahService")
@Scope(value="singleton", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class SurahServiceImpl implements SurahService {

	@Autowired
	private SurahDao surahDao;
	
	public void save(Surah surah) {
		surahDao.save(surah);
	}

	public void update(Surah surah) {
		surahDao.update(surah);
	}

	public void delete(Surah surah) {
		surahDao.delete(surah);
	}

	public Surah findById(int noSurah) {
		return surahDao.findById(noSurah); 
	}

	public List<Surah> findAll() {
		return surahDao.findAll();
	}

}

