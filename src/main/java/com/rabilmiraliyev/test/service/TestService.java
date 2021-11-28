package com.rabilmiraliyev.test.service;

import java.util.List;

import com.rabilmiraliyev.test.exception.IshcilerNotFoundException;
import com.rabilmiraliyev.test.model.Ishciler;

import projection.FullIstifadeciler;
import projection.IshcilerIdAndName;
import projection.IshcilerIdAndNameCompNew;
import projection.MaxUsersCity;
import projection.SameComp;
import projection.StatsCity;

public interface TestService {
	List<Ishciler> findIshciler();
	Ishciler findIshciler(Long id) throws IshcilerNotFoundException;
	void createIshciler(Ishciler ishciler);
	void update(Ishciler ishciler);
	void deleteIshciler(Long id);
	List<FullIstifadeciler> getData();
	List<IshcilerIdAndName> getIdAndName();
	List<IshcilerIdAndNameCompNew> getIdAndNameCompNew();
	List<StatsCity> getStatsCity();
	List<MaxUsersCity> getMaxUsersCity();
	List<SameComp> getSameComp();
}
