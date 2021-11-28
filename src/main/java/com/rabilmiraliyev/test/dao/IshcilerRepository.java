package com.rabilmiraliyev.test.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.Ishciler;

import projection.FullIstifadeciler;
import projection.IshcilerIdAndName;
import projection.IshcilerIdAndNameCompNew;
import projection.MaxUsersCity;
import projection.SameComp;
import projection.StatsCity;

@Repository
public interface IshcilerRepository extends JpaRepository<Ishciler, Long> {
	List<Ishciler> findAll();
//	Ishciler findById(Long id);
//	void create (Ishciler ishciler);
//	Ishciler update(Ishciler ishciler);
//	void delete(Long id);
	
	@Query(nativeQuery = true,value="select ischi_adi, city_name,comp_name from adlar ")
	List<FullIstifadeciler> getData();
	
	@Query(nativeQuery = true,value = "Select ish.ad ishci_adi , ish.id ishci_id from ISHCILER ish")
	List<IshcilerIdAndName> getIdName();
	
	@Query(nativeQuery = true,value = "select ad ishci_adi,id ishci_id from ishciler where id not in (select ishciler_id from computers)")
	List<IshcilerIdAndNameCompNew> getIdAndNameCompNew();
	
	@Query(nativeQuery = true,value = "select name1 ,  stats_city,  stats_totalusers from stats1")
	List<StatsCity> getStatsCity();
	
	@Query(nativeQuery = true,value = "select name1, stats_city , max(stats_totalusers) as max_value from stats1")
	List<MaxUsersCity> getMaxUsersCity();
	
	@Query(nativeQuery = true,value = "select name, ishciler_id , ishci_ad from samecomp1")
	List<SameComp> getSameComp();
	
}
