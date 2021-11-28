package com.rabilmiraliyev.test.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.IshcilerRepository;
import com.rabilmiraliyev.test.exception.IshcilerNotFoundException;
import com.rabilmiraliyev.test.model.Ishciler;

import projection.FullIstifadeciler;
import projection.IshcilerIdAndName;
import projection.IshcilerIdAndNameCompNew;
import projection.MaxUsersCity;
import projection.SameComp;
import projection.StatsCity;

@Service
public class TestServiceImpl implements TestService {
	
	
	@Autowired
	private IshcilerRepository ishcilerRepository;
//	@Autowired
//	private ComputerRepository computerRepository;
	
//	@Autowired
//	public void setIshcilerRepository(IshcilerRepository ishcilerRepository) {
//		this.ishcilerRepository = ishcilerRepository;
//	}
	

	@Override
	public List<Ishciler> findIshciler() {
		// TODO Auto-generated method stub
		return ishcilerRepository.findAll();
	}

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public Ishciler findIshciler(Long id) throws IshcilerNotFoundException {
		Ishciler ishciler = ishcilerRepository.getOne(id);
		if(ishciler == null) throw new IshcilerNotFoundException("Bu id-də işçi tapılmadı"+ id);
		return ishciler;
	}

	@Override
	@Secured("ROLE_ADMIN")
	public void createIshciler(Ishciler ishciler) {
		System.out.println("test"+ishciler.getDogumTarixi());
		if(ishciler.getDogumTarixi()==null)
			ishciler.setDogumTarixi(new Date());
	
		ishcilerRepository.save(ishciler);	
	}

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public void update(Ishciler ishciler) {
		ishcilerRepository.save(ishciler);

	}

	@Override
	@Secured("ROLE_ADMIN")
	public void deleteIshciler(Long id) {
		ishcilerRepository.deleteById(id);
	//	computerRepository.deleteById(id);

	}
	
	@Override
	public List<FullIstifadeciler> getData() {
		
		List<FullIstifadeciler> lists=ishcilerRepository.getData();
		return lists;
	}

	@Override
	public List<IshcilerIdAndName> getIdAndName() {
		List<IshcilerIdAndName> lists=ishcilerRepository.getIdName();
		return lists;
	}

	@Override
	public List<IshcilerIdAndNameCompNew> getIdAndNameCompNew() {
		List<IshcilerIdAndNameCompNew> lists=ishcilerRepository.getIdAndNameCompNew();
		return lists;
	}

	@Override
	public List<StatsCity> getStatsCity() {
		List<StatsCity> lists=ishcilerRepository.getStatsCity();
		return lists;
	}

	@Override
	public List<MaxUsersCity> getMaxUsersCity() {
		List<MaxUsersCity> lists = ishcilerRepository.getMaxUsersCity();
		return lists;
	}

	@Override
	public List<SameComp> getSameComp() {
		List<SameComp> lists = ishcilerRepository.getSameComp();
		return lists;
	}

}
