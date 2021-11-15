package com.rabilmiraliyev.test.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.IshcilerRepository;
import com.rabilmiraliyev.test.exception.IshcilerNotFoundException;
import com.rabilmiraliyev.test.model.Ishciler;

import projection.FullIstifadeciler;
import projection.IshcilerIdAndName;
import projection.IshcilerIdAndNameCompNew;

@Service
public class TestServiceImpl implements TestService {
	
	
	@Autowired
	private IshcilerRepository ishcilerRepository;
	
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
	public Ishciler findIshciler(Long id) throws IshcilerNotFoundException {
		Ishciler ishciler = ishcilerRepository.getOne(id);
		if(ishciler == null) throw new IshcilerNotFoundException("Bu id-də işçi tapılmadı"+ id);
		return ishciler;
	}

	@Override
	public void createIshciler(Ishciler ishciler) {
		System.out.println("test"+ishciler.getDogumTarixi());
		if(ishciler.getDogumTarixi()==null)
			ishciler.setDogumTarixi(new Date());
	
		ishcilerRepository.save(ishciler);
		
			
	}

	@Override
	public void update(Ishciler ishciler) {
		ishcilerRepository.save(ishciler);

	}

	@Override
	public void deleteIshciler(Long id) {
		ishcilerRepository.deleteById(id);

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

}
