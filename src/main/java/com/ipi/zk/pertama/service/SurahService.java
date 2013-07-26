package com.ipi.zk.pertama.service;

import java.util.List;

import com.ipi.zk.pertama.bean.Surah;

/** @author Saifi Ahmada Jul 26, 2013 10:54:47 AM  **/

public interface SurahService {
	
	public void save(Surah surah);
	public void update(Surah surah);
	public void delete(Surah surah);
	public Surah findById(int noSurah);
	public List<Surah> findAll();
}

