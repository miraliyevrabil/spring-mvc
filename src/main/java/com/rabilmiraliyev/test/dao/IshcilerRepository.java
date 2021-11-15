package com.rabilmiraliyev.test.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.Ishciler;

import projection.FullIstifadeciler;
import projection.IshcilerIdAndName;
import projection.IshcilerIdAndNameCompNew;

@Repository
public interface IshcilerRepository extends JpaRepository<Ishciler, Long> {
	List<Ishciler> findAll();
//	Ishciler findById(Long id);
//	void create (Ishciler ishciler);
//	Ishciler update(Ishciler ishciler);
//	void delete(Long id);
	
	@Query(nativeQuery = true,value="select ist.ad ischi_adi,ct.name1 city_name,co.name comp_name from ISHCILER ist\r\n" + 
			"        left join city ct on ct.id=ist.city_id\r\n" + 
			"        left join computers co on co.ishciler_id=ist.id")
	List<FullIstifadeciler> getData();
	
	@Query(nativeQuery = true,value = "Select ish.ad ishci_adi , ish.id ishci_id from ISHCILER ish")
	List<IshcilerIdAndName> getIdName();
	
	@Query(nativeQuery = true,value = "select ad ishci_adi,id ishci_id from ishciler where id not in (select ishciler_id from computers)")
	List<IshcilerIdAndNameCompNew> getIdAndNameCompNew();
}
